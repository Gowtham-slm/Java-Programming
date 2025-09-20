abstract class Parent{
    abstract void Money();
    abstract void cost();
    
     void Son(){
        System.out.println(" 100 rs");
    }
    
    
}
class Child1 extends Parent{
    void Money(){
        System.out.println("i need 50 rs ");
        
    }
    void cost(){
        System.out.println("bad");
    }
}
class Child2 extends Parent{
    void Money(){
        System.out.println("i need 70 rs ");
    }
    void cost(){
        System.out.println("very poor");
    }
    
}
 public class Main{
    public static void main(String[]args){
        Parent p1=new Child1();
        p1.Son();
        p1.Money();
        p1.cost();
        Parent p2=new Child2();
        p2.Son();
        p2.Money();
        p2.cost();
        
        
        
    }
}