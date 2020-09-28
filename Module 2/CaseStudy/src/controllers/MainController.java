package controllers;

import models.House;
import models.Room;
import models.Services;
import models.Villa;

import java.util.ArrayList;
import java.util.Scanner;

public class MainController {
    public static int choose;
    static Scanner scanner = new Scanner(System.in);
    static String id;
    static String nameService;
    static double useArea;
    static double rentalCosts;
    static int maximumNumberOfPeople;
    static String rentalType;
    static int standardRoom;
    static String descriptionOfOtherAmenities;
    static double swimmingPoolArea;
    static int numberOfFloors;
    static String freeServiceIncluded;

    public static ArrayList<Room> roomArrayList = new ArrayList<>();
    public static ArrayList<House> houseArrayList = new ArrayList<>();
    public static ArrayList<Villa> villaArrayList = new ArrayList<>();
    public static ArrayList<Services> servicesArrayList = new ArrayList<>();

    public static void displayMainMenu() {
        do {
            System.out.println("-------------------------------------");
            System.out.println(
                    "\tBạn hãy chọn từ 1-7\n" +
                            "1.\tAdd New Services\n" +
                            "2.\tShow Services\n" +
                            "3.\tAdd New Customer\n" +
                            "4.\tShow Information of Customer\n" +
                            "5.\tAdd New Booking\n" +
                            "6.\tShow Information of Employee\n" +
                            "7.\tExit\n");
            System.out.println("-------------------------------------");
            System.out.println("Nhập sự lựa chọn của bạn.");
            choose = scanner.nextInt();
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
            System.out.println(
                    "\tBạn hãy chọn từ 1-5 \n" +
                            "1.\tAdd New Villa\n" +
                            "2.\tAdd New House\n" +
                            "3.\tAdd New Room\n" +
                            "4.\tBack to menu\n" +
                            "5.\tExit\n");
            System.out.println("-------------------------------------");
            System.out.println("Nhập sự lựa chọn của bạn.");
            choose = scanner.nextInt();
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
                default:
                    System.out.println("Yêu cầu nhập lại");
                    addNewServices();
            }
        } while (choose >= 1 && choose <= 4);

    }

    public static void addNewRoom() {
        addServices();
        System.out.print("Dịch vụ miễn phí đi kèm");
        freeServiceIncluded = scanner.nextLine();
        Room room = new Room(id, nameService, useArea, rentalCosts, maximumNumberOfPeople, rentalType, freeServiceIncluded);
        roomArrayList.add(room);
        servicesArrayList.add(room);
    }

    public static void addNewHouse() {
        addServices();
        System.out.print("Nhập Tiêu chuẩn phòng: ");
        standardRoom = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Mô tả tiện nghi khác: ");
        descriptionOfOtherAmenities = scanner.nextLine();

        System.out.print("Số tầng của Villa: ");
        numberOfFloors = scanner.nextInt();

        House house = new House(id, nameService, useArea, rentalCosts, maximumNumberOfPeople, rentalType, standardRoom, descriptionOfOtherAmenities, numberOfFloors);
        houseArrayList.add(house);
        servicesArrayList.add(house);
    }

    public static void addNewVilla() {
        addServices();
        System.out.print("Nhập Tiêu chuẩn phòng: ");
        standardRoom = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Mô tả tiện nghi khác");
        descriptionOfOtherAmenities = scanner.nextLine();

        System.out.print("Diện tích hồ bơi(lớn hơn 30m vuông): ");
        swimmingPoolArea = scanner.nextDouble();

        System.out.print("Số tầng của Villa: ");
        numberOfFloors = scanner.nextInt();

        Villa villa = new Villa(id, nameService, useArea, rentalCosts, maximumNumberOfPeople, rentalType, standardRoom, descriptionOfOtherAmenities, swimmingPoolArea, numberOfFloors);
        villaArrayList.add(villa);
        servicesArrayList.add(villa);
    }

    public static void addServices() {
        System.out.print("Nhập id loại phòng thuê: ");
        id = scanner.nextLine();
        scanner.nextLine();

        System.out.print("Nhập Tên dịch vụ: ");
        nameService = scanner.nextLine();

        System.out.print("Nhập diện tích phòng: ");
        useArea = scanner.nextDouble();


        System.out.print("Nhập chi phí thuê: ");
        rentalCosts = scanner.nextDouble();

        System.out.print("Nhập số người thuê( Tối đa 20 người): ");
        maximumNumberOfPeople = scanner.nextInt();


        System.out.print("Nhập kiểu thuê (Thuê theo : Ngày, tháng, năm, giờ): ");
        rentalType = scanner.nextLine();
    }

    public static void showServices() {
        do {
            System.out.println("-------------------------------------");
            System.out.println(
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
            System.out.println("Nhập sự lựa chọn của bạn.");
            choose = scanner.nextInt();
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
                    break;
                default:
                    System.out.println("Yêu cầu nhập lại");
                    showServices();
            }
        } while (choose >= 1 && choose <= 8);
    }

    public static void showAllNameRoomNotDuplicate() {
    }

    public static void showAllNameHouseNotDuplicate() {
    }

    public static void showAllNameVillaNotDuplicate() {

    }

    public static void showAllRoom() {
        System.out.println("-------------------------------------");
        for (Room room : roomArrayList) {
            System.out.println(room);
        }
        System.out.println("-------------------------------------");
    }

    public static void showAllHouse() {
        System.out.println("-------------------------------------");
        for (House house : houseArrayList) {
            System.out.println(house);
        }
        System.out.println("-------------------------------------");
    }

    public static void showAllVilla() {
        System.out.println("-------------------------------------");
        for (Villa villa : villaArrayList) {
            System.out.println(villa);
        }
        System.out.println("-------------------------------------");
    }

    public static void addNewCustomer() {
    }

    public static void showInformationCustomers() {
    }

    public static void addNewBooking() {
    }

    public static void showInformationOfEmployee() {
    }

}
