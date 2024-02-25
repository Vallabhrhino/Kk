package famousprograms;

import java.util.Scanner;

public class CheckSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter a substring to check: ");
        String substring = scanner.nextLine();

        if (inputString.contains(substring)) {
            System.out.println("The substring is present in the string.");
        } else {
            System.out.println("The substring is not present in the string.");
        }

        scanner.close();
    }
}
