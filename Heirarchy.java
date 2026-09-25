
class Heirarchy{
    public static void main(String []args){
           Son s=new Son();
           s.Grandfather();
           s.Father();
           s.Son();
    }
}
class Grandfather{
    void Grandfather(){
        System.out.println("Grand father has two apartments");
    }
}
class Father extends Grandfather{
    void Father(){
        System.out.println("Father has 3 villa's");
    }
}
class Son extends Father {
    void Son(){
        System.out.println("son has a venture");
    }
}