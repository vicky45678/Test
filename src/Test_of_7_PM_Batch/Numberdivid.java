package Test_of_7_PM_Batch;

import java.util.Scanner;

public class Numberdivid {

    public void m1(){
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        num = input.nextInt();
        
        if (num % 3 == 0) {
            System.out.println(num +" is divisible by 3.");
        } else {
            System.out.println(num + " is not divisible by 3.");
        }
        
        input.close();
    }

    public static void main(String[] args) {
        Numberdivid obj= new Numberdivid();
        obj.m1();


            }
}

