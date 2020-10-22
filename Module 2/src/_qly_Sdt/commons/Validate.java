package _qly_Sdt.commons;


import _qly_Sdt.controller.MainMenu;
import _qly_Sdt.controller.ReadAllFile;
import _qly_Sdt.exception.*;
import _qly_Sdt.models.TelephoneDirectory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private static Pattern pattern;
    private static Matcher matcher;

    public static final String STRING_REGEX = "[A-Z][a-z]+(\\s[A-Z][a-z]*)*";
    public static final String DAY_REGEX = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";
    public static final String NUMBER_PHONE = "^0\\d{9}$";
    public static final String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
    public static final String GENDER_REGEX = "^(male|female|unknown|Male|Female|unknown)$";
    public static void duoble(String input,String regex){
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(input);
    }


    public static void iRegexPhoneNumber(String input,String regex) throws ExceptionPhone {
        duoble(input,regex);
        if (!matcher.find()) throw new ExceptionPhone("Số điện thoại không hợp lệ !!!");
    }

    public static void iRegexString(String input) throws ExceptionName {
        pattern = Pattern.compile(STRING_REGEX);
        matcher = pattern.matcher(input);
        if (!matcher.find()) throw new ExceptionName("Yêu cầu viết hoa chữ cái đầu !!!");
    }

    public static void iRegexBirthday(String input) throws ExceptionBirthday {
        pattern = Pattern.compile(DAY_REGEX);
        matcher = pattern.matcher(input);
        if (!matcher.find()) throw new ExceptionBirthday("Ngày sinh khong hop le !!!");
    }

    public static void iRegexEmail(String input) throws ExceptionEmail {
        pattern = Pattern.compile(EMAIL_REGEX);
        matcher = pattern.matcher(input);
        ;
        if (!matcher.find()) throw new ExceptionEmail("Email khong hop le !!!");
    }

    public static void iTestPhoneNumber(String phoneNumber) throws NotFoundPhoneException {
        ReadAllFile.readAllFileTelephone();
        boolean test = false;
        for (TelephoneDirectory telephoneDirectory : MainMenu.telephoneList) {
            if (phoneNumber.equals(telephoneDirectory.getPhoneNumber())) {
                test = true;
                break;
            }
        }

        if (!test) throw new NotFoundPhoneException("Số điện thoại không tồn tại. Yêu cầu nhâp lại nếu muốn tìm tiếp.");
    }
}
