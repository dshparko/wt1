package by.bsuir.dshparko.wt.tasks.first.scanner;

import by.bsuir.dshparko.wt.tasks.first.task12.logic.Book;

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
        String inLine = scanner.nextLine();
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

    public  static double[] inputDoubleArray(int size) {

        double[] array = new double[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " element out of " + array.length + ": ");
            array[i] =  inputDouble();
        }

        return array;
    }

    public static double inputPositiveDouble() {
        double result;

        do {
            result = inputDouble();

        } while (result <= 0);

        return result;
    }

    public static int inputPositiveInt() {
        int result;
        do {
            result = inputInt();
        } while (result < 0);

        return result;
    }

    public static String inputString() {
        String result;

        do {
            result = scanner.nextLine();
        } while (result.isEmpty());

        return result;
    }

    public  static Book setInformationAboutBook() {

        String author;
        String title;
        int price;
        int isbn;

        System.out.print("Enter book title: ");
        title = InputData.inputString();
        System.out.print("Enter book author: ");
        author = InputData.inputString();
        System.out.print("Enter book price: ");
        price = InputData.inputPositiveInt();
        System.out.print("Enter book ISBN: ");
        isbn = InputData.inputPositiveInt();

        return new Book(title, author, price, isbn);
    }


}
