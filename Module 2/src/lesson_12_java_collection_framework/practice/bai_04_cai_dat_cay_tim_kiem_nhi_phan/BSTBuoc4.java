package lesson_12_java_collection_framework.practice.bai_04_cai_dat_cay_tim_kiem_nhi_phan;

public class BSTBuoc4<E extends Comparable<E>> extends AbstractTreeBuoc3<E> {
    //Bước 4: Tạo lớp BST
    protected TreeNodeBuoc1<E> root;
    protected int size = 0;

    public BSTBuoc4() {
    }

    public BSTBuoc4(E[] objects) {
        for (int i = 0; i < objects.length; i++)
            insert(objects[i]);
    }
    //Bước 5: Cài đặt phương chèn trong BST
    @Override
    public boolean insert(E e) {
        if (root == null)
            root = createNewNode(e); /*create a new root*/
        else {
            /*locate the parent node*/
            TreeNodeBuoc1<E> parent = null;
            TreeNodeBuoc1<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else
                    return false; /*Duplicate node not inserted*/
            }
            if (e.compareTo(parent.element) < 0)
                parent.left = createNewNode(e);
            else
                parent.right = createNewNode(e);
        }
        size++;
        return true; /*element inserted successfully*/
    }

    protected TreeNodeBuoc1<E> createNewNode(E e) {
        return new TreeNodeBuoc1<>(e);
    }
    //Bước 6: Cài đặt phương thức getSize()
    @Override
    public int getSize() {
        return 0;
    }
    //Bước 7: Cài đặt phương thức duyệt cây theo thứ tự inorder
    @Override
    public void inorder() {
        inorder(root);
    }

    protected void inorder(TreeNodeBuoc1<E> root) {
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.element + " ");
        inorder(root.right);
    }
}