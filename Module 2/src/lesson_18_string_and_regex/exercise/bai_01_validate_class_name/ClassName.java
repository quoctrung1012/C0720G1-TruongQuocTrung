package lesson_18_string_and_regex.exercise.bai_01_validate_class_name;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    //"^[C|A|P]+[0-9]{4}+[G|H|I|K|L|M]$"
    private static final String CLASS_NAME ="^(C|A|P)\\d{4}(G|H|I|K|L|M)$";

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(CLASS_NAME);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
