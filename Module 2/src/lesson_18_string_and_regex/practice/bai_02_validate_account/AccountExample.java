package lesson_18_string_and_regex.practice.bai_02_validate_account;

import java.util.regex.*;

public class AccountExample {
    /*Không chứa các ký tự đặc biệt
	  Phải dài hơn 6 ký tự
	  Không chứa các ký tự viết hoa
	  Cho phép dấu gạch dưới (_)
	*/
    private static final String ACCOUNT_REGEX = "^[a-z0-9_]{6,}$";

    public AccountExample() {
    }


    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher  matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
