import java.text.ParseException;
import java.util.*;


public class Case5 {

    public static ArrayList<Integer> createArrayList()
    {
        ArrayList<Integer> ans = new ArrayList<>(10);
        for (int i = 0; i < 10; ++i)
            ans.add(i, i + 1);
        return ans;
    }

    public static LinkedList<Integer> createLinkedList()
    {
        LinkedList<Integer> ans = new LinkedList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; ++i)
            ans.add(i + 1);
        return ans;
    }

    public static void main(String [] args) throws ParseException
    {

        long start = System.nanoTime();
        ArrayList<Integer> first = createArrayList();
        long timeWorkCode = System.nanoTime() - start;
        System.out.println("Время добавления 10 элементов в ArrayList: " + timeWorkCode + " наносекунд");
        start = System.nanoTime();
        LinkedList<Integer> second = createLinkedList();
        timeWorkCode = System.nanoTime() - start;
        System.out.println("Время добавления 10 элементов в LinkedList: " + timeWorkCode + " наносекунд");
        start = System.nanoTime();
        first.remove(4);
        timeWorkCode = System.nanoTime() - start;
        System.out.println("Время удаления в ArrayList: " + timeWorkCode + " наносекунд");
        start = System.nanoTime();
        second.remove(4);
        timeWorkCode = System.nanoTime() - start;
        System.out.println("Время удаления в LinkedList: " + timeWorkCode + " наносекунд");
        start = System.nanoTime();
        first.add(1, 100);
        timeWorkCode = System.nanoTime() - start;
        System.out.println("Время вставки в ArrayList: " + timeWorkCode + " наносекунд");
        start = System.nanoTime();
        second.add(1, 100);
        timeWorkCode = System.nanoTime() - start;
        System.out.println("Время вставки в LinkedList: " + timeWorkCode + " наносекунд");
    }
}
