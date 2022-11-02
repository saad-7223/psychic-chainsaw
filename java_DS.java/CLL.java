public class CLL {
    public static void main(String [] args){
        circularLL l = new circularLL();
        l.create(5);
        /*l.create(3);
        l.create(1);
        //l.create(4);
        //System.out.println(l.length());
        //System.out.println();*/
        l.f_insert(10);
        l.create(3);
        l.f_insert(0);
        l.E_insert(11);
        l.display();
        //l.f_delete();
        //l.l();
        //l.f();
    }
}
class circularLL{
    Node last;
    int length;
    class Node{
        Node next;
        int data;
        Node(int d){
            this.data = d; 
        }
    }
    circularLL(){
        last =null;
        length=0;
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void create(int d){
        Node new_n = new Node(d);
        if (isEmpty() == true){
            last = new_n;
            new_n.next = last;
            length++;
        }else{
            Node first = last.next;
            new_n.next = first;
            last.next = new_n;
            last = new_n;
            length++;
        }
    }
    public void display(){
        if(last == null){
            return ;
        }
        Node first = last.next;
        while(first!=last){
            System.out.print(first.data + " ");
            first = first.next;
        }
        System.out.println(first.data + " ");
    }
    public void l(){
        System.out.println(last.data);
    }
    public void f(){
        Node first = last.next;
        System.out.println(first.data);
    }
    public void f_insert(int d){
        Node new_n = new Node(d);
        if(last ==  null){
            last = new_n;
        }else{
            new_n.next=last.next;
        }
        last.next=new_n;
        length++;
    }
    public void E_insert(int d){
        Node new_n = new Node(d);
        if(last==null){
            last = new_n;
            last.next = last;
        }else{
            new_n.next = last.next;
            last.next = new_n;
            last = new_n;
        }
        length++;
    }
    /*public Node f_delete(){
        if (last == null){
            return  null;
        }else{
            Node first = last.next;
            last.next = first.next;
            first.next=null;
            return first;
        }
    }*/
}
