package libs;

import models.FilingCabinets;

import java.util.Scanner;

public class Main {
    public static String VILLA = "villa";
    public static String HOUSE = "house";
    public static String ROOM = "room";
    public static String CUSTOMER = "customer";
    public static String BOOKING = "booking";
    public static String EMPLOYEE = "employee";
    public static int choose;
    public static Scanner scanner = new Scanner(System.in);

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
                            "8.\tFind Employee Information In File Cabinets()\n" +
                            "9.\tExit\n");
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
                    AddInformation.addNewCustomer(CUSTOMER);
                    break;
                case 4:
                    ReadAndShowInformation.showInformationCustomers(CUSTOMER);
                    break;
                case 5:
                    AddInformation.addNewBooking();
                    break;
                case 6:
                    ReadAndShowInformation.showInformationOfEmployee();
                    break;
                case 7:
                    ReadAndShowInformation.showMovieTicketList();
                    break;
                case 8:
                    FilingCabinets.findEmployeeInformationInFileCabinets();
                    break;
                case 9:
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
                    AddInformation.addNewService(VILLA);
                    break;
                case 2:
                    AddInformation.addNewService(HOUSE);
                    break;
                case 3:
                    AddInformation.addNewService(ROOM);
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

    public static void showServices() {
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
                    ReadAndShowInformation.showAllServices(VILLA);
                    break;
                case 2:
                    ReadAndShowInformation.showAllServices(HOUSE);
                    break;
                case 3:
                    ReadAndShowInformation.showAllServices(ROOM);
                    break;
                case 4:
                    ReadAndShowInformation.showAllNameServicesNotDuplicate(VILLA);
                    break;
                case 5:
                    ReadAndShowInformation.showAllNameServicesNotDuplicate(HOUSE);
                    break;
                case 6:
                    ReadAndShowInformation.showAllNameServicesNotDuplicate(ROOM);
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
}
