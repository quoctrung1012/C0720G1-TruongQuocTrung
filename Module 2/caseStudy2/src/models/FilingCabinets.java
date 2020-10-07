package models;

import controllers.MainController;

import java.util.*;
import java.util.Stack;

public class FilingCabinets {
    private static Stack<Employee> employeeStack = new Stack<>();

    static {
        Map<String, Employee> stringEmployeeMap = MainController.readAllFileEmployee(MainController.EMPLOYEE);
        for (Map.Entry<String, Employee> stringEmployeeEntry : stringEmployeeMap.entrySet()) {
            employeeStack.push(stringEmployeeEntry.getValue());
        }

    }

    private static Employee getFileEmployee(String idEmployee) {
        Employee employee = null;
        while (!employeeStack.isEmpty()) {
            employee = employeeStack.pop();
            if (employee.getIdEmployee().equals(idEmployee)) {
                return employee;
            }
        }
        return employee;
    }

    public static void findEmployeeInformationInFileCabinets() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input Id employee: ");
        String idEmployee = scanner.nextLine();
        Employee employee = getFileEmployee(idEmployee);
        if (employee != null) {
            System.out.println("Employee Records: \n" + employee.toString());
        } else {
            System.out.println("Not found!!!");
        }
    }


}
