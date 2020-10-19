package bai_thi_module.commons;

import java.util.regex.*;

public class Validate {
    public static final String STRING_REGEX = "[\\w]+(\\s[\\w]*)*";
//    "[A-Z][a-z]+(\s[A-Z][a-z]*)*"

    public static Pattern pattern;
    public static Matcher matcher;


    public static boolean isValidRegexString(String stringInput) {
        pattern = Pattern.compile(STRING_REGEX);
        matcher = pattern.matcher(stringInput);
        boolean flag = matcher.matches();
        if (!flag) {
            System.out.println("Nhập tên đúng chuẩn(Viết hoa chữ cái đầu: )");
        }
        return flag;
    }
}
