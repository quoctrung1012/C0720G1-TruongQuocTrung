package lesson_12_java_collection_framework.exercise.bai_01_luyen_tap_su_dung_arraylist_va_linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Product> arrayList = new ArrayList<>();

    public static void menu() {
        int choose;
        do {
            System.out.println(
                    "Yêu cầu nhập lựa chon:" +
                            "\n1. Thêm thông tin sản phẩm: " +
                            "\n2. Hiển thị thông tin sản phẩm" +
                            "\n3. Chỉnh sửa thông tin sản phẩm" +
                            "\n4. Xóa thông tin sản phẩm " +
                            "\n5. Tìm kiếm sản phẩm " +
                            "\n6. Sắp xếp theo giá sản phẩm " +
                            "\n7. Exit.");
            System.out.print("Sự lựa chọn của bạn: ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    displayProduct();
                    break;
                case 3:
                    repairProduct();
                    break;
                case 4:
                    delProduct();
                    break;
                case 5:
                    searchProduct();
                    break;
                case 6:
                    sortPriceProduct();
                    break;
                case 7:
                    break;
            }
        } while (choose >= 1 && choose <= 6);
    }

    public static void sortPriceProduct() {
        System.out.println(
                "Nhập sự lựa chọn: " +
                        "\n1. Giá tăng dần." +
                        "\n2. Giá giảm dần");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                ascendingPriceProduct();
                break;
            case 2:
                decreasePriceProduct();
                break;

        }
    }

    public static void decreasePriceProduct() {
        Collections.sort(arrayList, new decreaseProduct());
    }

    public static void ascendingPriceProduct() {
        Collections.sort(arrayList, new ascendingProduct());
        displayProduct();
    }

    public static void searchProduct() {
        System.out.println("Nhập tên sản phẩm bạn muốn tìm kiếm");
        scanner.nextLine();
        String name = scanner.nextLine();
        for (int i = 0; i < arrayList.size(); i++) {
            if (name.equals(arrayList.get(i).getName())) {
                System.out.println(arrayList.get(i));
            }
        }
    }

    public static void delProduct() {
        System.out.println("Nhập id sản phẩm muốn xóa");
        int id = scanner.nextInt();
        for (int i = 0; i < arrayList.size(); i++) {
            if (id == arrayList.get(i).getId()) {
                arrayList.remove(i);
            }
        }
        System.out.println("Kết quả");
        displayProduct();
    }

    public static void repairProduct() {
        System.out.println("Nhập id sản phẩm bạn muốn sửa");
        int id = scanner.nextInt();
        for (int i = 0; i < arrayList.size(); i++) {
            if (id == arrayList.get(i).getId()) {
                System.out.println(arrayList.get(i));
                scanner.nextLine();
                System.out.println("Nhập tên sản phẩm: ");
                String name = scanner.nextLine();
                arrayList.get(i).setName(name);
                System.out.println(arrayList.get(i));
            }
        }
    }

    public static void displayProduct() {
        for (Product product : arrayList) {
            System.out.println(product);
        }
    }

    public static void addProduct() {
        Product product = new Product();
        System.out.print("Nhập id sản phẩm: ");
        product.setId(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Nhập Tên sản phẩm");
        product.setName(scanner.nextLine());

        System.out.print("Nhập thông tin giới thiệu sản phẩm");
        product.setProductInformation(scanner.nextLine());

        System.out.print("Nhập giá sản phẩm");
        product.setPrice(scanner.nextDouble());

        arrayList.add(product);
    }
}

