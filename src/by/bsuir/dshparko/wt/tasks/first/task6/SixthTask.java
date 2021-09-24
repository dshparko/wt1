package by.bsuir.dshparko.wt.tasks.first.task6;


import static by.bsuir.dshparko.wt.tasks.first.printer.PrintData.printIntMatrix;
import static by.bsuir.dshparko.wt.tasks.first.scanner.InputData.fillIntArray;
import static by.bsuir.dshparko.wt.tasks.first.scanner.InputData.inputInt;

public class SixthTask {
    public static void main(String[] argv) {
        System.out.println("Введите размер массива: ");
        int n = inputInt();
        System.out.println("Введите элементы массива: ");
        int array[] = fillIntArray(n);
        try {
            int[][] matrix = Matrix.fillMatrix(array);
            printIntMatrix(matrix);

        }catch( IllegalArgumentException e) {
            System.out.println( e.getMessage() );
        }
    }
}
