package Exercise5;

import java.util.Date;
import java.util.Scanner;

public class MatrixJava{

    public static <T extends Number, V extends Number> void sumMatrix(T[][] first, V[][] second){
       if (!(first.length == second.length && first[0].length == second[0].length))
           System.out.println("Матрицы введены некорректно");
       else
       {
           for (int i = 0; i < first.length; ++i)
           {
               for (int j = 0; j < first[0].length; ++j)
                   System.out.print(first[i][j].doubleValue() + second[i][j].doubleValue() + "  ");
               System.out.println();
           }
       }
       System.out.println();
    }

    public static <T extends Number, V extends Number> void multiplyMatrix(T[][] first, V[][] second)
    {
        if (first.length != second[0].length)
            System.out.println("Матрицы введены некорректно");
        else
        {
            for(int i = 0; i < first.length; i++)
            {
                for(int j = 0; j < second[0].length; j++)
                {
                    Number cell = 0;
                    for (int k = 0; k < second.length; k++)
                        cell = cell.doubleValue() + first[i][k].doubleValue() * second[k][j].doubleValue();
                    System.out.print(cell.doubleValue() + "  ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args)
    {
        Integer [][] firstIntMatrix = {{1, 1}, {1, 1}};
        Double[][] secondDoubleMatrix = {{2.1, 2.2}, {2.3, 2.4}};
        MatrixJava.sumMatrix(firstIntMatrix, secondDoubleMatrix);
        MatrixJava.multiplyMatrix(firstIntMatrix, secondDoubleMatrix);
    }
}
