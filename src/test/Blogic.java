package test;

import java.io.*;
import java.util.Arrays;

public class Blogic {

    String[][] array = null;

    public void read() throws IOException{
        File file = new File("E:\\NewFolder\\MyProgram\\UiTest\\src\\test\\data");
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

        String str;
        String[] newArr = new String[25];
        int count = 0;
        while ((str = reader.readLine())!= null){
        String [] s = str.split(" ");
            for (int i = 0; i < newArr.length; i++) {
                newArr[i] = s[count++];
                if (count >= 4) {count = 0;}

            }
          //  System.out.println(Arrays.toString(s));
            // newArr = Arrays.copyOf(s, 25);
           System.out.println(Arrays.toString(newArr));
        }

    }
/* int wImg = 10, hImg = 12; //ширина и высота двумерного массива
        int count = 0;
        int[] array = new int[120]; //массив - донор
        int[][] matrix = new int[hImg][wImg]; //будущая матрица
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = array[count++]; //перенос элементов из донора в матрицу
            }
        }*/

}
