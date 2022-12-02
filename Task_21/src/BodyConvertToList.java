import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
1)Написать метод для конвертации массива строк/чисел в
список.
 */

public class BodyConvertToList<E>
{

    private List<E> list = new ArrayList<>();

    public BodyConvertToList(E[] array)
    {
        list.addAll(Arrays.asList(array));
    }

    public void showList()
    {
        for (Object ls : list)
        {
            System.out.print(ls + " ");
        }
        System.out.println();
    }

    public void add(E element)
    {
        list.add(element);
    }

    public List getList()
    {
        return list;
    }
}