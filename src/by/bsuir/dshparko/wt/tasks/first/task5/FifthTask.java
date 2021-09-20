package by.bsuir.dshparko.wt.tasks.first.task5;

import java.util.Scanner;

public class FifthTask {
    public static void main(String[] argv) {
        int n = inputParameter();
        int array[] = new int[n];
        array = fillArray(array, n);
        int count = check(array);
        outputMessage(count);
    }

//добавить проверки
    public static int check(int[] array) {
        int count = 0;
        int maxPrev = Integer.MIN_VALUE;
        for (int i = 1; i < array.length; i++) {
            if (maxPrev <array[i-1]){
                maxPrev = array[i-1];
            }
                if (!(array[i - 1] < array[i])) {

                    count++;
                }
        }
        return count;
    }

    public static int[] fillArray(int[] array, int n) {
        for (int i = 0; i < n; i++) {
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

