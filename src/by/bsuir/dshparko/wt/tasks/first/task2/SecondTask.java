package by.bsuir.dshparko.wt.tasks.first.task2;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] argc) {
        double x = inputParameter();
        double y = inputParameter();
        boolean isAnswer = checkAffiliation(x,y);
        outputMessage(isAnswer);
    }

    public static boolean checkAffiliation(double x, double y) {
        boolean isAnswer = false;
        if (x >= -6 && x <= 6 && y >= -3 && y <= 5) {
            isAnswer = true;
        }
        return isAnswer;
    }

    public static void outputMessage(boolean str) {
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
