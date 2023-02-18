package com.bootcoding.linklist;

import java.util.List;

//count /2
//make new method to add element in  middle




public class InsertElement {
    public static void main(String[] args) {

        Node n5 = new Node(50);
        Node n6 = new Node(60);
        Node n7 = new Node(70);
        InsertElement ie = new InsertElement();
        Node head = ie.createLinkList();
        Node h = ie.insertFirst(head,n5);
        ie.insertLast(head,n6);
        ie.insertmiddle(head,n7);
        System.out.println(ie.countLength(head));
        ie.printLinkList(h);
    }
    public  Node createLinkList(){
        Node head;
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);


        n1.next = n2;
        n2.next = n3;
        n3.next = n4;


        head = n1;

        return head;
    }


    public  Node insertFirst(Node head , Node n5){

        n5.next = head;
        head = n5;
        return head;
    }
    public void insertLast(Node head , Node n6){

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next =n6;
    }
    public void insertmiddle(Node head , Node n7){

        // Find size of linkedlist
        // Take count variable
        // Traverse LinkedList
        // While traversing, keep incrementing count
        // when count reaches to size/2
        // Insert n7
        // swap (temp2)

        int size = countLength(head);
        int count=0;
        Node temp = head;
        while(temp != null){
            if(count >= size/2){
                Node t = temp.next;
                temp.next = n7;
                n7.next = t;
                break;
            }
            count++;
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
    public void printLinkList(Node head){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
