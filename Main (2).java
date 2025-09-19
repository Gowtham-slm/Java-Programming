class Gowtham{
    void Gowtham(){
    System.out.println("ngaaaaaaaaaaaa...!!");
    }
    
}
class Hello extends Gowtham{
    void Hello(){
        super.Gowtham();
        System.out.println("valthukal valthukalllll");
    }
}
class Main{
    public static void main(String[]args){
        Hello h=new Hello();
        h.Hello();
    }
}