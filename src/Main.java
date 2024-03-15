import userManagement.Employee;
import userManagement.EmployeeManager;
import userManagement.EmployeeSalary;
import userManagement.SearchForAnEmployeeByName;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //String int double массивы данных
        String[] arrayListName = new String[10];
        int[] arrayListAge = new int[10];
        int[] arraylistSalary = new int[10];

        //счетчик
        int counter = 0;

        System.out.println("Вас приведствует сервис, по управлению сотрудниками!");
        String a = "1. Добавление сотрудника",
                b = "2. Показать всех сотрудников",
                c = "3. Изменение зарплаты сотрудника",
                d = "4. Вывод списка сотрудников",
                e = "5. Поиск сотрудника по имени",
                f = "6. Выйти из приложения";

        boolean run = true;
        while (run){
            System.out.printf("\nВыберите действие: \n%s \n%s \n%s \n%s \n%s \n%s \n", a, b, c, d, e, f);
            int userCommand = scanner.nextInt();

            if (userCommand >= 1 && userCommand <= 6){
                switch (userCommand){
                    case 1 -> {
                        EmployeeManager.employeeManagerMethod(arrayListName, arrayListAge, arraylistSalary, counter, scanner);
                        counter++;
                    }
                    case 2 -> Employee.employeeMethod(arrayListName, arrayListAge, arraylistSalary);
                    case 3 -> EmployeeSalary.employeeSalaryMethod(arrayListName, arrayListAge, arraylistSalary, scanner);
                    case 4 -> System.out.println("Раздел в разработке!");
                    case 5 -> SearchForAnEmployeeByName.SearchForAnEmployeeByNameMethod(arrayListName, arrayListAge, arraylistSalary, scanner);
                    case 6 -> {
                        System.out.println("Всего доброго!");
                        run = false;
                    }
                }
            }else {
                System.out.println("Не верная команда, проверьте команду!");
            }
        }
    }
}