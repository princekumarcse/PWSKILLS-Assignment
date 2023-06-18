/*4.Write a program to call an method without creating an object of a class*/

class CreateObject{
    public static void StaticMethod(){
        System.out.println("Hello, Ststic Method");
    }
    public void InstanceMethod(){
        System.out.println("Hello, InstanceMethod");
    }
}
public class CallObject{
    public static void main(String args[]){
        CreateObject.StaticMethod();
        CreateObject  obj= new CreateObject();
        obj.InstanceMethod();
    }
}