package Exercise4;

public class MinMax<T extends Comparable<T>> {
    final private T[] array;
    MinMax(T[] newArray){
        array = newArray;
    }

    T getMax(){
        T ans = array[0];
        for (int i = 1; i < array.length; ++i){
            if (ans.compareTo(array[i]) < 0)
                ans = array[i];
        }
        return ans;
    }

    T getMin(){
        T ans = array[0];
        for (int i = 1; i < array.length; ++i){
            if (ans.compareTo(array[i]) > 0)
                ans = array[i];
        }
        return ans;
    }

    public static void main(String [] args){
        Double[] tmp = new Double[3];
        tmp[0] = 5.3;
        tmp[1] = 8.1;
        tmp[2] = 6.8;
        MinMax<Double> ans = new MinMax<>(tmp);
        System.out.println(ans.getMin() + "  " + ans.getMax());
    }
}
