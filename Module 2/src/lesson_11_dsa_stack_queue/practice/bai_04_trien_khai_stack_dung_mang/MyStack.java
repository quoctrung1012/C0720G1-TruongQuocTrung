package lesson_11_dsa_stack_queue.practice.bai_04_trien_khai_stack_dung_mang;

public class MyStack {
    //Bước 1: Tạo lớp MyStack với các thuộc tính:
    private int arr[];
    private int size;
    private int index = 0;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    //Bước 2: Cài đặt phương thức push()
    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
        index++;
    }

    //Bước 3: Cài đặt phương thức pop()
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }

    //Bước 4: Cài đặt phương thức size()
    public int size() {
        return index;
    }

    //Bước 5: Cài đặt phương thức isEmpty()
    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }

    //Bước 6: Cài đặt phương thức isFull()
    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }
}
