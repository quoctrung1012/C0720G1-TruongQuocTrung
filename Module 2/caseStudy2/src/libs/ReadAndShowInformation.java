package libs;

import commons.FileUtils;
import commons.StringUtils;
import models.*;

import java.util.*;

public class ReadAndShowInformation {
    public static final Scanner scanner = new Scanner(System.in);
    public static String VILLA = "villa";
    public static String HOUSE = "house";
    public static String ROOM = "room";
    public static String CUSTOMER = "customer";
    public static String BOOKING = "booking";
    public static String EMPLOYEE = "employee";


    public static List<Services> readAllServices(String fileName) {
        FileUtils.setFullPathFile(fileName);
        List<String> propertiesService = FileUtils.readFile();
        List<Services> servicesList = new ArrayList<>();

        String[] propertiesElement = null;
        Services services = null;
        ExtraServices extraServices = null;

        for (String properties : propertiesService) {
            propertiesElement = properties.split(StringUtils.COMMA);

            if (fileName.equals(VILLA)) {
                services = new Villa();
                ((Villa) services).setStandardRoom(propertiesElement[6]);
                ((Villa) services).setDescriptionOfOtherAmenities(propertiesElement[7]);
                ((Villa) services).setSwimmingPoolArea(Double.parseDouble(propertiesElement[8]));
                ((Villa) services).setNumberOfFloors(Integer.parseInt(propertiesElement[9]));

            } else if (fileName.equals(HOUSE)) {
                services = new House();
                ((House) services).setStandardRoom(propertiesElement[6]);
                ((House) services).setDescriptionOfOtherAmenities(propertiesElement[7]);
                ((House) services).setNumberOfFloors(Integer.parseInt(propertiesElement[8]));

            } else if (fileName.equals(ROOM)) {
                extraServices = new ExtraServices(propertiesElement[6], propertiesElement[7], Double.parseDouble(propertiesElement[8]));
                services = new Room();
                ((Room) services).setExtraServices(extraServices);
            }
            services.setId(propertiesElement[0]);
            services.setNameService(propertiesElement[1]);
            services.setUseArea(Double.parseDouble(propertiesElement[2]));
            services.setRentalCosts(Double.parseDouble(propertiesElement[3]));
            services.setMaximumNumberOfPeople(Integer.parseInt(propertiesElement[4]));
            services.setRentalType(propertiesElement[5]);

            servicesList.add(services);
        }
        return servicesList;
    }

    public static void showAllServices(String fileName) {
        System.out.println("-------------------------------------");
        System.out.println("List Services Resort " + fileName + ": ");
        List<Services> servicesList = readAllServices(fileName);
        Services services = null;
        for (int i = 0; i < servicesList.size(); i++) {
            services = servicesList.get(i);
            System.out.println((i + 1) + ". ");
            services.showInFor();
        }
    }

    public static void showAllNameServicesNotDuplicate(String fileName) {
        Set<String> setServices = new TreeSet<>();

        System.out.println("-------------------------------------");
        System.out.println("List Services Resort " + fileName + " Not Duplicate: ");
        for (Services services : readAllServices(fileName)) {
            setServices.add(services.getNameService());
        }
        for (String name : setServices) {
            System.out.println(name);
        }
    }

    public static Map<String, Employee> readAllFileEmployee(String fileName) {
        FileUtils.setFullPathFile(fileName);
        List<String> propertiesEmployee = FileUtils.readFile();
        Map<String, Employee> stringEmployeeMap = new HashMap<>();
        String[] arrayPropertiesEmployee = null;
        Employee employee = null;
        for (String properties : propertiesEmployee) {
            arrayPropertiesEmployee = properties.split(StringUtils.COMMA);
            employee = new Employee();
            employee.setIdEmployee(arrayPropertiesEmployee[0]);
            employee.setFullNameEmployee(arrayPropertiesEmployee[1]);
            employee.setAgeEmployee(arrayPropertiesEmployee[2]);
            employee.setAddressEmployee(arrayPropertiesEmployee[3]);

            stringEmployeeMap.put(employee.getIdEmployee(), employee);
        }
        return stringEmployeeMap;
    }

    public static void showInformationOfEmployee() {
        Map<String, Employee> stringEmployeeMap = readAllFileEmployee(EMPLOYEE);

        System.out.println("-------------------------------------");
        System.out.println("List employee in resort: ");
        for (Map.Entry<String, Employee> employeeEntry : stringEmployeeMap.entrySet()) {
            System.out.println("Key: " + employeeEntry.getKey() + "\n" + employeeEntry.getValue().toString());

        }
    }

    public static List<Customer> readAllCustomer(String fileName) {
        FileUtils.setFullPathFile(fileName);
        List<String> propertiesCustomer = FileUtils.readFile();
        List<Customer> customerList = new ArrayList<>();

        String[] arrayPropertiesCustomer = null;
        Customer customer = null;
        for (String properties : propertiesCustomer) {
            arrayPropertiesCustomer = properties.split(StringUtils.COMMA);
            customer = new Customer();
            customer.setFullName(arrayPropertiesCustomer[0]);
            customer.setDateOfBirth(arrayPropertiesCustomer[1]);
            customer.setGenderCustomer(arrayPropertiesCustomer[2]);
            customer.setNumberIdCard(arrayPropertiesCustomer[3]);
            customer.setPhoneNumber(arrayPropertiesCustomer[4]);
            customer.setEmailCustomer(arrayPropertiesCustomer[5]);
            customer.setTypeOfCustomer(arrayPropertiesCustomer[6]);
            customer.setAddressCustomer(arrayPropertiesCustomer[7]);

            customerList.add(customer);

        }
        Collections.sort(customerList);
        return customerList;
    }

    public static void showInformationCustomers(String fileName) {
        System.out.println("-------------------------------------");
        System.out.println("List Customer Resort " + fileName + ": ");

        List<Customer> customerList = readAllCustomer(fileName);
        Customer customer = null;
        for (int i = 0; i < customerList.size(); i++) {
            customer = customerList.get(i);
            System.out.println("No." + (i + 1) + ". ");
            customer.showInFor();
        }
    }

    public static void showMovieTicketList() {
        Queue<Customer> customerQueue = new LinkedList<>();
        List<Customer> customerList = readAllCustomer(CUSTOMER);
        showInformationCustomers(CUSTOMER);

        customerQueue.add(customerList.get(5));
        customerQueue.add(customerList.get(3));
        customerQueue.add(customerList.get(7));
        customerQueue.add(customerList.get(1));

        Customer customer = null;
        System.out.println("-------------------------------------");
        System.out.println("List customer buy ticket: ");
        while (!customerQueue.isEmpty()) {
            customer = customerQueue.poll();
            customer.showInFor();
        }
    }
}
