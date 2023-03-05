package Test_of_7_PM_Batch;

import java.util.Scanner;

public class ArmstrongNumber {
    public void m1(){
        int num, result, Number;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
         num = input.nextInt();

        result= 0;
        Number = num;
        int numDigits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            result += Math.pow(digit, numDigits);
            num /= 10;
        }

        if (result == Number) {
            System.out.println(Number + " is an Armstrong number.");
        } else {
            System.out.println(Number + " is not an Armstrong number.");
        }

        input.close();
    }

    public static void main(String[] args) {
        ArmstrongNumber obj = new ArmstrongNumber();
        obj.m1();
    }
}
