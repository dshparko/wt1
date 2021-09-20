package by.bsuir.dshparko.wt.tasks.first.task6;

import java.util.Scanner;

public class SixthTask {
    public static void main(String[] argv) {
        int n = inputParameter();
        int array[][] = new int[n][n];
        inputX(n,array[n]);
        outputMessage(6);
    }
//сдвинуть массив влево и записать в матрицу
    public static int[][] inputX(int count,int array[][],int arr[]) {
        for(int i =1; i < count;i++){

            array[i]=arr;
        }
        return array;
    }

    public static int[] inputX(int count,int array[]) {
        for(int i =0; i < count;i++){
            array[i] = inputParameter();
        }
        return array;
    }

    public static void outputMessage(int str) {
        System.out.println(str);
    }

    public static int inputParameter() {
        int var;
        Scanner sc = new Scanner(System.in);
        String inLine = sc.nextLine();
        try {
            var = Integer.parseInt(inLine);
        } catch (NumberFormatException e) {
            throw e;
        }
        return var;
    }
}
