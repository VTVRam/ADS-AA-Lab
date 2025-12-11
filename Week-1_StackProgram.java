// java program to implement stacks
import java.util.*;

public class StackProgram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        int top = -1;

        while (true) {
            System.out.println("\nMain menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: // PUSH
                    if (top == size - 1) {
                        System.out.println("Stack is full");
                    } else {
                        System.out.print("Enter the number: ");
                        int num = sc.nextInt();
                        arr[++top] = num;
                        System.out.println("Pushed " + num);
                    }
                    break;

                case 2: // POP
                    if (top == -1) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Popped: " + arr[top--]);
                    }
                    break;

                case 3: // DISPLAY
                    if (top == -1) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Stack elements:");
                        for (int i = top; i >= 0; i--) {
                            System.out.println(arr[i]);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
