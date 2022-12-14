package Exercise1;

public class MVCPatternDemo
{
    public static void main(String [] args)
    {
        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("Человек");
        System.out.println("\nОбновление данных студента успешно пройдено!");
        controller.updateView();
    }

    private static Student retriveStudentFromDatabase()
    {
        Student Student = new Student();
        Student.setName("Не человек");
        Student.setRollNo("dude");
        return Student;
    }
}
