import java.util.*;

public class QueueProgram {
    public static void main(String args[]) {

        int[] arr = null;
        int size, front = -1, rear = -1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        size = sc.nextInt();
        arr = new int[size];

        while (true) {
            System.out.println("\nMain menu\n1. Enqueue\n2. Dequeue\n3. Display\n4. Exit");
            System.out.print("Enter your choice: ");
            int num = sc.nextInt();

            switch (num) {

                case 1: // ENQUEUE
                    if (rear == size - 1) {
                        System.out.println("Queue is full");
                    } else {
                        System.out.print("Enter the number: ");
                        int val = sc.nextInt();
                        if (front == -1) front = 0;  // First element
                        arr[++rear] = val;
                        System.out.println("Element enqueued");
                    }
                    break;

                case 2: // DEQUEUE
                    if (front == -1 || front > rear) {
                        System.out.println("Queue is empty");
                        front = rear = -1; // reset queue
                    } else {
                        System.out.println("Dequeued element: " + arr[front++]);
                    }
                    break;

                case 3: // DISPLAY
                    if (front == -1 || front > rear) {
                        System.out.println("Queue is empty");
                    } else {
                        System.out.println("Queue elements:");
                        for (int i = front; i <= rear; i++) {
                            System.out.println(arr[i]);
                        }
                    }
                    break;

                case 4: // EXIT
                    System.out.println("Exiting program...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
