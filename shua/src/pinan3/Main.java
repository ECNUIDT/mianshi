package pinan3;


import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        int month = scan.nextInt();
        int day = scan.nextInt();
        GregorianCalendar gre = new GregorianCalendar();
        boolean isLeapYear=gre.isLeapYear(year);

        int ap=isLeapYear?29:28;
        int days=0;
        switch (month) {
            case 1:
                days=day;
                break;
            case 2:
                days=31+day;
                break;
            case 3:
                days=31+ap+day;
                break;
            case 4:
                days=31+ap+31+day;
                break;
            case 5:
                days=31+ap+31+30+day;
                break;
            case 6:
                days=31+ap+31+30+31+day;
                break;
            case 7:
                days=31+ap+31+30+31+30+day;
                break;
            case 8:
                days=31+ap+31+30+31+30+31+day;
                break;
            case 9:
                days=31+ap+31+30+31+30+31+31+day;
                break;
            case 10:
                days=31+ap+31+30+31+30+31+31+30+day;
                break;
            case 11:
                days=31+ap+31+30+31+30+31+31+30+31+day;
                break;
            case 12:
                days=31+ap+31+30+31+30+31+31+30+31+30+day;
                break;

        }
        System.out.println(days);
    }

}