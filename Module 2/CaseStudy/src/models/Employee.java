package models;

public class Employee {
    private String idEmployee;
    private String fullNameEmployee;
    private String ageEmployee;
    private String idCardEmployee;
    private String phoneNumberEmployee;
    private String emailEmployee;
    private String academicLevelEmployee;
    private String positionEmployee;
    private String salaryEmployee;
    private String addressEmployee;

    public Employee() {
    }

    public Employee(String idEmployee, String fullNameEmployee, String ageEmployee, String idCardEmployee, String phoneNumberEmployee, String emailEmployee, String academicLevelEmployee, String positionEmployee, String salaryEmployee, String addressEmployee) {
        this.idEmployee = idEmployee;
        this.fullNameEmployee = fullNameEmployee;
        this.ageEmployee = ageEmployee;
        this.idCardEmployee = idCardEmployee;
        this.phoneNumberEmployee = phoneNumberEmployee;
        this.emailEmployee = emailEmployee;
        this.academicLevelEmployee = academicLevelEmployee;
        this.positionEmployee = positionEmployee;
        this.salaryEmployee = salaryEmployee;
        this.addressEmployee = addressEmployee;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getFullNameEmployee() {
        return fullNameEmployee;
    }

    public void setFullNameEmployee(String fullNameEmployee) {
        this.fullNameEmployee = fullNameEmployee;
    }

    public String getAgeEmployee() {
        return ageEmployee;
    }

    public void setAgeEmployee(String ageEmployee) {
        this.ageEmployee = ageEmployee;
    }

    public String getIdCardEmployee() {
        return idCardEmployee;
    }

    public void setIdCardEmployee(String idCardEmployee) {
        this.idCardEmployee = idCardEmployee;
    }

    public String getPhoneNumberEmployee() {
        return phoneNumberEmployee;
    }

    public void setPhoneNumberEmployee(String phoneNumberEmployee) {
        this.phoneNumberEmployee = phoneNumberEmployee;
    }

    public String getEmailEmployee() {
        return emailEmployee;
    }

    public void setEmailEmployee(String emailEmployee) {
        this.emailEmployee = emailEmployee;
    }

    public String getAcademicLevelEmployee() {
        return academicLevelEmployee;
    }

    public void setAcademicLevelEmployee(String academicLevelEmployee) {
        this.academicLevelEmployee = academicLevelEmployee;
    }

    public String getPositionEmployee() {
        return positionEmployee;
    }

    public void setPositionEmployee(String positionEmployee) {
        this.positionEmployee = positionEmployee;
    }

    public String getSalaryEmployee() {
        return salaryEmployee;
    }

    public void setSalaryEmployee(String salaryEmployee) {
        this.salaryEmployee = salaryEmployee;
    }

    public String getAddressEmployee() {
        return addressEmployee;
    }

    public void setAddressEmployee(String addressEmployee) {
        this.addressEmployee = addressEmployee;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEmployee='" + idEmployee + '\'' +
                ", fullNameEmployee='" + fullNameEmployee + '\'' +
                ", ageEmployee='" + ageEmployee + '\'' +
                ", idCardEmployee='" + idCardEmployee + '\'' +
                ", phoneNumberEmployee='" + phoneNumberEmployee + '\'' +
                ", emailEmployee='" + emailEmployee + '\'' +
                ", academicLevelEmployee='" + academicLevelEmployee + '\'' +
                ", positionEmployee='" + positionEmployee + '\'' +
                ", salaryEmployee='" + salaryEmployee + '\'' +
                ", addressEmployee='" + addressEmployee + '\'' +
                '}';
    }
}
