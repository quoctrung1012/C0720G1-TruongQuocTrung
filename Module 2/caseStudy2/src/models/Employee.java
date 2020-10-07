package models;

public class Employee {
    private String idEmployee;
    private String fullNameEmployee;
    private String ageEmployee;
    private String addressEmployee;

    public Employee() {
    }

    public Employee(String idEmployee, String fullNameEmployee, String ageEmployee, String addressEmployee) {
        this.idEmployee = idEmployee;
        this.fullNameEmployee = fullNameEmployee;
        this.ageEmployee = ageEmployee;
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

    public String getAddressEmployee() {
        return addressEmployee;
    }

    public void setAddressEmployee(String addressEmployee) {
        this.addressEmployee = addressEmployee;
    }

    @Override
    public String toString() {
        return "Employee: " +
                "\nId Employee: " + idEmployee +
                "\nFull Name Employee: " + fullNameEmployee +
                "\nAge Employee: " + ageEmployee +
                "\nAddress Employee: " + addressEmployee +
                "\n-------------------------------------";
    }
}
