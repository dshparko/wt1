package by.bsuir.dshparko.wt.tasks.first;

import java.util.Scanner;

public class FourthTask {
    public static void main(String[] argv) {
        int n = inputParameter();
        int array[] = new int[n];
        array = fillArray(array, n);
        excessElementsOfArray(array);
    }

    public static void excessElementsOfArray(int [] array){
        for(int i = 0 ; i<array.length;i++){
            if(checkPrime(array[i])){
                outputMessage(i);
            }
        }
    }

    public static boolean checkPrime(int var) {
        boolean isPrime = true;
        int temp;
        for (int i = 2; i < var / 2; i++) {
            temp = var % i;
            if (temp == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    public static int[] fillArray(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            array[i] = inputParameter();
        }
        return array;
    }

    public static void outputMessage(int str) {
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
