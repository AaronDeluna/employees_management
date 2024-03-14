import java.util.Scanner;

public class SearchForAnEmployeeByName {
    public static void SearchForAnEmployeeByNameMethod(String[] arrayName, int[] arrayAge, int[] arraySalary, Scanner scanner){
        for (int i = 0; i < arrayName.length; i++) {
            System.out.println("Введите имя сотрудника: ");
            String employeeName = scanner.next();
            if (arrayName[i].equals(employeeName)){
                System.out.println("Такой сотрудник есть!");
            }else {
                System.out.println("Такого сотрудника нет!");
            }
        }
    }
}
