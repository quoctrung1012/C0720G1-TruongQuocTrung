package test.b;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.*;

public class Demo {

    public void readMyFile() {
        File file = new File("abc");
        try {
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NullPointerException x) {
            //aaaa
        } catch (Exception e) {
        }
    }

    public void readMyFile_2() throws FileNotFoundException {
        File file = new File("abc");
        FileReader fileReader = new FileReader(file);
    }

    public void div(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.err.println("Ban nhap b = 0 roi.");
        }
    }

    public int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int number = 0;
        try {
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("doc lai de di ban.");
        } catch (Exception ex) {
            System.err.println("loi sieu to");
        }
        return number;
    }

//    public int inputNumber2() throws InputException {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhap so: ");
//        int number = 0;
//
//        number = scanner.nextInt();
//        if(number == 0){
//            throw new InputException("Khong cho nhap O");
//        }
//        return number;
//    }



    public static void main(String[] args) {
        Demo demo = new Demo();
        try {
            int a = demo.inputNumber();
            int b = demo.inputNumber();
            demo.div(a, b);
        } catch (ArithmeticException e) {
            System.out.println("loi nhap xuat: "+e.getMessage());
        }


    }
}