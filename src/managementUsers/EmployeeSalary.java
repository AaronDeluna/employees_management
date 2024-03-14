package managementUsers;

import java.util.Scanner;

public class EmployeeSalary {
    public static void employeeSalaryMethod(String[] arrayName, int[] arrayAge, int[] arraySalary, Scanner scanner){
        Employee.employeeMethod(arrayName, arrayAge, arraySalary);
        System.out.println("Введите номер сотрудника: ");
        int employeeIndex = scanner.nextInt();
        System.out.println("Введите новую зарплату сотрудника: ");
        int newSalary = scanner.nextInt();
        arraySalary[employeeIndex - 1] = newSalary;
    }
}
