package controllers;

import commons.*;
import exception.*;
import models.*;

import java.util.*;

public class MainController {
    public static int choose;
    static Scanner scanner = new Scanner(System.in);
    static String id;
    static String nameService;
    static double useArea;
    static double rentalCosts;
    static int maximumNumberOfPeople;
    static String rentalType;
    static String standardRoom;
    static String descriptionOfOtherAmenities;
    static double swimmingPoolArea;
    static int numberOfFloors;
    static String nameExtraServices;
    static int amountExtraServices;
    static double priceExtraServices;

    public static final String FILE_NAME_VILLA = "src/data/villa.csv";
    public static final String FILE_NAME_HOUSE = "src/data/house.csv";
    public static final String FILE_NAME_ROOM = "src/data/room.csv";
    public static final String FILE_NAME_CUSTOMER = "src/data/customer.csv";
    public static final String FILE_NAME_EMPLOYEE = "src/data/employee.csv";
    public static final String COMMA = ",";

    public static ArrayList<Room> roomArrayList = new ArrayList<>();
    public static ArrayList<House> houseArrayList = new ArrayList<>();
    public static ArrayList<Villa> villaArrayList = new ArrayList<>();
    public static ArrayList<Customer> customerArrayList = new ArrayList<>();
    Map<String, Employee> employeeTreeMap = new TreeMap<>();

    public static void displayMainMenu() {
        do {
            System.out.println("-------------------------------------");
            System.out.print(
                    "\tBạn hãy chọn từ 1-7\n" +
                            "1.\tAdd New Services\n" +
                            "2.\tShow Services\n" +
                            "3.\tAdd New Customer\n" +
                            "4.\tShow Information of Customer\n" +
                            "5.\tAdd New Booking\n" +
                            "6.\tShow Information of Employee\n" +
                            "7.\tExit\n");
            System.out.println("-------------------------------------");
            System.out.print("Nhập sự lựa chọn của bạn: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    addNewServices();
                    break;
                case 2:
                    showServices();
                    break;
                case 3:
                    addNewCustomer();
                    break;
                case 4:
                    showInformationCustomers();
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
                    System.out.println("Yêu cầu nhập sự lựa chọn khác.");
                    displayMainMenu();
            }
        } while (choose >= 1 && choose <= 7);
    }

    public static void addNewServices() {
        do {
            System.out.println("-------------------------------------");
            System.out.print(
                    "\tBạn hãy chọn từ 1-5 \n" +
                            "1.\tAdd New Villa\n" +
                            "2.\tAdd New House\n" +
                            "3.\tAdd New Room\n" +
                            "4.\tBack to menu\n" +
                            "5.\tExit\n");
            System.out.println("-------------------------------------");
            System.out.print("Nhập sự lựa chọn của bạn: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    addNewVilla();
                    break;
                case 2:
                    addNewHouse();
                    break;
                case 3:
                    addNewRoom();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Yêu cầu nhập lại");
                    addNewServices();
            }
        } while (choose >= 1 && choose <= 5);
    }

    public static void addNewRoom() {
        do {
            System.out.print("Nhập id loại phòng thuê: ");
            id = scanner.nextLine();
        } while (!Validate.validateRoom(id, Validate.SERVICE_ROOM_REGEX));

        do {
            System.out.print("Nhập Tên dịch vụ: ");
            nameService = scanner.nextLine();
        } while (!Validate.isValidRegexString(nameService, Validate.SERVICE_STRING_REGEX));

        do {
            System.out.print("Nhập diện tích phòng(lớn hơn 30 mét vuông): ");
            useArea = Double.parseDouble(scanner.nextLine());
        } while (!Validate.isMoreThan(useArea, 30));

        do {
            System.out.print("Nhập chi phí thuê: ");
            rentalCosts = Double.parseDouble(scanner.nextLine());
        } while (!Validate.isMoreThan(useArea, 0));

        do {
            System.out.print("Nhập số người thuê( Tối đa 20 người): ");
            maximumNumberOfPeople = Integer.parseInt(scanner.nextLine());
        } while (!Validate.isMoreThanMid(maximumNumberOfPeople, 0, 20));

        do {
            System.out.print("Nhập kiểu thuê (Thuê theo : Ngày, tháng, năm, giờ): ");
            rentalType = scanner.nextLine();
        } while (!Validate.isTypeRents(rentalType, Validate.SERVICE_TYPE_RENTAL));

        do {
            System.out.print("Nhập tên dịch vụ đi kèm(Massage, Karaoke, Food, Drink, Car): ");
            nameExtraServices = scanner.nextLine();
        } while (!Validate.isExtraServices(nameExtraServices, Validate.EXTRA_SERVICE_REGEX));

        do {
            System.out.print("Nhập đơn vị dịch vụ đi kèm: ");
            amountExtraServices = Integer.parseInt(scanner.nextLine());
        } while (!Validate.isMoreThan(amountExtraServices, 0));

        do {
            System.out.print("Nhập giá tiền dịch vụ đi kèm: ");
            priceExtraServices = Double.parseDouble(scanner.nextLine());
        } while (!Validate.isMoreThan(priceExtraServices, 0));

        ExtraServices extraServices = new ExtraServices(nameExtraServices, amountExtraServices, priceExtraServices);

        Room room = new Room(id, nameService, useArea, rentalCosts, maximumNumberOfPeople, rentalType, extraServices);
        roomArrayList.add(room);
        String line = null;
        for (Room writeRoom : roomArrayList) {
            line = writeRoom.getId()
                    + COMMA + writeRoom.getNameService()
                    + COMMA + writeRoom.getUseArea()
                    + COMMA + writeRoom.getRentalCosts()
                    + COMMA + writeRoom.getMaximumNumberOfPeople()
                    + COMMA + writeRoom.getRentalType()
                    + COMMA + extraServices.getNameExtraServices()
                    + COMMA + extraServices.getAmountExtraServices()
                    + COMMA + extraServices.getPriceExtraServices();
            FileUtils.writeFile(FILE_NAME_ROOM, line);
        }
    }

