package MonthByNumber;

import java.util.Scanner;

/**
 * Created by Don on 17.07.2016.
 */
public class Month {
    static String[] MonthArray = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    public void whatIsAMonthByNumber() {
        int numberOfMonth = getNumberOfMonthFromConsole();
        String month = findMonthByNumber(numberOfMonth, MonthArray);
        System.out.print("Entered month is "+month);
    }

    static int getNumberOfMonthFromConsole() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number of month: ");
        int number = in.nextInt();
        return number;
    }

    static String findMonthByNumber(int Number, String[] MonthArray) {
        String s = "";
        try {
            s = MonthArray[Number-1];
            }
        catch (java.lang.ArrayIndexOutOfBoundsException e) {
            s = "Entered number is not a valid month number";
        }

        return s;

    }
}
