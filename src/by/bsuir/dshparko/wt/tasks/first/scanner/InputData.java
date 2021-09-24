package by.bsuir.dshparko.wt.tasks.first.scanner;

import java.util.Scanner;

public class InputData {
    private static final Scanner scanner = new Scanner(System.in);

    public static int inputInt() {
        int var;
        String inLine = scanner.nextLine();
        try {
            var = Integer.parseInt(inLine);
        } catch (NumberFormatException e) {
            throw e;
        }
        return var;
    }

    public static double inputDouble() {
        double var;
        Scanner sc = new Scanner(System.in);
        String inLine = sc.nextLine();
        try {
            var = Double.parseDouble(inLine);
        } catch (NumberFormatException e) {
            throw e;
        }
        return var;
    }

    public static int[] fillIntArray(int n) {
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = inputInt();
        }
        return array;
    }


}
