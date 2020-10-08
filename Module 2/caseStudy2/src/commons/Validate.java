package commons;

import exceptions.*;

import java.time.Year;
import java.util.*;
import java.util.regex.*;

public class Validate {
    public static final String SERVICE_CODE_REGEX = "SV(VL|HO|RO)-[\\d]{4}";
    public static final String SERVICE_NAME_REGEX = "[A-Z][a-z]+(\\s[A-Z][a-z]*)*";
    public static final String ID_CARD_REGEX = "[\\d]{3}\\s[\\d]{3}\\s[\\d]{3}";
    public static final String DAY_REGEX = "[\\d]{2}/[\\d]{2}/[\\d]{4}";
    public static final String EXTRA_SERVICE_REGEX = "^(massage|karaoke|food|drink|car)$";
    public static final String GENDER_REGEX = "^(male|female|unknown|Male|Female|Unknown)$";

    private static Pattern pattern;
    private static Matcher matcher;

    public static boolean isValidServiceCode(String stringInput, String regex) {
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(stringInput);

        boolean flag = matcher.matches();
        if (!flag) {
            System.out.println("Input not matching(X is number 0-9). " +
                    "\nIf Villa then: SVVL-XXXX." +
                    "\nIf House then: SVHO-XXXX." +
                    "\nIf Room then: SVRO-XXXX.");
        }
        return flag;
    }

    public static boolean isValidRegexName(String stringInput, String regex) {
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(stringInput);

        boolean flag = matcher.matches();
        if (!flag) {
            System.out.println("Input not matching. Capitalize the first character");
        }
        return flag;
    }

    public static boolean isValidRegex(String stringInput, String regex) {
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(stringInput);

        boolean flag = matcher.matches();
        if (!flag) {
            System.out.println("Input not matching. " + regex);
        }
        return flag;
    }

    public static boolean isMoreThan(double numberInput, double regexNumber) {
        boolean flag = numberInput > regexNumber;
        if (!flag) {
            System.out.println("Input is not more than " + regexNumber);
        }
        return flag;
    }

    public static boolean isMoreThan(double numberInput, double startNumber, double endNumber) {
        boolean flag = numberInput > startNumber && numberInput < endNumber;
        if (!flag) {
            System.out.println("Input is not in (" + startNumber + ", " + endNumber + ")");
        }
        return flag;
    }

    public static boolean isValidExtraService(String extraService) {
        String[] list = {"massage", "karaoke", "food", "drink", "car"};
        boolean flag = Arrays.asList(list).contains(extraService);

        if (!flag) {
            System.out.println("Extra service name is not in list service.");
        }
        return flag;
    }

    public static void isValidFullName(String fullName) throws NameException {

        String[] fullNameElement = fullName.split(" ");
        for (String nameElement : fullNameElement) {
            if (Character.isLowerCase(nameElement.charAt(0))) {
                throw new NameException();
            }
        }
        for (int i = 0; i < fullName.length(); i++) {
            if (fullName.charAt(i) == ' ' && fullName.charAt(i + 1) == ' ') {
                throw new NameException();
            }
        }
    }

    public static void isValidEmail(String email) throws EmailException {
        int positionA = email.indexOf("@");
        int positionPoint = email.indexOf(".");

        if (positionA < 0) {
            throw new EmailException();
        }
        int countA = 0;
        int countPoint = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                countA++;
            } else if (email.charAt(i) == '.') {
                countPoint++;
            }
            if (countA >= 2) {
                throw new EmailException();
            }
        }
        if (countPoint == 0) {
            throw new EmailException();
        }

    }

    public static void isValidGender(String gender) throws GenderException {
        String[] list = {"male", "female", "unknown"};
        if (!Arrays.asList(list).contains(gender.toLowerCase())) {
            throw new GenderException();
        }
    }

    public static void validGender(String regex){
        pattern = Pattern.compile(GENDER_REGEX);
        matcher = pattern.matcher(regex);
        if (!matcher.matches() == false){

        }

    }

    public static void isValidIdCard(String idCard) throws IdCardException {
        if (!isValidRegex(idCard, Validate.ID_CARD_REGEX)) {
            throw new IdCardException();
        }
    }

    public static void isValidBirthday(String birthday) throws BirthdayException {
        if (isValidRegex(birthday, Validate.DAY_REGEX)) {
            int birthOfYear = Integer.parseInt(birthday.split("/")[2]);
            int currentYear = Year.now().getValue();

            if (birthOfYear <= 1800 || currentYear - birthOfYear < 18) {
                throw new BirthdayException();
            }
        } else {
            throw new BirthdayException();
        }
    }
}
