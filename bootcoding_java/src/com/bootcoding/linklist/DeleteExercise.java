package com.bootcoding.linklist;

public class DeleteExercise {
    public static void main(String[] args) {
        DeleteExercise de = new DeleteExercise();
        Node head = de.createLinkList();
        Node h1 = de.firstEvenNumber(head);
        Node h2 = de.firstOddNumber(head);
        de.deleteMaxNumber(head);

        //de.deleteLastNode(h1);
        de.printLinkList(h2);
    }
    public  Node createLinkList(){
        Node head;

        Node n1 = new Node(11);
        Node n2 = new Node(220);
        Node n3 = new Node(30);
        Node n4 = new Node(41);
        Node n5 = new Node(52);
        Node n6 = new Node(319);
        Node n7 = new Node(765);
        Node n8 = new Node(120);
        Node n9 = new Node(120);


        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;

        head = n1;

        return head;
    }
    /*private  void deleteLastNode(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            if (temp.next.next == null) {
                temp.next = null;
            }
            temp = temp.next;
        }
    }*/
    public Node firstEvenNumber(Node head){
        Node temp = head;
        Node prev = null;
        while (temp != null){
            if (temp.data % 2 == 0){
                if (prev == null){
                    head = temp.next;
                    break;
                }
                prev.next = temp.next;
               // temp.next =null;
                break;
            }
            prev = temp;
            temp = temp.next;
        }return head;
    }
    public Node firstOddNumber(Node head){
        Node temp = head;
        Node prev = null;
        while (temp != null){
            if (temp.data % 2 != 0){
                if (prev == null){
                    head = temp.next;
                    break;
                }
                prev.next = temp.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
    public Node deleteMaxNumber(Node head){
        Node temp = head;
        Node prev = null;
        Node max = temp;
        Node tt = head;
        while (temp != null){
            if (max.data < temp.data){
                max.data = temp.data;
            }

            temp = temp.next;
            while (tt != null){
                if (tt.data == max.data){
                    prev.next = temp.next;
                    break;
                }
                prev = temp;
                tt=tt.next;
            }
        }

        return head;
    }
    public void printLinkList(Node head){
        Node temp = head;

        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}