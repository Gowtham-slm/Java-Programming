abstract class Parent{
    abstract void Money(); 
    
     void Son(){
        System.out.println(" 100 rs");
    }
    
}
class Child1 extends Parent{
    void Money(){
        System.out.println("i need 50 rs ");
        
    }
}
class Child2 extends Parent{
    void Money(){
        System.out.println("i need 70 rs ");
    }
    
}
 public class Main{
    public static void main(String[]args){
        Parent p1=new Child1();
        p1.Son();
        p1.Money();
        
        Parent p2=new Child2();
        p1.Son();
        p1.Money();
        
        
        
    }
}