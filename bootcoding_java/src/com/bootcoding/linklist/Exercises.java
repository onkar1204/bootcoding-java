package com.bootcoding.linklist;

import java.util.HashMap;
import java.util.Map;

public class Exercises {
    public static void main(String[] args) {
        Exercises ex = new Exercises();
        Node head = ex.createLinkList();
        //ex.printLinkList(head);
        ex.evenNumber(head);
        ex.oddNumber(head);
        ex.maxNumber(head);
        ex.minNumber(head);
        ex.findDuplicate(head);
        ex.findLength(head);
    }
    public  Node createLinkList(){
        Node head;

        Node n1 = new Node(10);
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
    public void evenNumber(Node head){
        Node temp = head;
        while (temp != null){
            if (temp.data % 2 == 0){
                System.out.println("EVEN NUMBERS : " + temp.data);
            }
            temp = temp.next;
        }

    }
    public void oddNumber(Node head){
        Node temp = head;
        while (temp != null){
            if (temp.data % 2 == 0){

            }else {
                System.out.println("ODD NUMBERS : " + temp.data);
            }
            temp = temp.next;
        }

    }
    public void maxNumber(Node head){
        Node temp = head;
        Node max = head;
        while (temp != null){
            if (max.data < temp.data){
                max.data = temp.data;
            }
            temp = temp.next;
        }
        System.out.println("MAX NUMBERS : " + max.data);

    }
    public void minNumber(Node head){
        Node temp = head;
        Node min = head;
        while (temp != null){
            if (min.data > temp.data){
                min.data = temp.data;
            }
            temp = temp.next;
        }
        System.out.println("MIN NUMBERS : " + min.data);

    }
    public void findDuplicate(Node head){
        Map<Integer,Integer> map = new HashMap<>();
        Node temp = head;

        while (temp != null){
            if (!map.containsKey(temp.data)){
                map.put(temp.data, 1);
            }
            if (map.containsKey(temp.data)){
                map.put(temp.data,map.get(temp.data)+1);
            }
            temp = temp.next;
        }
       Node  tem=head;
       int dup=0;
        while (tem!=null){
            if (map.get(tem.data)>1){
                dup=tem.data;
            }
            tem = tem.next;
        }
        System.out.println("DUPLICATE VALUE : " + dup);
    }

    public  void findLength(Node head){
        Node temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        System.out.println("LENGTH OF LIST : " + count);
    }
    public void primeNumber(Node head){
        Node temp = head;

        while (temp != null){
            boolean isPrime = true;

        }
    }


}
