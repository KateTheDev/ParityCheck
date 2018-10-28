package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Input a number: ");
        int num;
        Scanner in=new Scanner(System.in);
        num = in.nextInt();
        CheckOdd c = new CheckOdd();
        boolean flag = c.CheckOdd(num);
        if (flag) {
            System.out.println("Your number is EVEN ");
        } else {
            System.out.println("Your number is ODD ");

        }
    }
}
