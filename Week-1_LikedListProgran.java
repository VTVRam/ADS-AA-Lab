import java.util.*;

public class LinkedListProgram {

    static class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Node head = null;

        while (true) {
            System.out.println("\nMain menu\n1. Insert\n2. Delete\n3. Display\n4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1: 
                    System.out.print("Enter the number: ");
                    int val = sc.nextInt();

                    Node newNode = new Node(val);

                    if (head == null) {
                        head = newNode;
                    } else {
                        Node temp = head;
                        while (temp.next != null) {
                            temp = temp.next;
                        }
                        temp.next = newNode;
                    }
                    System.out.println("Element inserted");
                    break;

                case 2:
                    if (head == null) {
                        System.out.println("Linked list is empty");
                    } else {
                        System.out.println("Deleted element: " + head.data);
                        head = head.next;
                    }
                    break;

                case 3: 
                    if (head == null) {
                        System.out.println("Linked list is empty");
                    } else {
                        System.out.println("Linked list elements:");
                        Node temp = head;
                        while (temp != null) {
                            System.out.println(temp.data);
                            temp = temp.next;
                        }
                    }
                    break;

                case 4: 
                    System.out.println("Exiting program...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
