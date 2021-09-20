package by.bsuir.dshparko.wt.tasks.first.task7;

import java.util.Scanner;

public class SeventhTask {
    public static void main(String[] argv) {
        int n = inputParameter();
        int array[] = new int[n];
        array = fillArray(array, n);
    }

    public static int[] sortShell(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            array[i] = inputParameter();
        }
        return array;
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
