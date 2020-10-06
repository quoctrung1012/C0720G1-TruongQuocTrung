package controllers;

import commons.*;
import exceptions.*;
import models.*;

import java.util.*;

public class MainController {

    public static String VILLA = "Villa";
    public static String HOUSE = "House";
    public static String ROOM = "Room";
    public static String CUSTOMER = "Customer";
    public static int choose;
    public static final Scanner scanner = new Scanner(System.in);

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
                            "7.\tExit\n");
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
                    System.exit(0);
                    break;
                default:
                    System.out.println("\tPlease again input number!!");
                    displayMainMenu();
            }
        } while (choose >= 1 && choose <= 7);
    }

    private static void addNewServices() {
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
                    addNewServices();
                    break;
                case 2:
                    addNewService(HOUSE);
                    addNewServices();
                    break;
                case 3:
                    addNewService(ROOM);
                    addNewServices();
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

    private static void addNewService(String fileName) {
        String id;
        do {
            System.out.print("Please input service id: ");
            id = scanner.nextLine();
        } while (!Validate.isValidServiceCode(id, Validate.SERVICE_CODE_REGEX));

        String nameService;
        do {
            System.out.print("Please input service name: ");
            nameService = scanner.nextLine();
        } while (!Validate.isValidRegexName(nameService, Validate.SERVICE_NAME_REGEX));

        double useArea;
        do {
            System.out.print("Please input area use: ");
            useArea = Double.parseDouble(scanner.nextLine());
        } while (!Validate.isMoreThan(useArea, 30));

        double rentalCosts;
        do {
            System.out.print("Please input rent cost: ");
            rentalCosts = Double.parseDouble(scanner.nextLine());
        } while (!Validate.isMoreThan(rentalCosts, 0));

        int maximumNumberOfPeople = 0;
        do {
            System.out.print("Please input number of people: ");
            maximumNumberOfPeople = Integer.parseInt(scanner.nextLine());
        } while (!Validate.isMoreThan(maximumNumberOfPeople, 0, 20));

        String rentalType;
        do {
            System.out.print("Please input type rent: ");
            rentalType = scanner.nextLine();
        } while (!Validate.isValidRegexName(rentalType, Validate.SERVICE_NAME_REGEX));

        FileUtils.setFullPathFile(fileName);
        if (fileName.equals(VILLA)) {

            String standardRoom;
            do {
                System.out.print("Please input standard room: ");
                standardRoom = scanner.nextLine();
            } while (!Validate.isValidRegexName(standardRoom, Validate.SERVICE_NAME_REGEX));

            String descriptionOfOtherAmenities;
            do {
                System.out.print("Please input description of other amenities: ");
                descriptionOfOtherAmenities = scanner.nextLine();
            } while (!Validate.isValidRegexName(descriptionOfOtherAmenities, Validate.SERVICE_NAME_REGEX));

            double swimmingPoolArea;
            do {
                System.out.print("Please input number swimming pool area: ");
                swimmingPoolArea = Double.parseDouble(scanner.nextLine());
            } while (!Validate.isMoreThan(swimmingPoolArea, 30));

            int numberOfFloors;
            do {
                System.out.print("Please input number of floors: ");
                numberOfFloors = Integer.parseInt(scanner.nextLine());
            } while (!Validate.isMoreThan(numberOfFloors, 0));

            FileUtils.writeFile(new String[]{id, nameService, String.valueOf(useArea), String.valueOf(rentalCosts), String.valueOf(maximumNumberOfPeople),
                    rentalType, standardRoom, descriptionOfOtherAmenities, String.valueOf(swimmingPoolArea), String.valueOf(numberOfFloors)});

        } else if (fileName.equals(HOUSE)) {

            String standardRoom;
            do {
                System.out.print("Please input standard room: ");
                standardRoom = scanner.nextLine();
            } while (!Validate.isValidRegexName(standardRoom, Validate.SERVICE_NAME_REGEX));

            System.out.print("Please input description of other amenities: ");
            String descriptionOfOtherAmenities = scanner.nextLine();

            int numberOfFloors = 0;
            do {
                System.out.print("Please input number of floors: ");
                numberOfFloors = Integer.parseInt(scanner.nextLine());
            } while (!Validate.isMoreThan(numberOfFloors, 0));

            FileUtils.writeFile(new String[]{id, nameService, String.valueOf(useArea), String.valueOf(rentalCosts), String.valueOf(maximumNumberOfPeople), rentalType,
                    standardRoom, descriptionOfOtherAmenities, String.valueOf(numberOfFloors)});

        } else if (fileName.equals(ROOM)) {

            String nameExtraServices;
            do {
                System.out.print("Please input name extra services");
                nameExtraServices = scanner.nextLine();
            } while (!Validate.isValidExtraService(nameExtraServices));

            System.out.print("Please input amount extra services");
            int amountExtraServices = Integer.parseInt(scanner.nextLine());

            double priceExtraServices;
            do {
                System.out.print("Please input number price extra services");
                priceExtraServices = Double.parseDouble(scanner.nextLine());
            } while (!Validate.isMoreThan(priceExtraServices, 0));

            FileUtils.writeFile(new String[]{id, nameService, String.valueOf(useArea), String.valueOf(rentalCosts), String.valueOf(maximumNumberOfPeople), rentalType,
                    nameExtraServices, String.valueOf(amountExtraServices), String.valueOf(priceExtraServices)});
        }
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
        for (Services services : readAllServices(fileName)) {
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

    private static void showInformationOfEmployee() {
    }

    private static void addNewBooking() {
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
            customer.setNumberIdCard(Integer.parseInt(arrayPropertiesCustomer[3]));
            customer.setPhoneNumber(Integer.parseInt(arrayPropertiesCustomer[4]));
            customer.setEmailCustomer(arrayPropertiesCustomer[5]);
            customer.setTypeOfCustomer(arrayPropertiesCustomer[6]);
            customer.setAddressCustomer(arrayPropertiesCustomer[7]);

            customerList.add(customer);

        }
        return customerList;
    }

    private static void showInformationCustomers(String fileName) {
        System.out.println("-------------------------------------");
        System.out.println("List Customer Resort " + fileName + ": ");
        for (Customer customer : readAllCustomer(fileName)) {
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

        FileUtils.writeFile(new String[]{fullName, dateOfBirth, genderCustomer, String.valueOf(numberIdCard), String.valueOf(phoneNumber), emailCustomer, typeOfCustomer, addressCustomer});

    }
}

