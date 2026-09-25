public class Inheritance {
    public static void main(String []args){
        Child c = new Child();
        c.Father();
        c.child();
    }
}
class Father{
    void Father(){
        System.out.println("father has n assets");
    }
     
}
class Child extends Father{
    void child(){
        System.out.println("child has n-1 assets");
    }
}
