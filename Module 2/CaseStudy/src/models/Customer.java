package models;

public class Customer implements Comparable<Customer> {
    private String fullName;
    private String dateOfBirth;
    private String genderCustomer;
    private String numberIdCard;
    private String phoneNumber;
    private String emailCustomer;
    private String typeOfCustomer;
    private String addressCustomer;
    private Services services;

    public Customer() {
    }

    public Customer(String fullName, String dateOfBirth, String genderCustomer, String numberIdCard, String phoneNumber, String emailCustomer, String typeOfCustomer, String addressCustomer, Services services) {
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

    public String getNumberIdCard() {
        return numberIdCard;
    }

    public void setNumberIdCard(String numberIdCard) {
        this.numberIdCard = numberIdCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
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
        return "Customer:" +
                "\tFull Name Customer: " + fullName +
                "\tDate Of Birth: " + dateOfBirth +
                "\tGender Customer: " + genderCustomer +
                "\tNumber Id Card: " + numberIdCard +
                "\tPhone Number: " + phoneNumber +
                "\tEmail Customer: " + emailCustomer +
                "\tType Of Customer: " + typeOfCustomer +
                "\tAddress Customer: " + addressCustomer +
                "\tService: " + services +
                "\n-------------------------------------";
    }

    public void showInFor() {
        System.out.println(this.toString());
    }

    @Override
    public int compareTo(Customer second) {
        int result = this.fullName.compareTo(second.fullName);
        if (result == 0) {
            int yearCustomerFist = Integer.parseInt(this.dateOfBirth.split("/")[2]);
            int yearCustomerSecond = Integer.parseInt(this.dateOfBirth.split("/")[2]);
            return yearCustomerFist - yearCustomerSecond;
        }
        return result;
    }
}
