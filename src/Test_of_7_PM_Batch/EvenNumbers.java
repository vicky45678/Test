package Test_of_7_PM_Batch;

public class EvenNumbers {

    public void m1(){
        int[] evenNumbers = new int[100];
        int a = 0;
        
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenNumbers[a] = i;
                a++;
            }
        }

        System.out.print("Even numbers from 1 to 100: ");
        for (int evenNum : evenNumbers) {
            if (evenNum != 0) {
                System.out.print(evenNum + " ");
            }
        }
    }

    public static void main(String[] args) {
        EvenNumbers obj= new EvenNumbers();
        obj.m1();
    }
}
