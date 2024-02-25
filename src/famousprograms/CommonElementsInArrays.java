package famousprograms;

import java.util.ArrayList;
import java.util.Scanner;

public class CommonElementsInArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];

        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];

        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextInt();
        }

        ArrayList<Integer> commonElements = new ArrayList<>();

        for (int num1 : arr1) {
            for (int num2 : arr2) {
                if (num1 == num2) {
                    commonElements.add(num1);
                    break;
                }
            }
        }

        System.out.println("Common elements in both arrays: " + commonElements);
        scanner.close();
    }
}

