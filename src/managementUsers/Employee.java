package managementUsers;

public class Employee {
    public static void employeeMethod(String[] arrayName, int[] arrayAge, int[] arraySalary){
        boolean isEmpty = true;
        for (int i = 0; i < arrayName.length; i++) {
            if (arrayName[i] != null && arrayAge[i] != 0 && arraySalary[i] != 0){
                System.out.println("\n" + (i + 1) + " Сотрудник: " + arrayName[i] + " Возраст: " + arrayAge[i] + " Зарплата: " + arraySalary[i]);
                isEmpty = false;
            }
            if (isEmpty){
                System.out.println("\nСотрудников нет в списке!\n");
                break;
            }
       }
    }
}
