package lesson_01_introduction_to_java.exercise;

import java.util.Scanner;

public class Bai02UngDungDocSoThanhChu {

    public static void hangDonVi(int donVi){
        switch (donVi){
            case 0:
                System.out.print(" Không");
                break;
            case 1:
                System.out.print(" Một");
                break;
            case 2:
                System.out.print(" Hai");
                break;
            case 3:
                System.out.print(" Ba");
                break;
            case 4:
                System.out.print(" Bốn");
                break;
            case 5:
                System.out.print(" Năm");
                break;
            case 6:
                System.out.print(" Sáu");
                break;
            case 7:
                System.out.print(" Bảy");
                break;
            case 8:
                System.out.print(" Tám");
                break;
            case 9:
                System.out.print(" Chín");
                break;
        }
    }
    public static void hangChuc(int hangChuc){
        switch (hangChuc){
            case 0:
                System.out.print(" Linh");
                break;
            case 1:
                System.out.print(" Mười");
                break;
            case 2:
                System.out.print(" Hai Mươi");
                break;
            case 3:
                System.out.print(" Ba Mươi");
                break;
            case 4:
                System.out.print(" Bốn Mươi");
                break;
            case 5:
                System.out.print(" Năm Mươi");
                break;
            case 6:
                System.out.print(" Sáu Mươi");
                break;
            case 7:
                System.out.print(" Bảy Mươi");
                break;
            case 8:
                System.out.print(" Tám Mươi");
                break;
            case 9:
                System.out.print(" Chín Mươi");
                break;
        }
    }
    public static void hangTram(int hangTram){
        switch (hangTram) {
            case 0:
                System.out.print("Linh");
                break;
            case 1:
                System.out.print("Một Trăm");
                break;
            case 2:
                System.out.print("Hai Trăm");
                break;
            case 3:
                System.out.print("Ba Trăm");
                break;
            case 4:
                System.out.print("Bốn Trăm");
                break;
            case 5:
                System.out.print("Năm Trăm");
                break;
            case 6:
                System.out.print("Sáu Trăm");
                break;
            case 7:
                System.out.print("Bảy Trăm");
                break;
            case 8:
                System.out.print("Tám Trăm");
                break;
            case 9:
                System.out.print("Chín Trăm");
                break;
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Điền số cần đọc: ");
        int nhapSo = scanner.nextInt();
        int hangDonVi = nhapSo % 10;
        int hangChuc = (nhapSo / 10) % 10;
        int hangTram = (nhapSo / 100) % 10;

//        if (hangChuc != 0){
//            if (hangChuc == 0){
//                hangDonVi(hangDonVi);
//            }   else {
//                hangChuc(hangChuc);
//                hangDonVi(hangDonVi);
//            }
//        }   else {
//
//        }
        if ((hangChuc == 0) && (hangChuc != 0)){
            hangDonVi(hangDonVi);
        }   else if ((hangTram == 0) && (hangTram != 0)){
            hangChuc(hangChuc);
            hangDonVi(hangDonVi);
        }   else {
            hangTram(hangTram);
            hangChuc(hangChuc);
            hangDonVi(hangDonVi);
        }
    }
}

