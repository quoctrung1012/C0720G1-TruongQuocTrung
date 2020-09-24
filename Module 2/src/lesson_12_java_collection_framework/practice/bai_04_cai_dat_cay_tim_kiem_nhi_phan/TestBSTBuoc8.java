package lesson_12_java_collection_framework.practice.bai_04_cai_dat_cay_tim_kiem_nhi_phan;

public class TestBSTBuoc8 {
    //Bước 8: Tạo lớp TestBST chứa phương thức main thực thi ứng dụng
    public static void main(String[] args) {
        //create a BST
        BSTBuoc4<String> tree = new BSTBuoc4<>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");
        //traverse tree
        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println("The number of nodes is: " + tree.getSize());
    }
}
