package lab3;

import java.util.Scanner;

public class date {
    public static void main(String[] args) {
        int date, month, year;
        Scanner obj = new Scanner(System.in);
        System.out.print("date:");
        date = obj.nextInt();
        System.out.print("month:");
        month = obj.nextInt();
        System.out.print("year:");
         year = obj.nextInt();
         int D=year%100;
         int C=year/100;

       int days = date + ((13*month-1)/5) + D + (D/4) +(C/4) - 2*C;
        System.out.println(days);
    }
}