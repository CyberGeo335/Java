/*
1)Написать метод для конвертации массива строк/чисел в
список.
 */
public class ConvertToList
{

    public static void main(String[] args) {

        Integer[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        BodyConvertToList<Integer> listInt = new BodyConvertToList(numbers);
        listInt.showList();

        String[] lines = {"q", "w", "e", "r", "t", "y"};
        BodyConvertToList<String> listStr = new BodyConvertToList(lines);
        listStr.showList();
    }
}