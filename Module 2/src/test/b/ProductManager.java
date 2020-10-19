import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//public class ProductManager {
//    private List<Product> productList;
//    private List<Integer> idList = new ArrayList<>();
//
//    public ProductManager() {
//        this.productList = ProductFile.readFile();
//    }
//
//    private boolean isYes() {
//        System.out.println("Press 1: Yes - Press 2: No");
//        while (true) {
//            String choose = InputKeyboard.inputCharacter();
//            switch (choose) {
//                case "1":
//                    return true;
//                case "2":
//                    return false;
//                default:
//                    System.out.println("Invalid! Please choose again!");
//                    break;
//            }
//        }
//    }
//
//    public void addProduct() {
////        int id = (productList.size() > 0) ? (productList.size() + 1) : 1;
//        for (Product product : productList) {
//            idList.add(product.getId());
//        }
//        int id = (productList.size() == 0) ? 1 : Collections.max(idList) + 1;
//        System.out.println("Id of new product: " + id);
//        System.out.println("Enter name product:");
//        String name = InputKeyboard.inputCharacter();
//        System.out.println("Enter manufacturer product:");
//        String manufacturer = InputKeyboard.inputCharacter();
//        System.out.println("Enter price product:");
//        double price = InputKeyboard.inputNumberDouble();
//        System.out.println("Enter description product:");
//        String description = InputKeyboard.inputCharacter();
//
//        productList.add(new Product(id, name, manufacturer, price, description));
//        ProductFile.writeFile(productList);
//        System.out.println("Added new product successfully");
//    }
//
//    private Product chooseProduct(List<Product> productList) {
//        do {
//            System.out.println("Enter order number product:");
//            int order = InputKeyboard.inputNumberInteger();
//            if (order <= productList.size()) {
//                return productList.get(order - 1);
//            } else {
//                System.err.println("Invalid! Please enter again!");
//            }
//        } while (true);
//    }
//
//    public void editProduct() {
//        showProductList();
//        Product product = chooseProduct(productList);
//        System.out.println("Are you sure you want to edit:");
//        System.out.println(product);
//        if (isYes()) {
//            System.out.println("Enter name product:");
//            product.setName(InputKeyboard.inputCharacter());
//            System.out.println("Enter manufacturer product:");
//            product.setManufacturer(InputKeyboard.inputCharacter());
//            System.out.println("Enter price product:");
//            product.setPrice(InputKeyboard.inputNumberDouble());
//            System.out.println("Enter description product:");
//            product.setDescription(InputKeyboard.inputCharacter());
//            ProductFile.writeFile(productList);
//            System.out.println("Edited successfully");
//        }
//    }
//
//    public void deleteProduct() {
//        showProductList();
//        Product product = chooseProduct(productList);
//        System.out.println("Are you sure you want to delete:");
//        System.out.println(product);
//        if (isYes()) {
//            productList.remove(product);
//            ProductFile.writeFile(productList);
//            System.out.println("Deleted successfully");
//        }
//    }
//
//    public void showProductList() {
//        if (productList.size() != 0) {
//            int i = 1;
//            for (Product product : productList) {
//                System.out.println("No " + (i++) + ": " + product);
//            }
//        } else {
//            System.out.println("No product that show");
//        }
//    }
//
//    public void searchProductByName() {
//        System.out.println("Enter name product:");
//        String name = InputKeyboard.inputCharacter();
//        boolean isNameExits = false;
//        name = name.toLowerCase();
//        for (Product product : productList) {
//            String lowerNameProduct = product.getName().toLowerCase();
//            if (lowerNameProduct.contains(name)) {
//                System.out.println(product);
//                isNameExits = true;
//            }
//        }
//        if (!isNameExits) {
//            System.out.println("Product no found");
//        }
//    }
//
//    public void sortProductByPrice() {
//        Collections.sort(productList, new SortProductByPrice());
//        int i = 1;
//        for (Product product : productList) {
//            System.out.println("No " + (i++) + ": " + product);
//        }
//    }
//}
