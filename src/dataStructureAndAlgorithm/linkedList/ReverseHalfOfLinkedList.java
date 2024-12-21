package dataStructureAndAlgorithm.linkedList;

import java.util.Scanner;

public class ReverseHalfOfLinkedList {

    static class  Node{
        int val;
        Node next;
        public Node(int val ){
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Node u want");
        int n = sc.nextInt();
        Node dummy = new Node(0);

        Node head = dummy;
        for(int i=0; i<n; i++)
        {
            int val = sc.nextInt();
            Node node = new Node(val);
            dummy.next = node;
            dummy = dummy.next;
        }
        print(head.next);
        Node reverse = reverseHalf(head.next);
        System.out.println("After half reverse");

        print(reverse);
    }
 //   1 2 3 4 5
    public static void print(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.val+" -> ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static Node reverseHalf(Node head)
    {
       Node curr = head;
       Node prev = null;
       Node fast = head;
       while(fast != null && fast.next != null){
           fast = fast.next.next;
           Node next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next;


       }
       return prev;
    }

}
