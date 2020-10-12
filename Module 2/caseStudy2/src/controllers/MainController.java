package controllers;

import commons.*;
import exceptions.*;
import models.*;

import java.util.*;

public class MainController {

    public static String VILLA = "villa";
    public static String HOUSE = "house";
    public static String ROOM = "room";
    public static String CUSTOMER = "customer";
    public static String BOOKING = "booking";
    public static String EMPLOYEE = "employee";
    public static int choose;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            try {
                displayMainMenu();
            } catch (NumberFormatException e) {
                System.err.println("Input Number not Input String!!!");
            }
        } while (true);
    }

    public static void displayMainMenu() {
        do {
            System.out.println("-------------------------------------");
            System.out.print(
                    "\tInput number from 1 to 7\n" +
                            "1.\tAdd New Services\n" +
                            "2.\tShow Services\n" +
                            "3.\tAdd New Customer\n" +
                            "4.\tShow Information of Customer\n" +
                            "5.\tAdd New Booking\n" +
                            "6.\tShow Information of Employee\n" +
                            "7.\tShow Movie Ticket List\n" +
                            "8.\tFind Employee Information In File Cabinets\n" +
                            "9.\tSearch\n" +
                            "10.\tExit\n");
            System.out.println("-------------------------------------");
            System.out.print("\tInput number your choice: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    addNewServices();
                    break;
                case 2:
                    showServices();
                    break;
                case 3:
                    addNewCustomer(CUSTOMER);
                    break;
                case 4:
                    showInformationCustomers(CUSTOMER);
                    break;
                case 5:
                    addNewBooking();
                    break;
                case 6:
                    showInformationOfEmployee();
                    break;
                case 7:
                    showMovieTicketList();
                    break;
                case 8:
                    FilingCabinets.findEmployeeInformationInFileCabinets();
                    break;
                case 9:
                    searchCustomer();
                    break;
                case 10:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\tPlease again input number!!");
                    displayMainMenu();
            }
        } while (choose >= 1 && choose <= 9);
    }

    public static void addNewServices() {
        do {
            System.out.println("-------------------------------------");
            System.out.print(
                    "\tInput number from 1 to 5 \n" +
                            "1.\tAdd New Villa\n" +
                            "2.\tAdd New House\n" +
                            "3.\tAdd New Room\n" +
                            "4.\tBack to menu\n" +
                            "5.\tExit\n");
            System.out.println("-------------------------------------");
            System.out.print("\tInput number choose service to add: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    addNewService(VILLA);
                    break;
                case 2:
                    addNewService(HOUSE);
                    break;
                case 3:
                    addNewService(ROOM);
                    break;
                case 4:
                    displayMainMenu();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\tPlease again input number!!");
                    addNewServices();
            }
        } while (choose >= 1 && choose <= 5);
    }

    private static void showServices() {
        do {
            System.out.println("-------------------------------------");
            System.out.print(
                    "\tInput number from 1 to 8 \n" +
                            "1.\tShow all Villa\n" +
                            "2.\tShow all House\n" +
                            "3.\tShow all Room\n" +
                            "4.\tShow All Name Villa Not Duplicate\n" +
                            "5.\tShow All Name House Not Duplicate\n" +
                            "6.\tShow All Name Room Not Duplicate\n" +
                            "7.\tBack to Menu\n" +
                            "8.\tExit\n");
            System.out.println("-------------------------------------");
            System.out.print("\tInput number your choice: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    showAllServices(VILLA);
                    break;
                case 2:
                    showAllServices(HOUSE);
                    break;
                case 3:
                    showAllServices(ROOM);
                    break;
                case 4:
                    showAllNameServicesNotDuplicate(VILLA);
                    break;
                case 5:
                    showAllNameServicesNotDuplicate(HOUSE);
                    break;
                case 6:
                    showAllNameServicesNotDuplicate(ROOM);
                    break;
                case 7:
                    displayMainMenu();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\tPlease again input number!!");
                    showServices();
            }
        } while (choose >= 1 && choose <= 8);
    }

    private static void addNewBooking() {
        List<Customer> customerList = readAllCustomer(CUSTOMER);
        showInformationCustomers(CUSTOMER);

        System.out.print("Please choose customer booking services resort: ");
        int inputCustomer = Integer.parseInt(scanner.nextLine());
        System.out.println("-------------------------------------");
        System.out.print(
                "\tInput number from 1 to 3\n" +
                        "1.\tBooking Villa\n" +
                        "2.\tBooking House\n" +
                        "3.\tBooking Room\n");
        System.out.println("-------------------------------------");
        System.out.print("\tInput number your choice: ");
        int inputTypeServices = Integer.parseInt(scanner.nextLine());
        List<Services> servicesList = null;
        switch (inputTypeServices) {
            case 1:
                servicesList = readAllServices(VILLA);
                showAllServices(VILLA);
                break;
            case 2:
                servicesList = readAllServices(HOUSE);
                showAllServices(HOUSE);
                break;
            case 3:
                servicesList = readAllServices(ROOM);
                showAllServices(ROOM);
                break;
            case 4:
                displayMainMenu();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("\tPlease again input number!!");
                displayMainMenu();
        }
        System.out.print("Please choose service to booking: ");
        int inputServices = Integer.parseInt(scanner.nextLine());

        Customer customer = customerList.get(inputCustomer - 1);
        customer.setServices(servicesList.get(inputServices - 1));

        FileUtils.setFullPathFile(BOOKING);
        FileUtils.writeFile(new String[]{customer.toString()});
        System.out.println("Booking is done!!!" +
                "\n-------------------------------------");
    }

    private static void addNewService(String fileName) {
        String id;
        String nameService = null;
        double useArea = 0;
        double rentalCosts = 0;
        int maximumNumberOfPeople = 0;
        String rentalType = null;
        do {
            System.out.print("Please input service id: ");
            id = scanner.nextLine();
        } while (!Validate.isValidServiceCode(id, Validate.SERVICE_CODE_REGEX));

        do {
            System.out.print("Please input service name: ");
            nameService = scanner.nextLine();
        } while (!Validate.isValidRegexName(nameService, Validate.SERVICE_NAME_REGEX));

        do {
            System.out.print("Please input area use: ");
            useArea = Double.parseDouble(scanner.nextLine());
        } while (!Validate.isMoreThan(useArea, 30));

        do {
            System.out.print("Please input rent cost: ");
            rentalCosts = Double.parseDouble(scanner.nextLine());
        } while (!Validate.isMoreThan(rentalCosts, 0));

        do {
            System.out.print("Please input number of people: ");
            maximumNumberOfPeople = Integer.parseInt(scanner.nextLine());
        } while (!Validate.isMoreThan(maximumNumberOfPeople, 0, 20));

        do {
            System.out.print("Please input type rent: ");
            rentalType = scanner.nextLine();
        } while (!Validate.isValidRegexName(rentalType, Validate.SERVICE_NAME_REGEX));

        FileUtils.setFullPathFile(fileName);

        if (fileName.equals(VILLA)) {

            String standardRoom = null;
            String descriptionOfOtherAmenities = null;
            double swimmingPoolArea = 0;
            int numberOfFloors = 0;

            do {
                System.out.print("Please input standard room: ");
                standardRoom = scanner.nextLine();
            } while (!Validate.isValidRegexName(standardRoom, Validate.SERVICE_NAME_REGEX));

            do {
                System.out.print("Please input description of other amenities: ");
                descriptionOfOtherAmenities = scanner.nextLine();
            } while (!Validate.isValidRegexName(descriptionOfOtherAmenities, Validate.SERVICE_NAME_REGEX));

            do {
                System.out.print("Please input number swimming pool area: ");
                swimmingPoolArea = Double.parseDouble(scanner.nextLine());
            } while (!Validate.isMoreThan(swimmingPoolArea, 30));

            do {
                System.out.print("Please input number of floors: ");
                numberOfFloors = Integer.parseInt(scanner.nextLine());
            } while (!Validate.isMoreThan(numberOfFloors, 0));

            FileUtils.writeFile(new String[]{id, nameService, String.valueOf(useArea), String.valueOf(rentalCosts), String.valueOf(maximumNumberOfPeople),
                    rentalType, standardRoom, descriptionOfOtherAmenities, String.valueOf(swimmingPoolArea), String.valueOf(numberOfFloors)});

        } else if (fileName.equals(HOUSE)) {

            String standardRoom = null;
            int numberOfFloors = 0;
            do {
                System.out.print("Please input standard room: ");
                standardRoom = scanner.nextLine();
            } while (!Validate.isValidRegexName(standardRoom, Validate.SERVICE_NAME_REGEX));

            System.out.print("Please input description of other amenities: ");
            String descriptionOfOtherAmenities = scanner.nextLine();

            do {
                System.out.print("Please input number of floors: ");
                numberOfFloors = Integer.parseInt(scanner.nextLine());
            } while (!Validate.isMoreThan(numberOfFloors, 0));

            FileUtils.writeFile(new String[]{id, nameService, String.valueOf(useArea), String.valueOf(rentalCosts), String.valueOf(maximumNumberOfPeople), rentalType,
                    standardRoom, descriptionOfOtherAmenities, String.valueOf(numberOfFloors)});

        } else if (fileName.equals(ROOM)) {
            String nameExtraServices = null;
            double priceExtraServices = 0;
            do {
                System.out.print("Please input name extra services");
                nameExtraServices = scanner.nextLine();
            } while (!Validate.isValidExtraService(nameExtraServices));

            System.out.print("Please input amount extra services");
            int amountExtraServices = Integer.parseInt(scanner.nextLine());

            do {
                System.out.print("Please input number price extra services");
                priceExtraServices = Double.parseDouble(scanner.nextLine());
            } while (!Validate.isMoreThan(priceExtraServices, 0));

            FileUtils.writeFile(new String[]{id, nameService, String.valueOf(useArea), String.valueOf(rentalCosts), String.valueOf(maximumNumberOfPeople), rentalType,
                    nameExtraServices, String.valueOf(amountExtraServices), String.valueOf(priceExtraServices)});
        }
    }

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

    private static void showAllServices(String fileName) {
        System.out.println("-------------------------------------");
        System.out.println("List Services Resort " + fileName + ": ");
        List<Services> servicesList = readAllServices(fileName);
        Services services = null;
        for (int i = 0; i < servicesList.size(); i++) {
            services = servicesList.get(i);
            System.out.print("No."+(i + 1) + ": ");
            services.showInFor();
        }
    }

    private static void showAllNameServicesNotDuplicate(String fileName) {
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

    private static void showInformationOfEmployee() {
        Map<String, Employee> stringEmployeeMap = readAllFileEmployee(EMPLOYEE);

        System.out.println("-------------------------------------");
        System.out.println("List employee in resort: ");
        for (Map.Entry<String, Employee> employeeEntry : stringEmployeeMap.entrySet()) {
            System.out.println("Key: " + employeeEntry.getKey() + "\n" + employeeEntry.getValue().toString());

        }
    }

    private static List<Customer> readAllCustomer(String fileName) {
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

    private static void showInformationCustomers(String fileName) {
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

    private static void addNewCustomer(String fileName) {

        String fullName;
        String dateOfBirth;
        String genderCustomer;
        String numberIdCard;
        String phoneNumber;
        String emailCustomer;
        String typeOfCustomer;
        String addressCustomer;

        boolean flag;

        do {
            flag = true;
            System.out.print("Please input full name: ");
            fullName = scanner.nextLine();

            try {
                Validate.isValidFullName(fullName);
            } catch (NameException e) {
                flag = false;
                e.printStackTrace();
            }
        } while (!flag);

        do {
            flag = true;
            System.out.print("Please input date of birth: ");
            dateOfBirth = scanner.nextLine();

            try {
                Validate.isValidBirthday(dateOfBirth);
            } catch (BirthdayException e) {
                flag = false;
                e.printStackTrace();
            }
        } while (!flag);

        do {
            flag = true;
            System.out.print("Please input gender customer: ");
            genderCustomer = scanner.nextLine();
            try {
                Validate.isValidGender(genderCustomer);
            } catch (GenderException e) {
                flag = false;
                e.printStackTrace();
            }
        } while (!flag);
        genderCustomer = ConvertUtils.normalizeString(genderCustomer);

        do {
            flag = true;
            System.out.print("Please input number id card: ");
            numberIdCard = scanner.nextLine();

            try {
                Validate.isValidIdCard(numberIdCard);
            } catch (IdCardException e) {
                flag = false;
                e.printStackTrace();
            }
        } while (!flag);

        System.out.print("Please input phone number: ");
        phoneNumber = scanner.nextLine();

        do {
            flag = true;
            System.out.print("Please input email customer: ");
            emailCustomer = scanner.nextLine();

            try {
                Validate.isValidEmail(emailCustomer);
            } catch (EmailException e) {
                flag = false;
                e.printStackTrace();
            }
        } while (!flag);

        System.out.print("Please input type of customer: ");
        typeOfCustomer = scanner.nextLine();

        System.out.print("Please input address customer: ");
        addressCustomer = scanner.nextLine();

        FileUtils.setFullPathFile(fileName);
        FileUtils.writeFile(new String[]{fullName, dateOfBirth, genderCustomer, String.valueOf(numberIdCard), String.valueOf(phoneNumber), emailCustomer, typeOfCustomer, addressCustomer});
    }

    private static void showMovieTicketList() {
        Queue<Customer> customerQueue = new LinkedList<>();
        List<Customer> customerList = readAllCustomer(CUSTOMER);
        showInformationCustomers(CUSTOMER);

        //System.out.println("Please input number customer buy ticket: ");
        //int numberCustomerBuyTicket = scanner.nextInt();

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

    private static void searchCustomer() {
        System.out.print("Please input number id card: ");
        String valueIdCardCustomer = scanner.nextLine();

        List<Customer> customerList = readAllCustomer(CUSTOMER);
        for (int i = 0; i < customerList.size(); i++) {
//            boolean idCardTest = ;
            if (valueIdCardCustomer.equals(customerList.get(i).getNumberIdCard())) {
                System.out.println(customerList.get(i).toString());
            } else {
                System.out.println("Not found");
            }
        }

    }
}

