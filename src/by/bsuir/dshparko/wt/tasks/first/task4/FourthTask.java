package by.bsuir.dshparko.wt.tasks.first.task4;

import static by.bsuir.dshparko.wt.tasks.first.scanner.InputData.fillIntArray;
import static by.bsuir.dshparko.wt.tasks.first.scanner.InputData.inputInt;
import static by.bsuir.dshparko.wt.tasks.first.task4.PrimeNumber.findSimpleNumbers;

public class FourthTask {
    public static void main(String[] argv) {
        System.out.println("Введите размер массива: ");
        int n = inputInt();
        System.out.println("Введите элементы массива: ");
        int array[] = fillIntArray(n);
        try {

            int[] arr = findSimpleNumbers(array);
            for (int i = 0; i < arr.length; i++)
                System.out.print(arr[i] + " ");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
