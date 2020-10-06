package lesson_18_string_and_regex.exercise.bai_02_validate_number_phone;

public class NumberPhoneTest {
    public static NumberPhone numberPhoneValidate;
    public static final String[] validNumberPhone = new String[]{"(84)-(0398558895)", "(84)-(0656656565)", "(84)-(0123456789)", "(84)-(0978489648)"};
    public static final String[] invalidNumberPhone = new String[]{" (a8)-(22222222)", "(9a)-(213154555)", "(56)-(123456789)"};

    public static void main(String[] args) {
        numberPhoneValidate = new NumberPhone();
        for (String numberPhone : validNumberPhone) {
            boolean isValid = numberPhoneValidate.validateNumberPhone(numberPhone);
            System.out.println("NumberPhone " + numberPhone + " is valid: " + isValid);
        }
        for (String numberPhone : invalidNumberPhone) {
            boolean isValid = numberPhoneValidate.validateNumberPhone(numberPhone);
            System.out.println("NumberPhone " + numberPhone + " is valid: " + isValid);
        }
    }
}
