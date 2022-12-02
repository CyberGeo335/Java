/*
2) Написать класс, который умеет хранить в себе массив любых
типов данных (int, long etc.).
3) Реализовать метод, который возвращает любой элемент
массива по индексу
 */
public class AnyTypeOfArray <E>
{
    private E [] arr;

    public E getArrIndex(int i){
        return  arr[i] ;
    }

    public void setArr( E [] arr){
        this.arr =  arr;
    }

    public int getLength(){
        return  arr.length ;
    }



}