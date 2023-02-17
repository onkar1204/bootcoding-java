package com.bootcoding.linklist;

public class LinkListEx1 {
    public static void main(String[] args) {
        LinkListEx1 linklist = new LinkListEx1();
        Node head = linklist.createLinkList();
        linklist.printLinkList(head);
        System.out.println("Size Of LinkList : "+countLength(head));
        evenNumbers( head);
    }
    public  Node createLinkList(){
        Node head;
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        Node n6 = new Node(60);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n5.next = n1;
        n4.next = n6;
        head = n5;
        return head;
    }
    public void printLinkList(Node head){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static int countLength(Node head){
        Node temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public static void evenNumbers(Node head){
        Node temp = head;

        while (temp != null){
            if (temp.data % 2 == 0){
                System.out.println( "Even LL : "+temp.data);
                temp = temp.next;
            }
        }
    }
}
