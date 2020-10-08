package commons;

import exception.*;

import javax.naming.Name;
import java.time.Year;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static Pattern pattern;
    public static Matcher matcher;
    public static final String SERVICE_VILLA_REGEX = "SVVL-[\\d]{4}";
    public static final String SERVICE_HOUSE_REGEX = "SVHO-[\\d]{4}";
    public static final String SERVICE_ROOM_REGEX = "SVRO-[\\d]{4}";
    public static final String SERVICE_STRING_REGEX = "[A-Z][a-z]+(\\s[A-Z][a-z]*)*";
    public static final String SERVICE_STRING_REGEX_2 = "^\\p{L}\\s\\p{L}*";
    public static final String SERVICE_TYPE_RENTAL = "^(Năm|Tháng|Ngày|Giờ)$";
    public static final String SERVICE_QUALITY_RENTAL = "^(Villa|House|Room)$";
    public static final String EXTRA_SERVICE_REGEX = "^(Massage|Karaoke|Food|Drink|Car)$";
    public static final String CUSTOMER_DAY_REGEX = "[\\d]{2}/[\\d]{2}/[\\d]{4}";
    public static final String CUSTOMER_ID_CARD_REGEX = "[\\d]{3}\\s[\\d]{3}\\s[\\d]{3}";
    public static final String CUSTOMER_GENDER_REGEX = "^(male|female|unknown|Male|Female|Unknown)$";
    public static final String CUSTOMER_QUALITY_CUSTOMER = "^(Diamond|Platinium|Gold|Silver|Member)$";
    public static final String CUSTOMER_NUMBER_PHONE = "0\\d{9}";
    public static final String CUSTOMER_EMAIL ="^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";

    public static boolean isValidRegex(String stringInput, String regex) {
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(stringInput);

        boolean flag = matcher.matches();
        if (!flag) {
            System.out.println("Input not matching. " + regex);
        }
        return flag;
    }

    public static boolean validateVilla(String stringInput, String regex) {
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(stringInput);
        boolean flag = matcher.matches();
        if (!flag) {
            System.out.print("Yêu cầu nhập theo chuẩn ID phòng(với Villa thì: SVVL-XXXX: ");
        }
        return flag;
    }

    public static boolean validateHouse(String stringInput, String regex) {
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(stringInput);
        boolean flag = matcher.matches();
        if (!flag) {
            System.out.println("Yêu cầu nhập theo chuẩn ID phòng(với House thì: SVHO-XXXX:");
        }
        return flag;
    }

    public static boolean validateRoom(String stringInput, String regex) {
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(stringInput);
        boolean flag = matcher.matches();
        if (!flag) {
            System.out.println("Yêu cầu nhập theo chuẩn ID phòng(với Room thì: SVRO-XXXX:");
        }
        return flag;
    }

    public static boolean isValidRegexString(String stringInput, String regex) {
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(stringInput);

        boolean flag = matcher.matches();
        if (!flag) {
            System.out.println("Nhập tên đúng chuẩn(Viết hoa chữ cái đầu: )");
        }
        return flag;
    }

    public static boolean isMoreThan(double numberInput, double regexNumber) {
        boolean flag = numberInput > regexNumber;
        if (!flag) {
            System.out.print("Nhập số lớn hơn " + regexNumber + ": ");
        }
        return flag;
    }

    public static boolean isMoreThanMid(double numberInput, double startNumber, double endNumber) {
        boolean flag = numberInput > startNumber && numberInput < endNumber;
        if (!flag) {
            System.out.println("Nhập số thông tin trong khoảng(" + startNumber + ", " + endNumber + "): ");
        }
        return flag;
    }

    public static boolean isExtraServices(String extraServices, String regex) {
        Pattern pattern = Pattern.compile(extraServices);
        Matcher matcher = pattern.matcher(regex);
        boolean flag = matcher.matches();
        if (!flag) {
            System.out.println("Resort chỉ cung cấp những dịch vụ: massage, karaoke, thức ăn, nước uống, thuê xe: ");
        }
        return flag;
    }

    public static boolean isTypeRents(String stringInput, String regex) {
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(stringInput);
        boolean flag = matcher.matches();
        if (!flag) {
            System.out.println("Yêu cầu nhập theo kiểu thuê phòng (năm, tháng, ngày, giờ)");
        }
        return flag;
    }

    public static boolean isQualityRents(String stringInput, String regex) {
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(stringInput);
        boolean flag = matcher.matches();
        if (!flag) {
            System.out.println("Yêu cầu nhập theo Cấp độ (Villa,House,Room)");
        }
        return flag;
    }

        public static boolean isQualityCustomer(String stringInput, String regex) {
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(stringInput);
        boolean flag = matcher.matches();
        if (!flag) {
            System.out.println("Yêu cầu nhập theo Cấp độ (Diamond, Platinium, Gold, Silver, Member)");
        }
        return flag;
    }
    public static boolean checkNameCustomer(String stringInput, String regex) throws NameException {
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(stringInput);
        boolean flag = matcher.matches();
        if (!flag) {
            throw new NameException("Chữ cái môt từ trong tên khách hàng phải viết hoa: ");
        }
        return flag;
    }

    public static boolean checkEmailCustomer(String stringInput, String regex) throws EmailException {
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(stringInput);
        boolean flag = matcher.matches();
        if (!flag) {
            throw new EmailException("Email khách hàng phải nhập đúng kiểu \"abc@abc.abc\"");
        }
        return flag;
    }

    public static boolean checkGenderCustomer(String stringInput, String regex) throws GenderException {
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(stringInput);
        boolean flag = matcher.matches();
        if (!flag) {
            throw new GenderException("Giới tính khách hàng chỉ được nhập(male,female,unknown : ");
        }
        return flag;
    }

    public static boolean checkIdCardCustomer(String stringInput, String regex) throws IdCardException {
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(stringInput);
        boolean flag = matcher.matches();
        if (!flag) {
            throw new IdCardException("Id khách hàng phải có 10 số(Định dạng: XXX XXX XXX)");
        }
        return flag;
    }

    public static boolean checkBirthdayCustomer(String stringInput, String regex) throws BirthdayException {
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(stringInput);
        boolean flag = matcher.matches();
        if (!flag) {
            int birthdayYear = Integer.parseInt(stringInput.split("/")[2]);
            int currentYear = Year.now().getValue();
            if (birthdayYear <= 1900 || currentYear - birthdayYear < 18) {
                throw new BirthdayException("Năm sinh của khách hàng phải lớn hơn 1900 và Khách hàng phải trên 18 tuổi.");
            } else {
                throw new BirthdayException("Năm sinh của khách hàng phải lớn hơn 1900 và Khách hàng phải trên 18 tuổi.");
            }
        }
        return flag;
    }
    public static boolean checkNumberPhone(String stringInput, String regex){
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(stringInput);
        boolean flag = matcher.matches();
        if (!flag){
            System.out.println("Yêu cầu bạn điền số điện thoại gồm 9 chữ số: ");
        }
        return flag;
    }
}
