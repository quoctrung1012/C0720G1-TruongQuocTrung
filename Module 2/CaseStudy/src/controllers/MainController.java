package controllers;

import commons.*;
import exception.*;
import models.*;

import java.util.*;

public class MainController {
    public static String choose;

    static String id;
    static String nameService;
    static double useArea;
    static double rentalCosts;
    static int maximumNumberOfPeople;
    static String rentalType;

    static Scanner scanner = new Scanner(System.in);
    public static final String FILE_NAME_VILLA = "src/data/villa.csv";
    public static final String FILE_NAME_HOUSE = "src/data/house.csv";
    public static final String FILE_NAME_ROOM = "src/data/room.csv";
    public static final String FILE_NAME_CUSTOMER = "src/data/customer.csv";
    public static final String FILE_NAME_EMPLOYEE = "src/data/employee.csv";
    public static final String FILE_NAME_BOOKING = "src/data/booking.csv";
    public static final String COMMA = ",";

    public static List<Room> roomArrayList = new ArrayList<>();
    public static List<House> houseArrayList = new ArrayList<>();
    public static List<Villa> villaArrayList = new ArrayList<>();
    public static List<Customer> customerArrayList = new ArrayList<>();
    public static List<Employee> employeeArrayList = new ArrayList<>();

    public static Map<Integer, Employee> stringEmployeeMap = new HashMap<Integer, Employee>();
    public static Queue<Customer> customerQueue = new LinkedList<>();
    public static Stack<Employee> employeeStack = new Stack<>();

