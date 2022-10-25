import java.util.*;
class LL{
    public static void main(String[]args){
        Linkedlist l = new Linkedlist();
        l.push(8);
        l.push(1);
        l.append(6);
        l.push(7);
        l.push(9);
        l.f_del();
        l.l_del();
        l.display();
        System.out.println();
        System.out.println("The lenght of the Linked list is : "+l.length());
    }
}
class Linkedlist{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            next = null;
        }
    }
    public void push(int d){
        Node new_n = new Node(d);
        if(head == null){
            head = new Node(d);
        }
        else{
            new_n.next = head ;
            head = new_n;
        }
    }
    public void append(int d){
        Node new_n = new Node(d);
        if(head == null){
            head = new Node(d);
            return ;
        }else{
            Node n = head;
            //new_n.next = null;
            while(n.next!=null){
                n=n.next;
            }
            n.next = new_n;
        }
    }
    public void display(){
        Node n = head;
        while(n!=null){
            System.out.print(n.data + " ");
            n=n.next;
        }
    }
    public Node f_del(){
        if (head == null){
            return null;
        }else{
            Node n = head;
            head = n.next;
            n.next = null;
            return n;
        }
    }
    public Node l_del(){
        if(head==null){
            return null;
        }
        else{
            Node n = head;
            Node prev = null;
            while(n.next != null){
                prev = n;
                n = n.next;
            }
            prev.next = null;
            return n;
        }
    }
    public int length(){
        if(head == null){
            return 0;
        }
        else{
            int count = 0;
            Node n = head;
            while(n != null){
                count++;
                n = n.next;
            }
            return count;
        }
    }
}