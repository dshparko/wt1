package by.bsuir.dshparko.wt.tasks.first.task3;


import static by.bsuir.dshparko.wt.tasks.first.scanner.InputData.inputDouble;

public class ThirdTask {
    public static void main(String[] argc) {
        System.out.print("Enter a: ");
        double a = inputDouble();

        System.out.print("Enter b: ");
        double b = inputDouble();

        System.out.print("Enter h: ");
        double h = inputDouble();
        try {
            CheckValues.checkParam(a, b, h);
            double[][] arr = FindFunction.findAnswer(a, b, h);
            PrintTable.printArrayDouble(arr);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

}