    public static void displayMainMenu() {
        do {
            System.out.println("-------------------------------------");
            System.out.print(
                    "\tBạn hãy chọn từ 1-10.\n" +
                            "01.\tAdd New Services.\n" +
                            "02.\tShow Services.\n" +
                            "03.\tAdd New Customer.\n" +
                            "04.\tShow Information of Customer.\n" +
                            "05.\tAdd New Booking.\n" +
                            "06.\tAdd New Employee\n" +
                            "07.\tShow Information of Employee.\n" +
                            "08.\tMenu buy ticket movie 4D.\n" +
                            "09.\tFind Employee Information In File Cabinets\n" +
                            "10.\tExit.\n");
            System.out.println("-------------------------------------");
            System.out.print("Nhập sự lựa chọn của bạn: ");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    addNewServices();
                    break;
                case "2":
                    showServices();
                    break;
                case "3":
                    addNewCustomer();
                    break;
                case "4":
                    showInformationCustomers();
                    break;
                case "5":
                    addNewBooking();
                    break;
                case "6":
                    addNewEmployee();
                    break;
                case "7":
                    showInformationOfEmployee();
                    break;
                case "8":
                    menuMovieTicketList();
                    break;
                case "9":
                    findEmployeeInformationInFileCabinets();
                    break;
                case "10":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Yêu cầu nhập sự lựa chọn khác.");
            }
        } while (Integer.parseInt(choose) >= 1 && Integer.parseInt(choose) <= 10);
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
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    addNewVilla();
                    break;
                case "2":
                    addNewHouse();
                    break;
                case "3":
                    addNewRoom();
                    break;
                case "4":
                    displayMainMenu();
                    break;
                case "5":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Yêu cầu nhập lại");
                    addNewServices();
            }
        } while (Integer.parseInt(choose) >= 1 && Integer.parseInt(choose) <= 5);
    }

    public static void addNewRoom() {

        String nameExtraServices;
        int amountExtraServices;
        double priceExtraServices;

        do {
            System.out.print("Nhập id loại phòng thuê: ");
            id = scanner.nextLine();
        } while (!Validate.validateRoom(id, Validate.SERVICE_ROOM_REGEX));

        addNewInformationServices();

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

        String rentalType = null;
        String standardRoom;
        String descriptionOfOtherAmenities;
        int numberOfFloors;

        do {
            System.out.print("Nhập id loại phòng thuê: ");
            id = scanner.nextLine();
        } while (!Validate.validateHouse(id, Validate.SERVICE_HOUSE_REGEX));

        addNewInformationServices();
        do {
            System.out.print("Nhập Tiêu chuẩn phòng: ");
            standardRoom = scanner.nextLine();
        } while (!Validate.isQualityRents(standardRoom, Validate.SERVICE_QUALITY_RENTAL));

        do {
            System.out.print("Nhập tên dịch vụ đi kèm(Massage, Karaoke, Food, Drink, Car): ");
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
        String standardRoom;
        String descriptionOfOtherAmenities;
        double swimmingPoolArea = 0;
        int numberOfFloors = 0;

        do {
            System.out.print("Nhập id loại phòng thuê: ");
            id = scanner.nextLine();
        } while (!Validate.validateVilla(id, Validate.SERVICE_VILLA_REGEX));

        addNewInformationServices();

        do {
            System.out.print("Nhập Tiêu chuẩn phòng: ");
            standardRoom = scanner.nextLine();
        } while (!Validate.isQualityRents(standardRoom, Validate.SERVICE_QUALITY_RENTAL));

        do {
            System.out.print("Nhập tên dịch vụ đi kèm(Massage, Karaoke, Food, Drink, Car): ");
            descriptionOfOtherAmenities = scanner.nextLine();
        } while (!Validate.isExtraServices(descriptionOfOtherAmenities, Validate.EXTRA_SERVICE_REGEX));

        do {
            try {
                System.out.print("Diện tích hồ bơi(lớn hơn 30 mét vuông): ");
                swimmingPoolArea = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Yêu cầu bạn nhập số không nhập ký tự chữ khác.");
            }
        } while (!Validate.isMoreThan(swimmingPoolArea, 30));

        do {
            try {
                System.out.print("Số tầng của Villa: ");
                numberOfFloors = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Yêu cầu bạn nhập số không nhập ký tự chữ khác.");
            }
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

    public static void addNewInformationServices() {
        do {
            System.out.print("Nhập Tên dịch vụ: ");
            nameService = scanner.nextLine();
        } while (!Validate.isValidRegexString(nameService, Validate.SERVICE_STRING_REGEX));

        do {
            try {
                System.out.print("Nhập diện tích phòng(lớn hơn 30 mét vuông): ");
                useArea = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Yêu cầu bạn nhập số không nhập ký tự chữ khác.");
            }
        } while (!Validate.isMoreThan(useArea, 30));

        do {
            try {
                System.out.print("Nhập chi phí thuê: ");
                rentalCosts = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Yêu cầu bạn nhập số không nhập ký tự chữ khác.");
            }
        } while (!Validate.isMoreThan(rentalCosts, 0));

        do {
            try {
                System.out.print("Nhập số người thuê( Tối đa 20 người): ");
                maximumNumberOfPeople = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Yêu cầu bạn nhập số không nhập ký tự chữ khác.");
            }
        } while (!Validate.isMoreThanMid(maximumNumberOfPeople, 0, 20));

        do {
            System.out.print("Nhập kiểu thuê (Thuê theo : Ngày, tháng, năm, giờ): ");
            rentalType = scanner.nextLine();
        } while (!Validate.isTypeRents(rentalType, Validate.SERVICE_TYPE_RENTS));
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
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    showAllVilla();
                    break;
                case "2":
                    showAllHouse();
                    break;
                case "3":
                    showAllRoom();
                    break;
                case "4":
                    showAllNameVillaNotDuplicate();
                    break;
                case "5":
                    showAllNameHouseNotDuplicate();
                    break;
                case "6":
                    showAllNameRoomNotDuplicate();
                    break;
                case "7":
                    displayMainMenu();
                    break;
                case "8":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Yêu cầu nhập lại");
                    displayMainMenu();
            }
        } while (Integer.parseInt(choose) >= 1 && Integer.parseInt(choose) <= 8);
    }

    public static void showAllNameRoomNotDuplicate() {
        readAllRoom();
        Set<String> setServicesRoom = new TreeSet<>();
        System.out.println("-------------------------------------");
        System.out.println("List Room Resort Room Not Duplicate: ");
        for (Room room : roomArrayList) {
            setServicesRoom.add(room.getNameService());
        }
        for (String roomString : setServicesRoom) {
            System.out.println(roomString);
        }
    }

    public static void showAllNameHouseNotDuplicate() {
        readAllHouse();
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
        readAllVilla();
        Set<String> setServicesVilla = new TreeSet<>();
        System.out.println("-------------------------------------");
        System.out.println("List House Resort Room Not Duplicate: ");
        for (Villa villa : villaArrayList) {
            setServicesVilla.add(villa.getNameService());
        }
        for (String villaString : setServicesVilla) {
            System.out.println(villaString);
        }
    }

    public static void readAllRoom() {
        List<String> stringListRoom = FileUtils.readFile(FILE_NAME_ROOM);
        for (String string : stringListRoom) {
            String[] stringSplit = string.split(COMMA);
            Room room = new Room(stringSplit[0], stringSplit[1], Double.parseDouble(stringSplit[2]),
                    Double.parseDouble(stringSplit[3]), Integer.parseInt(stringSplit[4]), stringSplit[5],
                    new ExtraServices(stringSplit[6], Integer.parseInt(stringSplit[7]), Double.parseDouble(stringSplit[8])));
            roomArrayList.add(room);
        }
    }

    public static void readAllHouse() {
        List<String> stringListHouse = FileUtils.readFile(FILE_NAME_HOUSE);

        for (String string : stringListHouse) {
            String[] stringSplit = string.split(COMMA);
            House house = new House(stringSplit[0], stringSplit[1], Double.parseDouble(stringSplit[2]),
                    Double.parseDouble(stringSplit[3]), Integer.parseInt(stringSplit[4]),
                    stringSplit[5], stringSplit[6], stringSplit[7], Integer.parseInt(stringSplit[8]));
            houseArrayList.add(house);
        }
    }

    public static void readAllVilla() {
        List<String> stringListVilla = FileUtils.readFile(FILE_NAME_VILLA);

        for (String string : stringListVilla) {
            String[] stringSplit = string.split(COMMA);
            Villa villa = new Villa(stringSplit[0], stringSplit[1], Double.parseDouble(stringSplit[2]),
                    Double.parseDouble(stringSplit[3]), Integer.parseInt(stringSplit[4]),
                    stringSplit[5], stringSplit[6], stringSplit[7], Double.parseDouble(stringSplit[8]), Integer.parseInt(stringSplit[9]));

            villaArrayList.add(villa);
        }
    }

    public static void showAllRoom() {
        System.out.println("-------------------------------------");
        int index = 1;
        readAllRoom();
        for (Room room : roomArrayList) {
            System.out.print("No." + index++ + ": ");
            room.showInFor();
        }
        System.out.println("-------------------------------------");
    }

    public static void showAllHouse() {
        System.out.println("-------------------------------------");
        int index = 1;
        readAllHouse();
        for (House house : houseArrayList) {
            System.out.print("No." + index + ": ");
            house.showInFor();
        }
        System.out.println("-------------------------------------");
    }

    public static void showAllVilla() {
        System.out.println("-------------------------------------");
        int index = 1;
        readAllVilla();
        for (Villa villa : villaArrayList) {
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

    public static List<Customer> readCustomer() {
        List<String> stringListCustomer = FileUtils.readFile(FILE_NAME_CUSTOMER);

        for (String string : stringListCustomer) {
            String[] stringSplit = string.split(COMMA);
            Customer customer = new Customer(stringSplit[0], stringSplit[1], stringSplit[2], stringSplit[3],
                    stringSplit[4], stringSplit[5], stringSplit[6], stringSplit[7], null);
            customerArrayList.add(customer);
        }
        Collections.sort(customerArrayList);
        return customerArrayList;
    }

    public static void showInformationCustomers() {
        customerArrayList = new ArrayList<>();
        int index = 1;
        customerArrayList = (ArrayList<Customer>) readCustomer();
        System.out.println("-------------------------------------");
        System.out.println("Danh sách khách hàng đã và đang lưu trú tại resort: ");
        for (Customer customer : customerArrayList) {
            System.out.print("No." + index++ + ": ");
            customer.showInFor();
        }
    }

    public static void addNewBooking() {
        showInformationCustomers();
        System.out.println("Chọn vị trí khách hàng muốn lại booking ");
        int iPositionCustomer = Integer.parseInt(scanner.nextLine());
        do {
            System.out.println("-------------------------------------");
            System.out.println(
                    "\tBạn hãy chọn từ 1-5\n" +
                            "1.\tBooking Villa\n" +
                            "2.\tBooking House\n" +
                            "3.\tBooking Room\n" +
                            "4.\tBack Menu\n" +
                            "5.\tExit");
            System.out.print("Nhập sự lựa chọn của bạn: ");
            choose = scanner.nextLine();

            switch (choose) {
                case "1":
                    showAllVilla();
                    System.out.print("Chọn Villa muốn thuê: ");
                    addFileBookingVilla(iPositionCustomer);
                    break;
                case "2":
                    showAllHouse();
                    System.out.print("Chọn House muốn thuê: ");
                    addFileBookingHouse(iPositionCustomer);
                    break;
                case "3":
                    showAllRoom();
                    System.out.print("Chọn Room muốn thuê: ");
                    addFileBookingRoom(iPositionCustomer);
                    break;
                case "4":
                    displayMainMenu();
                    break;
                case "5":
                    System.exit(0);
                    break;
                default:
                    System.out.print("Nhập lại!!!");
            }
        } while (Integer.parseInt(choose) > 0 && Integer.parseInt(choose) <= 5);

    }

    public static void addBookingServices(int iPositionCustomer) {
        String line = null;
        line = customerArrayList.get(iPositionCustomer - 1).getFullName() + COMMA +
                customerArrayList.get(iPositionCustomer - 1).getDateOfBirth() + COMMA +
                customerArrayList.get(iPositionCustomer - 1).getGenderCustomer() + COMMA +
                customerArrayList.get(iPositionCustomer - 1).getNumberIdCard() + COMMA +
                customerArrayList.get(iPositionCustomer - 1).getPhoneNumber() + COMMA +
                customerArrayList.get(iPositionCustomer - 1).getEmailCustomer() + COMMA +
                customerArrayList.get(iPositionCustomer - 1).getTypeOfCustomer() + COMMA +
                customerArrayList.get(iPositionCustomer - 1).getAddressCustomer() + COMMA +
                customerArrayList.get(iPositionCustomer - 1).getServices();
        FileUtils.writeFile(FILE_NAME_BOOKING, line);
        displayMainMenu();
    }

    public static void addFileBookingVilla(int iPositionCustomer) {
        int numberInput = Integer.parseInt(scanner.nextLine());
        customerArrayList.get(iPositionCustomer - 1).setServices(villaArrayList.get(numberInput - 1));
        addBookingServices(iPositionCustomer);
    }

    public static void addFileBookingHouse(int iPositionCustomer) {
        int numberInput = Integer.parseInt(scanner.nextLine());
        customerArrayList.get(iPositionCustomer - 1).setServices(houseArrayList.get(numberInput - 1));
        addBookingServices(iPositionCustomer);
    }

    public static void addFileBookingRoom(int iPositionCustomer) {
        int numberInput = Integer.parseInt(scanner.nextLine());
        customerArrayList.get(iPositionCustomer - 1).setServices(roomArrayList.get(numberInput - 1));
        addBookingServices(iPositionCustomer);
    }

    public static void addNewEmployee() {

        Employee employee = new Employee();
        System.out.print("01.Nhập Id nhân viên: ");
        employee.setIdEmployee(Integer.parseInt(scanner.nextLine()));

        System.out.print("02.Nhập Họ và Tên nhân viên: ");
        employee.setFullNameEmployee(scanner.nextLine());

        System.out.print("03.Nhập ngày tháng năm sinh của nhân viên: ");
        employee.setAgeEmployee(scanner.nextLine());

        System.out.print("04.Nhập Số chứng minh nhân dân của nhân viên: ");
        employee.setIdCardEmployee(scanner.nextLine());

        System.out.print("05.Nhập Số điện thoại nhân viên: ");
        employee.setPhoneNumberEmployee(scanner.nextLine());

        System.out.print("06.Nhập Email nhân viên: ");
        employee.setEmailEmployee(scanner.nextLine());

        System.out.print("07.Nhập Trình độ học vấn của của nhân viên: ");
        employee.setAcademicLevelEmployee(scanner.nextLine());

        System.out.print("08.Nhập Chức vụ hiện tại của nhân viên: ");
        employee.setPositionEmployee(scanner.nextLine());

        System.out.print("09.Nhập Lương hiện tại của nhân viên: ");
        employee.setSalaryEmployee(scanner.nextLine());

        System.out.print("10.Nhập Địa chỉ của nhân viên: ");
        employee.setAddressEmployee(scanner.nextLine());

        employeeArrayList.add(employee);

        String line = null;
        for (Employee writeEmployee : employeeArrayList) {
            line = writeEmployee.getIdEmployee() + COMMA +
                    writeEmployee.getFullNameEmployee() + COMMA +
                    writeEmployee.getAgeEmployee() + COMMA +
                    writeEmployee.getIdCardEmployee() + COMMA +
                    writeEmployee.getPhoneNumberEmployee() + COMMA +
                    writeEmployee.getEmailEmployee() + COMMA +
                    writeEmployee.getAcademicLevelEmployee() + COMMA +
                    writeEmployee.getPositionEmployee() + COMMA +
                    writeEmployee.getSalaryEmployee() + COMMA +
                    writeEmployee.getAddressEmployee();
            FileUtils.writeFile(FILE_NAME_EMPLOYEE, line);
        }
    }

    public static void showInformationOfEmployee() {
        getFileInformationOfEmployee();
        System.out.println("-------------------------------------");
        System.out.println("Danh sách nhân viên đang làm việc tại resort: ");
        for (Map.Entry<Integer, Employee> employeeEntry : stringEmployeeMap.entrySet()) {
            System.out.println("Key: " + employeeEntry.getKey() + "\n" + employeeEntry.getValue().toString());
        }
    }

    public static Map<Integer, Employee> getFileInformationOfEmployee() {
        List<String> stringListEmployee = FileUtils.readFile(FILE_NAME_EMPLOYEE);

        for (String stringEmployee : stringListEmployee) {
            String[] arrayEmployee = stringEmployee.split(COMMA);
            Employee employee = new Employee();
            employee.setIdEmployee(Integer.parseInt(arrayEmployee[0]));
            employee.setFullNameEmployee(arrayEmployee[1]);
            employee.setAgeEmployee(arrayEmployee[2]);
            employee.setIdCardEmployee(arrayEmployee[3]);
            employee.setPhoneNumberEmployee(arrayEmployee[4]);
            employee.setEmailEmployee(arrayEmployee[5]);
            employee.setAcademicLevelEmployee(arrayEmployee[6]);
            employee.setPositionEmployee(arrayEmployee[7]);
            employee.setSalaryEmployee(arrayEmployee[8]);
            employee.setAddressEmployee(arrayEmployee[9]);

            stringEmployeeMap.put(employee.getIdEmployee(), employee);
        }
        return stringEmployeeMap;
    }

    public static void menuMovieTicketList() {
        do {
            System.out.println("Menu buy ticket movie 4D:\n" +
                    "1.\tBuy ticket movie 4D.\n" +
                    "2.\tList Customer buy ticket movie 4D.\n" +
                    "3.\tBack Menu.\n" +
                    "4.\tExit.");
            System.out.print("Sự lựa chọn của bạn: ");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    bookingTicket();
                    break;
                case "2":
                    showMovieTicketList();
                    break;
                case "3":
                    displayMainMenu();
                    break;
                case "4":
                    System.exit(0);
            }
        } while (Integer.parseInt(choose) >= 1 && Integer.parseInt(choose) <= 4);
    }

    private static void showMovieTicketList() {
        Customer customer = null;

        System.out.println("-------------------------------------");
        System.out.println("Danh sách khách hàng mua vé xem phim 4D: ");
        while (!customerQueue.isEmpty()) {
            customer = customerQueue.poll();
            customer.showInFor();

        }
    }

    public static void bookingTicket() {
        showInformationCustomers();
        try {
            System.out.print("\nVui lòng nhập số lượng khách hàng cần đăng ký: ");
            int index = 1;
            int number = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < number; i++) {
                System.out.print("Vui lòng nhập số tứ tự khách hàng thứ " + index++ + " đã đăng ký lưu trú hiện có của resort: ");
                int numberPosition = Integer.parseInt(scanner.nextLine());
                customerQueue.add(customerArrayList.get(numberPosition - 1));
            }
        } catch (NumberFormatException e) {
            System.err.println("\tYêu cầu nhập số. Bạn đang nhập một chuỗi: ");
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Bạn đã chọn số thứ tự của khách hàng ngoài danh sách hiện có.");
        }
    }

    private static Employee getFileEmployee(String idEmployee) {
        Map<Integer, Employee> stringEmployeeMap = getFileInformationOfEmployee();
        for (Map.Entry<Integer, Employee> stringEmployeeEntry : stringEmployeeMap.entrySet()) {
            employeeStack.push(stringEmployeeEntry.getValue());
        }
        Employee employee = null;
        while (!employeeStack.isEmpty()) {
            employee = employeeStack.pop();
            if (Objects.equals(employee.getIdEmployee(), idEmployee)) {
                return employee;
            }
        }
        return employee;
    }

    public static void findEmployeeInformationInFileCabinets() {
        String idEmployee = null;
        System.out.print("Nhập Id nhân viên bạn muốn tìm: ");
        idEmployee = scanner.nextLine();
        Employee employee = getFileEmployee(idEmployee);
        if (employee != null) {
            System.out.println("Hồ sơ nhân viên: \n" + employee.toString());
        } else {
            System.out.println("Id của nhân viên bạn muốn tìm không có trong hồ sơ dữ liệu!!!");
        }

    }
}