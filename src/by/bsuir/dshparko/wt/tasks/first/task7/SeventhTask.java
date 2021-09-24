package by.bsuir.dshparko.wt.tasks.first.task7;


import static by.bsuir.dshparko.wt.tasks.first.scanner.InputData.inputInt;

public class SeventhTask {
    public static void main(String[] argv) {
        int n = inputInt();
        int array[] = new int[n];
        array = fillArray(array, n);
    }

    public static int[] sortShell(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            array[i] = inputInt();
        }
        return array;
    }


    public static int[] fillArray(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            array[i] = inputInt();
        }
        return array;
    }

    public static void outputMessage(int str) {
        System.out.println(str);
    }


}
