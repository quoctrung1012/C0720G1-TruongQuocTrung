package _00_bai_thi.models;

public class Teacher extends Person {

    public Teacher(int id, String fullName, String birthday, String gender, String phoneNumber) {
        super(id, fullName, birthday, gender, phoneNumber);
    }

    public Teacher() {
    }

    @Override
    public String toString() {
        return "Teacher{" +
                " id=" + id +
                ", fullName='" + fullName + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public void showInFor() {
        this.toString();
    }
}