    public static void addNewHouse() {
        do {
            System.out.print("Nhập id loại phòng thuê: ");
            id = scanner.nextLine();
        } while (!Validate.validateHouse(id, Validate.SERVICE_HOUSE_REGEX));

        do {
            System.out.print("Nhập Tên dịch vụ: ");
            nameService = scanner.nextLine();
        } while (!Validate.isValidRegexString(nameService, Validate.SERVICE_STRING_REGEX));

        do {
            System.out.print("Nhập diện tích phòng(lớn hơn 30 mét vuông): ");
            useArea = Double.parseDouble(scanner.nextLine());
        } while (!Validate.isMoreThan(useArea, 30));

        do {
            System.out.print("Nhập chi phí thuê: ");
            rentalCosts = Double.parseDouble(scanner.nextLine());
        } while (!Validate.isMoreThan(rentalCosts, 0));

        do {
            System.out.print("Nhập số người thuê( Tối đa 20 người): ");
            maximumNumberOfPeople = Integer.parseInt(scanner.nextLine());
        } while (!Validate.isMoreThanMid(maximumNumberOfPeople, 0, 20));

        do {
            System.out.print("Nhập kiểu thuê (Thuê theo : Ngày, tháng, năm, giờ): ");
            rentalType = scanner.nextLine();
        } while (!Validate.isTypeRents(rentalType, Validate.SERVICE_TYPE_RENTAL));

        do {
            System.out.print("Nhập Tiêu chuẩn phòng: ");
            standardRoom = scanner.nextLine();
        } while (!Validate.isQualityRents(standardRoom, Validate.SERVICE_QUALITY_RENTAL));

        do {
            System.out.print("Nhập tên dịch vụ đi kèm(Massage, Karaoke, Food, Drink, Car");
            descriptionOfOtherAmenities = scanner.nextLine();
        } while (!Validate.isExtraServices(descriptionOfOtherAmenities, Validate.EXTRA_SERVICE_REGEX));

        do {
            System.out.print("Số tầng của Villa: ");
            numberOfFloors = Integer.parseInt(scanner.nextLine());
        } while (!Validate.isMoreThan(numberOfFloors, 0));


        House house = new House(id, nameService, useArea, rentalCosts, maximumNumberOfPeople, rentalType,
                standardRoom, descriptionOfOtherAmenities, numberOfFloors);
        houseArrayList.add(house);

        String line = null;
        for (House writeHousr : houseArrayList) {
            line = writeHousr.getId()
                    + COMMA + writeHousr.getNameService()
                    + COMMA + writeHousr.getUseArea()
                    + COMMA + writeHousr.getRentalCosts()
                    + COMMA + writeHousr.getMaximumNumberOfPeople()
                    + COMMA + writeHousr.getRentalType()
                    + COMMA + writeHousr.getStandardRoom()
                    + COMMA + writeHousr.getDescriptionOfOtherAmenities()
                    + COMMA + writeHousr.getNumberOfFloors();
            FileUtils.writeFile(FILE_NAME_HOUSE, line);
        }
    }

