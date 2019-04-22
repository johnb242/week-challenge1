package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int low =1;

        int enterednumber;
        boolean isPrime = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter any number");
        int num = scan.nextInt();
        scan.close();

        for (int i =2; i<= num /2; i++) {
            enterednumber = num % 1;
            if (enterednumber == 0) {
                isPrime = false;
                break;
            }
        }
            if (isPrime)
                System.out.println(num + " is a prime number");
            else
                System.out.println(num+ " is not a prime number");


            }
        }
        //if (isPrime)
          //  System.out.println(num + "is a prime number");
        //else
          //  System.out.println(num+ "is not a prime number");



