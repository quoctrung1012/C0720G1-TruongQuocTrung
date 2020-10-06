package models;

public class Customer {
    private String fullName;
    private String dateOfBirth;
    private String genderCustomer;
    private int numberIdCard;
    private int phoneNumber;
    private String emailCustomer;
    private String typeOfCustomer;
    private String addressCustomer;
    private Services services;

    public Customer() {
    }

    public Customer(String fullName, String dateOfBirth, String genderCustomer, int numberIdCard, int phoneNumber, String emailCustomer, String typeOfCustomer, String addressCustomer, Services services) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.genderCustomer = genderCustomer;
        this.numberIdCard = numberIdCard;
        this.phoneNumber = phoneNumber;
        this.emailCustomer = emailCustomer;
        this.typeOfCustomer = typeOfCustomer;
        this.addressCustomer = addressCustomer;
        this.services = services;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGenderCustomer() {
        return genderCustomer;
    }

    public void setGenderCustomer(String genderCustomer) {
        this.genderCustomer = genderCustomer;
    }

    public int getNumberIdCard() {
        return numberIdCard;
    }

    public void setNumberIdCard(int numberIdCard) {
        this.numberIdCard = numberIdCard;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", genderCustomer='" + genderCustomer + '\'' +
                ", numberIdCard=" + numberIdCard +
                ", phoneNumber=" + phoneNumber +
                ", emailCustomer='" + emailCustomer + '\'' +
                ", typeOfCustomer='" + typeOfCustomer + '\'' +
                ", addressCustomer='" + addressCustomer + '\'' +
                ", services=" + services +
                '}';
    }

    public void showInFor(){
        System.out.println(this.toString());
    }
}
