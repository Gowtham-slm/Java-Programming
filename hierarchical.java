class GrandParent{
    void thatha(){
        System.out.println(" 12 arces");
    }

}
class Father extends GrandParent{
    void Gowtham(){
        System.out.println(" 2 cores");
        
    }
}
class Son extends Father{
    void Prabhakaran(){
        System.out.println(" I have 200 rs");
    }
}
class Main{
    public static void main(String[]args){
        Father f=new Father();
        f.Gowtham();
        f.thatha();
    
        Son s=new Son();
        s.Prabhakaran();
        s.thatha();
}
}