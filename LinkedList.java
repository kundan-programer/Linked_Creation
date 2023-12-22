import java.util.Scanner;

public class LinkedList {

  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  Node head = null;

  public void creation() {

    int data, n;

    Scanner sc = new Scanner(System.in);
    do {
      System.out.print("Enter Data: ");
      data = sc.nextInt();

      Node ob = new Node(data);

      if (head == null) {
        head = ob;
      }

      else {
        ob.next = head;
        head = ob;
      }

      System.out.print("Do you want to add more data press 1: ");
      n = sc.nextInt();
    }

    while (n == 1);
  }

  public void Transvers() {
    Node temp = head;
    try {
      if (head == null) {
        System.out.println("LL is not present! ");
      }

      else {
        // System.out.println(temp.data);
        while (head != null) {
          System.out.print(temp.data + "  ");
          temp = temp.next;
        }
      }
    } catch (Exception e) {
      System.out.println("\n");
    }
  }

  public static void main(String[] args) {
    LinkedList ob1 = new LinkedList();
    ob1.creation();
    ob1.Transvers();
  }
}