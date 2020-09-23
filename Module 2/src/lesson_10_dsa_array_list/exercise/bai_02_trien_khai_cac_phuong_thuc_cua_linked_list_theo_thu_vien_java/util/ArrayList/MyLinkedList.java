package lesson_10_dsa_array_list.exercise.bai_02_trien_khai_cac_phuong_thuc_cua_linked_list_theo_thu_vien_java.util.ArrayList;

public class MyLinkedList<E> {

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    // phần tử đầu tiên của danh sách liên kết
    private Node head, tail;
    //số lượng phần tử trong danh sách.
    private int numNotes = 0;

    public MyLinkedList() {
    }

    public void addFirst(E element) {
        //khai báo 1 biến temp tham chiếu đến giá trị của head
        Node temp = head;
        //Biến head sẽ nhận giá trị là một node mới
        head = new Node(element);
        //head.next trỏ đến temp
        head.next = temp;
        numNotes++;
    }

    public void addLast(E element) {
        //khai báo 1 biến temp trỏ đến head
        Node temp = head;
        //Sẽ trỏ con trỏ chạy đến phần tử cuối cùng của danh sách
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNotes++;
    }

    public void add(int index, E element) {
        //khai báo biến temp trỏ đến head
        Node temp = head;
        // khai báo 1 node là holder
        Node holder;
        //Cho con trỏ chạy đến vị trí index-1
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        //cho holder tham chiếu đến vị trí index
        holder = temp.next;
        //Node tại vị trí index-1 sẽ trỏ đến vị trí Node mới
        temp.next = new Node(element);
        //node mới sẽ trỏ đến holder
        temp.next.next = holder;
        // tăng số lượng phần tử trong danh sách lên 1
        numNotes++;
    }

    public Object get(int index) {
        //khai báo biến temp trỏ đến head
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    // tính độ dài danh sách
    public int size() {
        return numNotes;
    }

    //Xóa 1 phần tử vị trí index trong danh sách
    public E remove(int index) {
        if (index < 0 || index > numNotes) {
            throw new IllegalArgumentException("Error index: " + index);
        }
        //khai báo biên temp trỏ đến head
        Node temp = head;
        Object data;
        //nếu index = 0 thì trả về data hiện tại
        if (index == 0) {
            data = temp.data;
            head = head.next;
            numNotes--;
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
            numNotes--;
        }
        return (E) data;
    }

    public boolean remove(E element) {
        //remove đối tượng nếu element head
        if (head.data.equals(element)) {
            remove(0);
            return true;
        } else {
            //khai báo 1 node temp trỏ đến head
            Node temp = head;
            while (temp.next != null) {
                //nếu như tồn tại 1 phần tử có data truyền vào thì node đó sẽ bị remove
                if (temp.next.data.equals(element)) {
                    temp.next = temp.next.next;
                    numNotes--;
                    return true;
                }
            }
        }
        return false;
    }

    public MyLinkedList<E> clone() {
        //kiểm tra linkedlist có phần tử hay không
        if (numNotes == 0) {
            throw new NullPointerException("LinkedList này null");
        }
        //khai báo biến Linkedlist trả về
        MyLinkedList<E> returnLinkedList = new MyLinkedList<>();
        //khai báo 1 temp trỏ về head
        Node temp = head;
        //add temp vào danh sách trả về để nó làm head
        returnLinkedList.addFirst((E) temp.data);
        temp = temp.next;
        while (temp != null) {
            returnLinkedList.addLast((E) temp.data);
            temp = temp.next;
        }
        return returnLinkedList;
    }

    //kiểm tra phần tử element có tồn tại trong danh sách ko
    public boolean constrains(E element) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.data.equals(element)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    //kiểm tra một element nào đó có ở trong danh sách hay ko và trả về kq vị trí nếu có, -1 khi ko thấy
    public int indexOf(E element) {
        Node temp = head;
        for (int i = 0; i < numNotes; i++) {
            if (temp.getData().equals(element)) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public E getFirst() {
        if (numNotes == 0) {
            return null;
        } else {
            return (E) head;
        }
    }

    public E getLast() {
        if (numNotes == 0) {
            return null;
        } else {
            return (E) tail;
        }
    }
}
