import java.util.Comparator;

class SortingStudentsByGPa implements Comparator<Student>
{
    public int compare(Student a, Student b)
    {
        return a.getGPA() - b.getGPA();
    }
}
