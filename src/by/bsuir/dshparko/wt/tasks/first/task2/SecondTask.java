package by.bsuir.dshparko.wt.tasks.first.task2;


import static by.bsuir.dshparko.wt.tasks.first.scanner.InputData.inputDouble;
import static by.bsuir.dshparko.wt.tasks.first.task2.PointAffiliation.checkAffiliation;

public class SecondTask {
    public static void main(String[] argc) {
        System.out.println("Input x: ");
        double x = inputDouble();
        System.out.println("Input y: ");
        double y = inputDouble();
        PointAffiliation pt = new PointAffiliation(x,y);
        boolean isAnswer = checkAffiliation(x,y);
        outputMessage(isAnswer);
    }

    public static void outputMessage(boolean str) {
        System.out.println(str);
    }


}
