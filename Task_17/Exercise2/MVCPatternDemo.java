package Exercise2;

import Exercise2.Employee;
import Exercise2.EmployeeController;
import Exercise2.EmployeeView;

public class MVCPatternDemo
{
    public static void main(String [] args)
    {
        Employee model = retriveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
        controller.setEmployeeName("Не человек");
        controller.setEmployeeWages(1000);
        System.out.println("\nОбновление данных работника успешно пройдено!");
        controller.updateView();
    }

    private static Employee retriveEmployeeFromDatabase()
    {
        Employee Employee = new Employee();
        Employee.setName("Человек");
        Employee.setWages(100);
        return Employee;
    }
}
