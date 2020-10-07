package lesson_18_string_and_regex.exercise.bai_01_validate_class_name;

public class ClassNameTest {
    private static ClassName classNameValidate;
    private static final String[] validClassName = new String[]{"C0318G", "C0720G", "C0820G"};
    private static final String[] invalidClassName = new String[]{"M0318G", "P0323A", "A05454C"};

    public static void main(String[] args) {
        classNameValidate = new ClassName();
        for (String className : validClassName) {
            boolean isValid = classNameValidate.validate(className);
            System.out.println("Class name: " + className + " is valid: " + isValid);
        }
        for (String className : invalidClassName) {
            boolean isValid = classNameValidate.validate(className);
            System.out.println("Class name: " + className + " is valid: " + isValid);
        }
    }
}