    public static void addNewVilla() {
        do {
            System.out.print("Nhập id loại phòng thuê: ");
            id = scanner.nextLine();
        } while (!Validate.validateVilla(id, Validate.SERVICE_VILLA_REGEX));

        do {
            System.out.print("Nhập Tên dịch vụ: ");
            nameService = scanner.nextLine();
        } while (!Validate.isValidRegexString(nameService, Validate.SERVICE_STRING_REGEX));

        do {
            System.out.print("Nhập diện tích phòng(lớn hơn 30 mét vuông): ");
            useArea = Double.parseDouble(scanner.nextLine());
        } while (!Validate.isMoreThan(useArea, 30));

        do {
            System.out.print("Nhập chi phí thuê: ");
            rentalCosts = Double.parseDouble(scanner.nextLine());
        } while (!Validate.isMoreThan(rentalCosts, 0));

        do {
            System.out.print("Nhập số người thuê( Tối đa 20 người): ");
            maximumNumberOfPeople = Integer.parseInt(scanner.nextLine());
        } while (!Validate.isMoreThanMid(maximumNumberOfPeople, 0, 20));

        do {
            System.out.print("Nhập kiểu thuê (Thuê theo : Ngày, tháng, năm, giờ): ");
            rentalType = scanner.nextLine();
        } while (!Validate.isTypeRents(rentalType, Validate.SERVICE_TYPE_RENTAL));

        do {
            System.out.print("Nhập Tiêu chuẩn phòng: ");
            standardRoom = scanner.nextLine();
        } while (!Validate.isQualityRents(standardRoom, Validate.SERVICE_QUALITY_RENTAL));

        do {
            System.out.print("Nhập tên dịch vụ đi kèm(Massage, Karaoke, Food, Drink, Car");
            descriptionOfOtherAmenities = scanner.nextLine();
        } while (!Validate.isExtraServices(descriptionOfOtherAmenities, Validate.EXTRA_SERVICE_REGEX));

        do {
            System.out.print("Diện tích hồ bơi(lớn hơn 30 mét vuông): ");
            swimmingPoolArea = Double.parseDouble(scanner.nextLine());
        } while (!Validate.isMoreThan(swimmingPoolArea, 30));

        do {
            System.out.print("Số tầng của Villa: ");
            numberOfFloors = Integer.parseInt(scanner.nextLine());
        } while (!Validate.isMoreThan(numberOfFloors, 0));

        Villa villa = new Villa(id, nameService, useArea, rentalCosts, maximumNumberOfPeople, rentalType,
                standardRoom, descriptionOfOtherAmenities, swimmingPoolArea, numberOfFloors);

        villaArrayList.add(villa);

        String line = null;
        for (Villa writeVilla : villaArrayList) {
            line = writeVilla.getId()
                    + COMMA + writeVilla.getNameService()
                    + COMMA + writeVilla.getUseArea()
                    + COMMA + writeVilla.getRentalCosts()
                    + COMMA + writeVilla.getMaximumNumberOfPeople()
                    + COMMA + writeVilla.getRentalType()
                    + COMMA + writeVilla.getStandardRoom()
                    + COMMA + writeVilla.getDescriptionOfOtherAmenities()
                    + COMMA + writeVilla.getSwimmingPoolArea()
                    + COMMA + writeVilla.getNumberOfFloors();
            FileUtils.writeFile(FILE_NAME_VILLA, line);
        }
    }

    public static void showServices() {
        do {
            System.out.println("-------------------------------------");
            System.out.print(
                    "\tBạn hãy chọn từ 1-8 \n" +
                            "1.\tShow all Villa\n" +
                            "2.\tShow all House\n" +
                            "3.\tShow all Room\n" +
                            "4.\tShow All Name Villa Not Duplicate\n" +
                            "5.\tShow All Name House Not Duplicate\n" +
                            "6.\tShow All Name Room Not Duplicate\n" +
                            "7.\tBack to menu\n" +
                            "8.\tExit\n");
            System.out.println("-------------------------------------");
            System.out.print("Nhập sự lựa chọn của bạn: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    showAllVilla();
                    break;
                case 2:
                    showAllHouse();
                    break;
                case 3:
                    showAllRoom();
                    break;
                case 4:
                    showAllNameVillaNotDuplicate();
                    break;
                case 5:
                    showAllNameHouseNotDuplicate();
                    break;
                case 6:
                    showAllNameRoomNotDuplicate();
                    break;
                case 7:
                    displayMainMenu();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Yêu cầu nhập lại");
                    showServices();
            }
        } while (choose >= 1 && choose <= 8);
    }

