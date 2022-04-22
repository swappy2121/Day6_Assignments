package com.Bridgelabz;
import java.util.Scanner;


public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println("take number from user : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if( num<=1 ) {
            System.out.println(num + " is not a prime number");
        }else if (num/1 == num ){
            System.out.println(num +" is a prime number ");
        }else if( num == 2){
            System.out.println(num +" is a even prime number");
        }else if( num%2==0 ){
            System.out.println(num +" is a prime number");
        }else{
            System.out.println("input is invalid");
        }
    }
}
