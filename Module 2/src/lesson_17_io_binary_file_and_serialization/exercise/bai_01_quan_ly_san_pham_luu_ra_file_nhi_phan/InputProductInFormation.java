package lesson_17_io_binary_file_and_serialization.exercise.bai_01_quan_ly_san_pham_luu_ra_file_nhi_phan;

import test.a.test.Student;

import java.io.*;
import java.util.*;

public class InputProductInFormation {
    private static final String PATH_FILE = "E:\\App Codegym\\C0720G1-TruongQuocTrung\\Module 2\\src\\lesson_17_io_binary_file_and_serialization\\exercise\\bai_01_quan_ly_san_pham_luu_ra_file_nhi_phan\\data\\data.txt";

//    public static void writeFile(Product product) {
//        FileOutputStream fileOutputStream;
//        ObjectOutputStream objectOutputStream = null;
//        try {
//            fileOutputStream = new FileOutputStream(PATH_FILE);
//            objectOutputStream = new ObjectOutputStream(fileOutputStream);
//
//            objectOutputStream.writeObject(product);
//            objectOutputStream.close();
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                objectOutputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }

//    public static Product readFile() {
//        Product product = null;
//        FileInputStream fileInputStream = null;
//        ObjectInputStream objectInputStream = null;
//        try {
//            fileInputStream = new FileInputStream(PATH_FILE);
//            objectInputStream = new ObjectInputStream(fileInputStream);
//            product = (Product) objectInputStream.readObject();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                objectInputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            return product;
//        }
//    }

    public static void writeObjectList(List<Product> productList) {
        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(PATH_FILE);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(productList);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<Product> readObjectList() {
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream = null;
        List<Product> productList = null;

        try {
            fileInputStream = new FileInputStream(PATH_FILE);
            objectInputStream = new ObjectInputStream(fileInputStream);
            productList = (List<Product>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return productList;
    }
}
