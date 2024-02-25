package famousprograms;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();//101
        int originalNum = num;
        int reverseNum = 0;

        while (num != 0) {
            int remainder = num % 10;
            System.out.println("remainder"+remainder);
            reverseNum = reverseNum * 10 + remainder;
            System.out.println("Reversenumber"+reverseNum);
            num /= 10;
            System.out.println("num"+num);
        }

        if (originalNum == reverseNum) {
            System.out.println(originalNum + " is a palindrome number.");
        } else {
            System.out.println(originalNum + " is not a palindrome number.");
        }

        scanner.close();
    }
}
