package controllers;

import models.Services;
import models.Villa;

import java.util.Scanner;

public class MainController {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(
                "1.\tAdd New Services\n" +
                        "2.\tShow Services\n" +
                        "3.\tAdd New Customer\n" +
                        "4.\tShow Information of Customer\n" +
                        "5.\tAdd New Booking\n" +
                        "6.\tShow Information of Employee\n" +
                        "7.\tExit\n");
        System.out.println();
        System.out.println("Nhập sự lựa chọn của bạn.");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                addNewServies();
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

        }
    }

    public static void addNewServies() {
        System.out.println(
                "1.\tAdd New Villa\n" +
                        "2.\tAdd New House\n" +
                        "3.\tAdd New Room\n" +
                        "4.\tBack to menu\n" +
                        "5.\tExit\n");

        System.out.println();
        System.out.println("Nhập sự lựa chọn của bạn.");

        int choose = scanner.nextInt();
        switch (choose){
            case 1:
                Services servicesVilla = new Villa();
                servicesVilla.setId(scanner.nextLine());
                servicesVilla.setNameService(scanner.nextLine());


        }
    }

    public static void showServices() {
        System.out.println(
                "1.\tShow all Villa\n" +
                        "2.\tShow all House\n" +
                        "3.\tShow all Room\n" +
                        "4.\tShow All Name Villa Not Duplicate\n" +
                        "5.\tShow All Name House Not Duplicate\n" +
                        "6.\tShow All Name Name Not Duplicate\n" +
                        "7.\tBack to menu\n" +
                        "8.\tExit\n");

        System.out.println();
        System.out.println("Nhập sự lựa chọn của bạn.");
    }

    public static void addNewCustomer() {
    }

    public static void showInformationCustomers() {
    }

    public static void addNewBooking() {
    }

    public static void showInformationOfEmployee() {
    }
    public static void add(){
        System.out.println();
    }
}
