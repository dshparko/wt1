package by.bsuir.dshparko.wt.tasks.first.task1;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] argv) {
        int x = inputParameter();
        int y = inputParameter();
        double result = countEquation(x, y);
        outputMessage(result);
    }

    public static void outputMessage(double str){
        System.out.println(str);
    }

    public static double countEquation(int x, int y) {
        double nominator = (1 + Math.pow(Math.sin(x + y), 2));
        double denominator = (2 + Math.abs(x - 2 * x / (1 + Math.pow(x, 2) * Math.pow(y, 2))));
        double result = nominator / denominator + x;
        return result;
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
