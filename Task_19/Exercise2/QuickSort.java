package Exercise2;

import java.util.Objects;
import java.util.Scanner;

public class QuickSort {
    private static SortingStudentsByGPA comparator = new SortingStudentsByGPA();
    public static void quickSort(Student[] array, int low, int high){
        if(array == null || array.length == 0)
            return;
        if(high <= low)
            return;
        Student middle = array[(low + high)/2];
        int i = low;
        int j = high;
        while (i <= j){
            while (comparator.compare(middle, array[i]) < 0)
                i++;
            while (comparator.compare(middle, array[j]) > 0)
                j--;
            if (i <= j) {
                Student tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);
        else if (high > i)
            quickSort(array, i, high);
    }

    public static Student[] setArray(){
        System.out.print("Введите количество студентов: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        Student [] iDNumber = new Student[size];
        String name_1, name_2, speciality, group;
        int GPA, course;
        for (int i = 0; i < size; ++i){
            System.out.print("Введите имя студента: ");
            name_1 = scan.next();
            System.out.print("Введите фамилию студента: ");
            name_2 = scan.next();
            System.out.print("Введите специальность студента: ");
            speciality = scan.next();
            System.out.print("Введите курс студента: ");
            course = scan.nextInt();
            System.out.print("Введите группа студента: ");
            group = scan.next();
            System.out.print("Введите среднюю оценку студента: ");
            GPA = scan.nextInt();
            iDNumber[i] = new Student(name_1, name_2, speciality, course, group, GPA);
        }
        return iDNumber;
    }

    public static Student findStudent(Student[] all, String name) throws StudentNotFoundExeption {
        for (Student el: all){
            if (Objects.equals(el.getName(), name))
                return el;
        }
        throw new StudentNotFoundExeption("Такого студента нет");
    }

    public static void main(String []args) throws StudentNotFoundExeption {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество студентов: ");
        int size = scan.nextInt();
        Student [] iDNumber = new Student[size];
        for (int i = 0; i < size; ++i){
            System.out.println("Введите имя студента " + i + ":");
            String name = scan.nextLine();
            if (Objects.equals(name, ""))
                try {
                    throw new EmptyStringExeption("Введена пустая строка");
                } catch (EmptyStringExeption e) {
                    System.out.println("Ввели пустое имя. Попробуйте снова");
                    i--;
                    continue;
                }
            System.out.println("Введите средний балл студента: ");
            String GPAstr = scan.nextLine();
            try{
                int GPA = Integer.parseInt(GPAstr);
                iDNumber[i] = new Student(name, GPA);
            }
            catch(NumberFormatException ignored){
                System.out.println("Ввели некорректное число. Попробуйте снова");
                i--;
            }
        }
        quickSort(iDNumber, 0, iDNumber.length - 1);
        for (Student s : iDNumber)
            System.out.println(s);
        String name;
        while (true){
            System.out.print("Введите имя студента, которого хотите найти: ");
            name = scan.nextLine();
            if (Objects.equals(name, "")){
                try {
                    throw new EmptyStringExeption("Введена пустая строка");
                }
                catch (EmptyStringExeption e) {
                    System.out.println("Ввели пустое имя. Попробуйте снова");
                }
            }
            else break;
        }
        Student ans = findStudent(iDNumber, name);
        System.out.print(ans.getGPA());
    }
}
