package _00_bai_thi.validate;

import _00_bai_thi.models.Student;
import _00_bai_thi.menu.ReadAllFile;
import _00_bai_thi.menu.MainMenu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private static Pattern pattern;
    private static Matcher matcher;

    private static final String REGEX_NAME = "^[A-Za-z]{4,50}$";
    private static final String REGEX_BIRTHDAY = "^\\d{2}/\\d{2}/\\d{4}$";
    private static final String REGEX_PHONE_NUMBER = "^(090)|(091)\\d{7}$";

    public static void iTestName(String inputString) throws NameException {
        pattern = Pattern.compile(REGEX_NAME);
        matcher = pattern.matcher(inputString);
        if (!matcher.find()) throw new NameException("Ten khong hop le !!!");
    }

    public static void iTestBirthday(String inputString) throws BirthdayException {
        pattern = Pattern.compile(REGEX_BIRTHDAY);
        matcher = pattern.matcher(inputString);
        if (!matcher.find()) throw new BirthdayException("Ngay sinh khong hop le !!!");
    }

    public static void iTestPhoneNumber(String inputString) throws NumberPhoneException {
        pattern = Pattern.compile(REGEX_PHONE_NUMBER);
        matcher = pattern.matcher(inputString);
        if (!matcher.find()) throw new NumberPhoneException("Ngay sinh khong hop le !!!");
    }

    public static void iTestId(int id) throws NotFoundStudentException {
        ReadAllFile.readAllFileStudent();
        boolean flag = false;
        for (Student student : MainMenu.studentList) {
            if (student.getId() == id) {
                flag = true;
                break;
            }
        }

        if (!flag) throw new NotFoundStudentException("Sinh vien khong ton tai");
    }
}
