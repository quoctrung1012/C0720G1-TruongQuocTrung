package bai_thi_module.controller;

import bai_thi_module.commons.InputKeyboard;

import java.util.Scanner;

public class MainMenu {
    public final Scanner scanner = new Scanner(System.in);
    public ManagerProduct managerProduct = new ManagerProduct();
    int choose;

    public void mainMenu() {
        do {
            System.out.println("Nhập số để chọn:\n" +
                    "1.\tThêm mới thông tin sản phẩm\n" +
                    "2.\tXóa thông tin sản phẩm\n" +
                    "3.\tXem danh sách sản phẩm\n" +
                    "4.\tTìm kiếm\n" +
                    "5.\tThoát.");
            System.out.println("Bạn có thể chọn từ 1-5");
            choose = InputKeyboard.inputNumberInteger();
            switch (choose) {
                case 1:
                    mainAddProduct();
                    break;
                case 2:
                    mainDeleteMenu();
                    break;
                case 3:
                    mainShowMenu();
                    break;
                case 4:
                    mainSearchMenu();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Yêu cầu nhập lại.");
            }
        } while (true);
    }

    public void mainAddProduct() {
        do {
            System.out.println("Nhập số để chọn:\n" +
                    "1.\tThêm mới thông tin sản phẩm Nhập khẩu\n" +
                    "2.\tThêm mới thông tin sản phẩm Xuất khẩu\n" +
                    "3.\tQuay lại Menu\n" +
                    "4.\tThoát.");
            System.out.println("Bạn có thể chọn từ 1-5");
            choose = InputKeyboard.inputNumberInteger();
            switch (choose) {
                case 1:
                    managerProduct.addProductImport();
                    break;
                case 2:
                    managerProduct.addProductExtra();
                    break;
                case 3:
                    mainMenu();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Yêu cầu nhập lại.");
            }
        } while (true);
    }

    public void mainShowMenu() {
        do {
            System.out.println("Nhập số để chọn:\n" +
                    "1.\tHiển thị thông tin sản phẩm nhập khẩu\n" +
                    "2.\tHiển thị thông tin sản phẩm Xuất khẩu\n" +
                    "3.\tQuay lại Menu\n" +
                    "4.\tThoát.");
            System.out.println("Bạn có thể chọn từ 1-5");
            choose = InputKeyboard.inputNumberInteger();
            switch (choose) {
                case 1:
                    managerProduct.showImportProduct();
                    break;
                case 2:
                    managerProduct.showExtraProduct();
                    break;
                case 3:
                    mainMenu();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Yêu cầu nhập lại.");
            }
        } while (true);
    }

    public void mainSearchMenu() {
        do {
            System.out.println("Nhập số để chọn:\n" +
                    "1.\tTìm kiếm thông tin sản phẩm bằng Mã sản phẩm\n" +
                    "2.\tTìm kiếm thông tin sản phẩm bằng Tên sản phẩm\n" +
                    "3.\tQuay lại Menu\n" +
                    "4.\tThoát.");
            System.out.println("Bạn có thể chọn từ 1-5");
            choose = InputKeyboard.inputNumberInteger();
            switch (choose) {
                case 1:
                    mainSearchCodeMenu();
                    break;
                case 2:
                    mainSearchNameMenu();
                    break;
                case 3:
                    mainMenu();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Yêu cầu nhập lại.");
            }
        } while (true);
    }

    public void mainSearchCodeMenu() {
        do {
            System.out.println("Nhập số để chọn:\n" +
                    "1.\tTìm kiếm thông tin sản phẩm nhập khẩu\n" +
                    "2.\tTìm kiếm thông tin sản phẩm Xuất khẩu\n" +
                    "3.\tQuay lại Menu\n" +
                    "4.\tThoát.");
            System.out.println("Bạn có thể chọn từ 1-4");
            choose = InputKeyboard.inputNumberInteger();
            switch (choose) {
                case 1:
                    managerProduct.searchCodeImport();
                    break;
                case 2:
                    managerProduct.searchCodeExtra();
                    break;
                case 3:
                    mainMenu();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Yêu cầu nhập lại.");
            }
        } while (true);
    }

    public void mainSearchNameMenu() {
        do {
            System.out.println("Nhập số để chọn:\n" +
                    "1.\tTìm kiếm thông tin sản phẩm nhập khẩu\n" +
                    "2.\tTìm kiếm thông tin sản phẩm Xuất khẩu\n" +
                    "3.\tQuay lại Menu\n" +
                    "4.\tThoát.");
            System.out.println("Bạn có thể chọn từ 1-4");
            choose = InputKeyboard.inputNumberInteger();
            switch (choose) {
                case 1:
                    managerProduct.searchNameImport();
                    break;
                case 2:
                    managerProduct.searchNameExtra();
                    break;
                case 3:
                    mainMenu();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Yêu cầu nhập lại.");
            }
        } while (true);
    }

    public void mainDeleteMenu() {
        do {
            System.out.println("Nhập số để chọn:\n" +
                    "1.\tXóa thông tin sản phẩm Nhập khẩu\n" +
                    "2.\tXóa thông tin sản phẩm Xuất khẩu\n" +
                    "3.\tQuay lại Menu\n" +
                    "4.\tThoát.");
            System.out.println("Bạn có thể chọn từ 1-4");
            choose = InputKeyboard.inputNumberInteger();
            switch (choose) {
                case 1:
                    managerProduct.deleteImport();
                    break;
                case 2:
                    managerProduct.deleteExtra();
                    break;
                case 3:
                    mainMenu();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Yêu cầu nhập lại.");
            }
        } while (true);
    }
}
