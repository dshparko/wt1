package by.bsuir.dshparko.wt.tasks.first;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] argc) {
        double a = inputParameter();
        double b = inputParameter();
        double h = inputParameter();
        doTask(a, b, h);
    }

    public static void doTask(double a, double b, double h) {
        double result;
        while (a < b) {
            result = Math.tan(a);
            outputMessage(a,result);
            a += h;
        }
    }


    public static void outputMessage(double x, double str) {
        System.out.printf("%f      %f\n",x,str);
    }

    public static double inputParameter() {
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
}
