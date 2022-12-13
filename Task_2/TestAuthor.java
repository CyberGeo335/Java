import java.lang.*;
public class TestAuthor
{
    public static void main(String[] args) {
        Author a1 = new Author("Han", "hansolo@author.ru", 'M');
        Author a2 = new Author("Alek", "Alek@author.ru", 'F');
        a2.setEmail("alek@author.ru");
        System.out.println(a1);
        System.out.println(a2);
    }
}
