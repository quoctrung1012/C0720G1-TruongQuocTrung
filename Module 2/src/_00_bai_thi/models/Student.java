package _00_bai_thi.models;

public class Student extends Person {
    int idClass;

    public Student(int id, String fullName, String birthday, String gender, String phoneNumber, int idClass) {
        super(id, fullName, birthday, gender, phoneNumber);
        this.idClass = idClass;
    }

    public Student(int idClass) {
        this.idClass = idClass;
    }

    public Student() {
    }

    public int getIdClass() {
        return idClass;
    }

    public void setIdClass(int idClass) {
        this.idClass = idClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idClass=" + idClass +
                ", id=" + id +
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
