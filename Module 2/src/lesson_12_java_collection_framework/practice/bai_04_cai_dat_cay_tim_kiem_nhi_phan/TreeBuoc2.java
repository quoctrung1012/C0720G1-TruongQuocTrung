package lesson_12_java_collection_framework.practice.bai_04_cai_dat_cay_tim_kiem_nhi_phan;

public interface TreeBuoc2<E> {
    //Bước 2: Cài đặt interface Tree
    /**
     * Chèn phần tử e vào cây tìm kiếm nhị phân.
     * * Trả về true nếu phần tử được chèn thành công.
     */
    public boolean insert(E e);

    /**
     * Duyệt từ gốc
     */
    public void inorder();

    /**
     * Nhận số lượng nút trong cây
     */
    public int getSize();
}

