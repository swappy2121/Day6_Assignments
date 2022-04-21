package com.Bridgelabz;
import java.util.Scanner;


public class PerfectNumber {

    public static void main (String[] args) {

        System.out.println("take input from user : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if( num == 28 ){
            System.out.println(num + " is a perfect number...");
        }else if( num == 496) {
            System.out.println(num + " is a perfect number..");
        }else if( num == 8128){
            System.out.println(num + " is a perfect number..");
        }else{
            System.out.println(num + " is not a perfect number");
        }

    }
}
