import java.util.Scanner;

public class EmployeeManager {
    public static void employeeManagerMethod(String[] arrayName, int[] arrayAge, int[] arraySalary, int counter, Scanner scanner){
        System.out.println("Введите имя вашего сотрудника: ");
        String employeeName = scanner.next();
        System.out.println("Введите сколько лет сотруднику: ");
        int employeeAge = scanner.nextInt();
        System.out.println("Зарплата сотрудника: ");
        int employeeSalary = scanner.nextInt();
        arrayName[counter] = employeeName;
        arrayAge[counter] = employeeAge;
        arraySalary[counter] = employeeSalary;
    }
}
