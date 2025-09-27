class Node {
    int data;
    Node next;
    
    Node (int data){
        this.data=data;
        this.next=null;
    }
}
public class Main {
    public static void main(String []args){
        Node first=new Node(10);
        Node second=new Node(20);
        System.out.println(first.data);
        System.out.println(first.next);
        System.out.println(second.data);
        System.out.println(second.next);
    }
}