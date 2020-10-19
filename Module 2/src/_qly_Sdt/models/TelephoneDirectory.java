package _qly_Sdt.models;

public class TelephoneDirectory {
    private int orderPhone;
    private String phoneNumber;
    private String contactGroup;
    private String fullName;
    private String gender;
    private String address;
    private String birthday;
    private String email;

    public TelephoneDirectory() {
    }

    public TelephoneDirectory(int orderPhone, String phoneNumber, String contactGroup, String fullName, String gender, String address, String birthday, String email) {
        this.orderPhone = orderPhone;
        this.phoneNumber = phoneNumber;
        this.contactGroup = contactGroup;
        this.fullName = fullName;
        this.gender = gender;
        this.address = address;
        this.birthday = birthday;
        this.email = email;
    }

    public int getOrderPhone() {
        return orderPhone;
    }

    public void setOrderPhone(int orderPhone) {
        this.orderPhone = orderPhone;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContactGroup() {
        return contactGroup;
    }

    public void setContactGroup(String contactGroup) {
        this.contactGroup = contactGroup;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "TelephoneDirectory{" +
                "Số thứ tự: " + orderPhone +
                ", Số điện thoại: " + phoneNumber + '\'' +
                ", Nhóm danh bạ: " + contactGroup + '\'' +
                ", Họ và Tên: " + fullName + '\'' +
                ", Giới tính: " + gender + '\'' +
                ", Địa chỉ: " + address + '\'' +
                ", Ngày Sinh: '" + birthday + '\'' +
                ", Email: '" + email + '\'' +
                '}';
    }
}
