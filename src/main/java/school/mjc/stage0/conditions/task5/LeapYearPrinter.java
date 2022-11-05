package school.mjc.stage0.conditions.task5;

import java.util.Scanner;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        boolean rem;
        rem=((year%4==0)&&((year%400==0)||(year%100!=0)));
        if (rem){
            System.out.println("leap");
        }else{
            System.out.println("not leap");
        }
    }
}
