package famousprograms;

import java.util.Scanner;

public class ReverseWordsInStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            result.append(reversedWord).append(" ");
        }

        System.out.println("Reversed sentence: " + result.toString().trim());
        scanner.close();
    }
}

