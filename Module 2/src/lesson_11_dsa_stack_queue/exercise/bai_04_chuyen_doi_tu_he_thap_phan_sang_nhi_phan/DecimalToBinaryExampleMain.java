package lesson_11_dsa_stack_queue.exercise.bai_04_chuyen_doi_tu_he_thap_phan_sang_nhi_phan;

public class DecimalToBinaryExampleMain {
    public static void main(String[] args) {
        int decimalNumber = 123456789;
        System.out.println("Hệ nhị phân của: " + decimalNumber + " là");
        new DecimalToBinaryExample().convertBinary(decimalNumber);
    }
}
