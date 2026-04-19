import java.util.Scanner;

public class Quiz101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = sc.nextInt();

        System.out.println();

        int[] firstNumberList = new int[5];
        int[] secondNumberList = new int[5];

        for (int i = 0; i < firstNumberList.length; i++) {
            firstNumberList[i] = firstNumber * (i + 1);
        }

        for (int i = 0; i < secondNumberList.length; i++) {
            secondNumberList[i] = secondNumber * (i + 1);
        }

        System.out.println("Multiples of " + firstNumber + " = " +
                firstNumberList[0] + " " +
                firstNumberList[1] + " " +
                firstNumberList[2] + " " +
                firstNumberList[3] + " " +
                firstNumberList[4] + " ...");
        System.out.println("Multiples of " + secondNumber + " = " +
                secondNumberList[0] + " " +
                secondNumberList[1] + " " +
                secondNumberList[2] + " " +
                secondNumberList[3] + " " +
                secondNumberList[4] + " ...");

        System.out.println();

        int LCM = 0;

        for (int i = 0; i < firstNumberList.length; i++) {
            if (firstNumberList[i] % firstNumber == 0 && firstNumberList[i] % secondNumber == 0) {
                LCM = firstNumberList[i];
            } else if (secondNumberList[i] % firstNumber == 0 && secondNumberList[i] % secondNumber == 0) {
                LCM = secondNumberList[i];
            }
        }

        System.out.println("Least Common Multiple = " + LCM);
    }
}
