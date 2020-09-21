package lesson_10_dsa_array_list.exercise.bai_01_trien_khai_cac_phuong_thuc_cua_arraylist_theo_thu_vien_java.util.ArrayList;

import java.util.Arrays;

public class MyList<E> {
    public int size = 0;
    public static final int DEFAULT_CAPACITY = 10;
    public Object elements[];

    //Sức chứa mặc định = 10
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    //phương thức constructor với sức chứa truyền vào
    public MyList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
    }

    //phương thức trả về số lượng phần tử
    public int size() {
        return this.size;
    }

    //phương thức xóa toàn bộ phần tử trong arraylist
    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    //phương thức add 1 phần tử vào MyList
    public boolean add(E element) {
        if (elements.length == size) {
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }

    //phương thức add 1 phần tử vào MyList tại vị trí index
    public void add(E element, int index) {
        if (index > elements.length) {
            throw new IllegalArgumentException("index: " + index);
        } else if (elements.length == size) {
            this.ensureCapacity(5);
        }
        if (elements[index] == null) {
            elements[size] = element;
            size++;
        } else {
            for (int i = size; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }

    // Phương thức tăng kích thước của mảng MyList
    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity: " + minCapacity);
        }
    }

    //Phương thức lấy 1 element tại vị trí index.
    public E get(int index) {
        return (E) elements[index];
    }

    //phương thức lấy index của một phần tử trong mảng MyList
    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return index;
    }

    //phương thức kiểm tra 1 phần tử có ở trong mảng hay không.
    public boolean contains(E element) {
        return this.indexOf(element) >= 0;
    }

    // phương thức tạo ra một bảng sao của mảng cú MyList
    public MyList<E> clone() {
        MyList<E> v = new MyList<>();
        v.elements = Arrays.copyOf(this.elements, this.size);
        v.size = this.size;
        return v;
    }
    // phương thức xóa một phần tử khỏi mảng
    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IllegalArgumentException("Error index: " + index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }
}

