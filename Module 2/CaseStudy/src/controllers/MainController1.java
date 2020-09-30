package controllers;

import java.util.Scanner;

public class MainController1 {
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
    static String freeServiceIncluded;

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

    private static void addNewServices() {
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

    private static void showServices() {
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

    private static void showInformationOfEmployee() {
    }

    private static void addNewBooking() {
    }

    private static void showInformationCustomers() {
    }

    private static void addNewCustomer() {
    }

    private static void addNewRoom() {
        System.out.print("Nhập id loại phòng thuê: ");
        id = scanner.nextLine();

        System.out.print("Nhập Tên dịch vụ: ");
        nameService = scanner.nextLine();

        System.out.print("Nhập diện tích phòng: ");
        useArea = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhập chi phí thuê: ");
        rentalCosts = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhập số người thuê( Tối đa 20 người): ");
        maximumNumberOfPeople = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập kiểu thuê (Thuê theo : Ngày, tháng, năm, giờ): ");
        rentalType = scanner.nextLine();

        System.out.print("Dịch vụ miễn phí đi kèm");
        freeServiceIncluded = scanner.nextLine();
    }

    private static void addNewHouse() {
        System.out.print("Nhập id loại phòng thuê: ");
        id = scanner.nextLine();

        System.out.print("Nhập Tên dịch vụ: ");
        nameService = scanner.nextLine();

        System.out.print("Nhập diện tích phòng: ");
        useArea = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhập chi phí thuê: ");
        rentalCosts = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhập số người thuê( Tối đa 20 người): ");
        maximumNumberOfPeople = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập kiểu thuê (Thuê theo : Ngày, tháng, năm, giờ): ");
        rentalType = scanner.nextLine();

        System.out.print("Nhập Tiêu chuẩn phòng: ");
        standardRoom = scanner.nextLine();

        System.out.print("Mô tả tiện nghi khác: ");
        descriptionOfOtherAmenities = scanner.nextLine();

        System.out.print("Số tầng của Villa: ");
        numberOfFloors = Integer.parseInt(scanner.nextLine());
    }

    private static void addNewVilla() {
        System.out.print("Nhập id loại phòng thuê: ");
        id = scanner.nextLine();

        System.out.print("Nhập Tên dịch vụ: ");
        nameService = scanner.nextLine();

        System.out.print("Nhập diện tích phòng: ");
        useArea = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhập chi phí thuê: ");
        rentalCosts = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhập số người thuê( Tối đa 20 người): ");
        maximumNumberOfPeople = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập kiểu thuê (Thuê theo : Ngày, tháng, năm, giờ): ");
        rentalType = scanner.nextLine();

        System.out.print("Nhập Tiêu chuẩn phòng: ");
        standardRoom = scanner.nextLine();

        System.out.print("Mô tả tiện nghi khác: ");
        descriptionOfOtherAmenities = scanner.nextLine();

        System.out.print("Diện tích hồ bơi(lớn hơn 30m vuông): ");
        swimmingPoolArea = Double.parseDouble(scanner.nextLine());

        System.out.print("Số tầng của Villa: ");
        numberOfFloors = Integer.parseInt(scanner.nextLine());
    }

    private static void showAllNameRoomNotDuplicate() {
    }

    private static void showAllNameHouseNotDuplicate() {
    }

    private static void showAllNameVillaNotDuplicate() {
    }

    private static void showAllRoom() {
    }

    private static void showAllHouse() {
    }

    private static void showAllVilla() {
    }
}
