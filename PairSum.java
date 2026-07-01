import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element [" + i + "]: ");
            numbers[i] = input.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = input.nextInt();

        boolean found = false;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] + numbers[j] == target) {
                    System.out.println("\n===== MATCH FOUND =====");
                    System.out.println("Index 1: " + i + "  Value: " + numbers[i]);
                    System.out.println("Index 2: " + j + "  Value: " + numbers[j]);
                    System.out.println("Equation: " + numbers[i] + " + " + numbers[j] + " = " + target);
                    System.out.println("=======================");
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("\nNo pair found with the target sum.");
        }

        input.close();
    }
}
