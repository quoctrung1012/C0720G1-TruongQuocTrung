package libs;

import commons.ConvertUtils;
import commons.FileUtils;
import commons.Validate;
import exceptions.*;
import models.Customer;
import models.Services;

import java.util.List;
import java.util.Scanner;

public class AddInformation {
    public static final Scanner scanner = new Scanner(System.in);
    public static String VILLA = "villa";
    public static String HOUSE = "house";
    public static String ROOM = "room";
    public static String CUSTOMER = "customer";
    public static String BOOKING = "booking";
    public static String EMPLOYEE = "employee";

    public static void addNewService(String fileName) {
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
    public static void addNewCustomer(String fileName) {

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
    public static void addNewBooking() {
        List<Customer> customerList = ReadAndShowInformation.readAllCustomer(CUSTOMER);
        ReadAndShowInformation.showInformationCustomers(CUSTOMER);
        System.out.println("Please customer choose from 1 -3 booking services resort: ");
        int inputCustomer = Integer.parseInt(scanner.nextLine());
        System.out.println("-------------------------------------");
        System.out.print(
                "\tInput number from 1 to 3\n" +
                        "1.\tBooking Villa\n" +
                        "2.\tBooking House\n" +
                        "3.\tBooking Room\n");
        System.out.println("-------------------------------------");
        System.out.print("\tInput number your choice: ");
        List<Services> servicesList = null;
        int typeServices = Integer.parseInt(scanner.nextLine());
        switch (typeServices) {
            case 1:
                servicesList = ReadAndShowInformation.readAllServices(VILLA);
                ReadAndShowInformation.showAllServices(VILLA);
                break;
            case 2:
                servicesList = ReadAndShowInformation.readAllServices(HOUSE);
                ReadAndShowInformation.showAllServices(HOUSE);
                break;
            case 3:
                servicesList = ReadAndShowInformation.readAllServices(ROOM);
                ReadAndShowInformation.showAllServices(ROOM);
                break;
//            case 4:
//                displayMainMenu();
//                break;
//            case 5:
//                System.exit(0);
//                break;
            default:
                System.out.println("\tPlease again input number!!");
                Main.displayMainMenu();
        }
        int inputServices = Integer.parseInt(scanner.nextLine());

        Customer customer = customerList.get(inputCustomer - 1);
        customer.setServices(servicesList.get(inputServices - 1));
        FileUtils.setFullPathFile(BOOKING);
        FileUtils.writeFile(new String[]{customer.toString()});
        System.out.println("Booking is done!!!" +
                "\n-------------------------------------");
    }
}
