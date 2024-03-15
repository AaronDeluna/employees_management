package userManagement;

import java.util.Scanner;

public class EmployeeManager {
    public static void employeeManagerMethod(String[] arrayName, int[] arrayAge, int[] arraySalary, int counter, Scanner scanner){
        System.out.println("Введите имя вашего сотрудника: ");
        String employeeName = scanner.next();
        System.out.println("Введите сколько лет сотруднику: ");
        int employeeAge = scanner.nextInt();
        if (employeeAge >= 18){
            System.out.println("Зарплата сотрудника: ");
            int employeeSalary = scanner.nextInt();
            if (employeeSalary >= 0){
                arrayName[counter] = employeeName;
                arrayAge[counter] = employeeAge;
                arraySalary[counter] = employeeSalary;
            }else {
                System.out.println("Зарплата не может быть меньше 0 !");
            }
        }else {
            System.out.println("Возраст не может быть меньше 18 лет!");
        }
    }
}
