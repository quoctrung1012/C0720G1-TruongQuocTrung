package lesson_17_io_binary_file_and_serialization.exercise.bai_01_quan_ly_san_pham_luu_ra_file_nhi_phan;

import java.util.*;

public class AddShowSearchProduct {
    private static final Scanner scanner = new Scanner(System.in);
    public static List<Product> productList = new ArrayList<>();
    public static Product product = new Product();


    public static void addProduct() {
        try {
            System.out.print("Input Id Product: ");
            product.setIdProduct(Integer.parseInt(scanner.nextLine()));

            System.out.print("Input Name Product: ");
            product.setNameProduct(scanner.nextLine());

            System.out.print("Input Name Producer: ");
            product.setNameProducer(scanner.nextLine());

            System.out.print("Input Price Product: ");
            product.setPrice(Double.parseDouble(scanner.nextLine()));

            System.out.print("Input Product Description: ");
            product.setProductDescription(scanner.nextLine());

            productList.add(product);
            InputProductInFormation.writeObjectList(productList);
        } catch (InputMismatchException ex) {
            System.err.println("You are entering the string. Please input again");
        } catch (NumberFormatException ex) {
            System.err.println("Please input again");
        }
    }

    public static void showProduct() {
        List<Product> output = InputProductInFormation.readObjectList();
        for (Product product : output) {
            System.out.println(product.toString());
        }
    }

    public static void searchProduct() {
        List<Product> output = InputProductInFormation.readObjectList();
        System.out.println("------------------------------------");
        System.out.println("Input Name Producer You Want Search");
        String nameProducerSearch = scanner.nextLine();
        for (int i = 0; i < output.size(); i++) {
            if (nameProducerSearch.equals(output.get(i).getNameProducer())) {
                System.out.println(output.get(i).toString());
            } else {
                System.out.println("Not found");
            }
        }
    }

    public static void mainProduct() {
        while (true) {
            try {
                int chooseProduct;
                do {
                    System.out.println("----------------Menu----------------\n" +
                            "1. Add Product\n" +
                            "2. Show Product\n" +
                            "3. Search Product\n" +
                            "4. Exit\n" +
                            "------------------------------------");
                    System.out.print("Your choose from 1 to 4: ");
                    chooseProduct = Integer.parseInt(scanner.nextLine());
                    switch (chooseProduct) {
                        case 1:
                            addProduct();
                            break;
                        case 2:
                            showProduct();
                            break;
                        case 3:
                            searchProduct();
                            break;
                        case 4:
                            System.exit(0);
                            System.err.println("------------------------------------");
                            System.err.println("See you again!!");
                            System.err.println("------------------------------------");
                            break;
                        default:
                            System.out.println("Input Again!!!");
                    }
                } while (chooseProduct >= 0 && chooseProduct <= 4);
            } catch (NumberFormatException ex) {
                System.out.println("You are entering the string. Please input again");
            }
        }
    }
}