    public static void showAllNameRoomNotDuplicate() {
        Set<String> setServicesRoom = new TreeSet<>();
        System.out.println("-------------------------------------");
        System.out.println("List Room Resort Room Not Duplicate: ");
        for (Room room : roomArrayList) {
            setServicesRoom.add(room.getNameService());
        }
        for (String room : setServicesRoom) {
            System.out.println(room);
        }
    }

    public static void showAllNameHouseNotDuplicate() {
        Set<String> setServicesHouse = new TreeSet<>();
        System.out.println("-------------------------------------");
        System.out.println("List House Resort Room Not Duplicate: ");
        for (House house : houseArrayList) {
            setServicesHouse.add(house.getNameService());
        }
        for (String houseString : setServicesHouse) {
            System.out.println(houseString);
        }
    }

    public static void showAllNameVillaNotDuplicate() {
        Set<String> setServicesHouse = new TreeSet<>();
        System.out.println("-------------------------------------");
        System.out.println("List House Resort Room Not Duplicate: ");
        for (Villa villa : villaArrayList) {
            setServicesHouse.add(villa.getNameService());
        }
        for (String villaString : setServicesHouse) {
            System.out.println(villaString);
        }
    }

    public static void showAllRoom() {
        System.out.println("-------------------------------------");
        List<String> stringListRoom = FileUtils.readFile(FILE_NAME_ROOM);
        int index = 1;
        for (String string : stringListRoom) {
//           System.out.println(string);
            String[] stringSplit = string.split(COMMA);
            Room room = new Room(stringSplit[0], stringSplit[1], Double.parseDouble(stringSplit[2]),
                    Double.parseDouble(stringSplit[3]), Integer.parseInt(stringSplit[4]), stringSplit[5],
                    new ExtraServices(stringSplit[6], Integer.parseInt(stringSplit[7]), Double.parseDouble(stringSplit[8])));
            roomArrayList.add(room);

            System.out.print("No." + index++ + ": ");
            room.showInFor();
        }
        System.out.println("-------------------------------------");
    }

    public static void showAllHouse() {
        System.out.println("-------------------------------------");
        List<String> stringListHouse = FileUtils.readFile(FILE_NAME_HOUSE);
        int index = 1;
        for (String string : stringListHouse) {
            String[] stringSplit = string.split(COMMA);
            House house = new House(stringSplit[0], stringSplit[1], Double.parseDouble(stringSplit[2]),
                    Double.parseDouble(stringSplit[3]), Integer.parseInt(stringSplit[4]),
                    stringSplit[5], stringSplit[6], stringSplit[7], Integer.parseInt(stringSplit[8]));
            houseArrayList.add(house);
            System.out.print("No." + index + ": ");
            house.showInFor();
        }
        System.out.println("-------------------------------------");
    }

    public static void showAllVilla() {
        System.out.println("-------------------------------------");
        List<String> stringListVilla = FileUtils.readFile(FILE_NAME_VILLA);
        int index = 1;
        for (String string : stringListVilla) {
            String[] stringSplit = string.split(COMMA);
            Villa villa = new Villa(stringSplit[0], stringSplit[1], Double.parseDouble(stringSplit[2]),
                    Double.parseDouble(stringSplit[3]), Integer.parseInt(stringSplit[4]),
                    stringSplit[5], stringSplit[6], stringSplit[7], Double.parseDouble(stringSplit[8]), Integer.parseInt(stringSplit[9]));

            villaArrayList.add(villa);
            System.out.print("No." + index++ + ": ");
            villa.showInFor();
        }
        System.out.println("-------------------------------------");
    }

