package _00_bai_thi.models;

public class Class {
    int idClass;
    String nameClass;
    String idTeacher;

    public Class(int idClass, String nameClass, String idTeacher) {
        this.idClass = idClass;
        this.nameClass = nameClass;
        this.idTeacher = idTeacher;
    }

    public Class() {
    }

    public int getIdClass() {
        return idClass;
    }

    public void setIdClass(int idClass) {
        this.idClass = idClass;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public String getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(String idTeacher) {
        this.idTeacher = idTeacher;
    }

    @Override
    public String toString() {
        return "Class{" +
                "idLopHoc=" + idClass +
                ", nameClass='" + nameClass + '\'' +
                ", idTeacher='" + idTeacher + '\'' +
                '}';
    }
}
