package by.bsuir.dshparko.wt.tasks.first.task1;
import static by.bsuir.dshparko.wt.tasks.first.scanner.InputData.inputDouble;
import static by.bsuir.dshparko.wt.tasks.first.task1.Decision.countEquation;

public class FirstTask {
    public static void main(String[] argv) {
        System.out.println("Input x: ");
        double x = inputDouble();
        System.out.println("Input y: ");
        double y = inputDouble();
        try {
            double result = countEquation(x, y);
            outputMessage(result);
        }catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        }
    }

    public static void outputMessage(double str){
        System.out.println(str);
    }





}