    public static void addNewCustomer() {
        String fullName;
        String dateOfBirth;
        String genderCustomer;
        String numberIdCard;
        String phoneNumber;
        String emailCustomer;
        String typeOfCustomer;
        String addressCustomer;
        Services services = null;

        boolean flag;

        do {
            flag = true;
            System.out.print("Nhập tên khách hàng: ");
            fullName = scanner.nextLine();
            try {
                Validate.checkNameCustomer(fullName, Validate.SERVICE_STRING_REGEX);
            } catch (NameException e) {
                flag = false;
                e.printStackTrace();
            }
        } while (!flag);

        do {
            flag = true;
            System.out.print("Nhập ngày tháng năm sinh khách hàng: ");
            dateOfBirth = scanner.nextLine();
            try {
                Validate.checkBirthdayCustomer(dateOfBirth, Validate.CUSTOMER_DAY_REGEX);
            } catch (BirthdayException e) {
                flag = false;
                e.printStackTrace();
            }
        } while (!flag);

        do {
            flag = true;
            System.out.print("Nhập giới tính khách hàng: ");
            genderCustomer = scanner.nextLine();
            try {
                Validate.checkGenderCustomer(genderCustomer, Validate.CUSTOMER_GENDER_REGEX);
            } catch (GenderException e) {
                flag = false;
                e.printStackTrace();
            }
        } while (!flag);

        do {
            flag = true;
            System.out.print("Nhập Số chứng minh nhân dân khách hàng");
            numberIdCard = scanner.nextLine();
            try {
                Validate.checkIdCardCustomer(numberIdCard, Validate.CUSTOMER_ID_CARD_REGEX);
            } catch (IdCardException e) {
                flag = false;
                e.printStackTrace();
            }
        } while (!flag);

        do {
            System.out.print("Nhập số điện thoại khách hàng: ");
            phoneNumber = scanner.nextLine();
        } while (!Validate.checkNumberPhone(phoneNumber, Validate.CUSTOMER_NUMBER_PHONE));

        do {
            flag = true;
            System.out.print("Nhập địa chỉ email khách hàng: ");
            emailCustomer = scanner.nextLine();
            try {
                Validate.checkEmailCustomer(emailCustomer, Validate.CUSTOMER_EMAIL);
            } catch (EmailException e) {
                flag = false;
                e.printStackTrace();
            }
        } while (!flag);

        do {
            System.out.print("Nhâp cấp độ khách hàng: ");
            typeOfCustomer = scanner.nextLine();
        } while (!Validate.isQualityCustomer(typeOfCustomer, Validate.CUSTOMER_QUALITY_CUSTOMER));

        do {
            System.out.print("Nhập địa chỉ khách hàng: ");
            addressCustomer = scanner.nextLine();
        } while (!Validate.isValidRegexString(addressCustomer, Validate.SERVICE_STRING_REGEX));


        Customer customer = null;
        customer = new Customer(fullName, dateOfBirth, genderCustomer, numberIdCard, phoneNumber, emailCustomer, typeOfCustomer, addressCustomer, null);
        customerArrayList.add(customer);
        String line = null;
        for (Customer writeCustomer : customerArrayList) {
            line = writeCustomer.getFullName() + COMMA +
                    writeCustomer.getDateOfBirth() + COMMA +
                    writeCustomer.getGenderCustomer() + COMMA +
                    writeCustomer.getNumberIdCard() + COMMA +
                    writeCustomer.getPhoneNumber() + COMMA +
                    writeCustomer.getEmailCustomer() + COMMA +
                    writeCustomer.getTypeOfCustomer() + COMMA +
                    writeCustomer.getAddressCustomer();
            FileUtils.writeFile(FILE_NAME_CUSTOMER, line);
        }
    }

    public static void showInformationCustomers() {
        List<String> stringListCustomer = FileUtils.readFile(FILE_NAME_CUSTOMER);
        int index = 1;

        for (String string : stringListCustomer) {
            String[] stringSplit = string.split(COMMA);
            Customer customer = new Customer(stringSplit[0], stringSplit[1], stringSplit[2], stringSplit[3],
                    stringSplit[4], stringSplit[5], stringSplit[6], stringSplit[7], null);

            customerArrayList.add(customer);

        }
        Collections.sort(customerArrayList);
        for (Customer customer : customerArrayList) {
            //System.out.println(index++ + ". " + customer.toString());
            System.out.print("No." + index++ + ": ");
            customer.showInFor();
        }
    }

    public static void addNewBooking() {
    }

    public static void showInformationOfEmployee() {
        List<String> stringListEmployee = FileUtils.readFile(FILE_NAME_EMPLOYEE);

//        for (String stringEmployee : stringListEmployee) {
//            String[] arrayEmployee = stringEmployee.split(COMMA);
//            Employee employee = new Employee(arrayEmployee[0],arrayEmployee[1],arrayEmployee[2],arrayEmployee[3]);
//            stringEmployeeMap.put(arrayEmployee[0], employee);
//        }
//        System.out.println("-------------------------------------");
//        System.out.println("Danh sách khách hàng đã và đang lưu trú tại resort: ");
//        for (String employeeEntry : stringEmployeeMap.keySet()) {
//            System.out.println("Key: " + employeeEntry + "\n" + stringEmployeeMap.get(employeeEntry));
//        }
    }


}
//    public static void showAllRoom() {
//        for (Room room : roomArrayList) {
//            room.showInFor();
//        }
//    }