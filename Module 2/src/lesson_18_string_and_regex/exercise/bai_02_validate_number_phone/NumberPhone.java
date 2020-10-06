package lesson_18_string_and_regex.exercise.bai_02_validate_number_phone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPhone {
    //[0-9]
    private static final String NUMBER_PHONE = "^(\\d{2})-((0)\\d{9})$";

    public boolean validateNumberPhone(String regex){
        Pattern pattern = Pattern.compile(NUMBER_PHONE);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
