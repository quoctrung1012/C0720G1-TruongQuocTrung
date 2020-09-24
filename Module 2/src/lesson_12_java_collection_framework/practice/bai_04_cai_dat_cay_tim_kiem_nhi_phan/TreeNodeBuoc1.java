package lesson_12_java_collection_framework.practice.bai_04_cai_dat_cay_tim_kiem_nhi_phan;

public class TreeNodeBuoc1<E> {
    //Bước 1: Cài đặt lớp TreeNode
    protected E element;
    protected TreeNodeBuoc1<E> left;
    protected TreeNodeBuoc1<E> right;

    public TreeNodeBuoc1(E e) {
        element = e;
    }
}
