package students.models;

public class Students {
    private String idStudent;
    private String nameStudent;
    private String birthdayStudent;
    private String emailStudent;
    private String idCardStudent;
    private String addressStudent;

    public Students() {
    }

    public Students(String idStudent, String nameStudent, String birthdayStudent, String emailStudent, String idCardStudent, String addressStudent) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        this.birthdayStudent = birthdayStudent;
        this.emailStudent = emailStudent;
        this.idCardStudent = idCardStudent;
        this.addressStudent = addressStudent;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getBirthdayStudent() {
        return birthdayStudent;
    }

    public void setBirthdayStudent(String birthdayStudent) {
        this.birthdayStudent = birthdayStudent;
    }

    public String getEmailStudent() {
        return emailStudent;
    }

    public void setEmailStudent(String emailStudent) {
        this.emailStudent = emailStudent;
    }

    public String getIdCardStudent() {
        return idCardStudent;
    }

    public void setIdCardStudent(String idCardStudent) {
        this.idCardStudent = idCardStudent;
    }

    public String getAddressStudent() {
        return addressStudent;
    }

    public void setAddressStudent(String addressStudent) {
        this.addressStudent = addressStudent;
    }

    @Override
    public String toString() {
        return "Students{" +
                "idStudent='" + idStudent + '\'' +
                ", nameStudent='" + nameStudent + '\'' +
                ", birthdayStudent='" + birthdayStudent + '\'' +
                ", emailStudent='" + emailStudent + '\'' +
                ", idCardStudent='" + idCardStudent + '\'' +
                ", addressStudent='" + addressStudent + '\'' +
                '}';
    }
}
