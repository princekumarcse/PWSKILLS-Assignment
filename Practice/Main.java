/*Write a program to create an object of an class which contain a method and call that class method in
main method.*/
class CreateObject{
    public void display(){
        System.out.println("Welcome to PW Skills!");//output: Welcome to PW Skills!.
    }
}
public class Main{
    public static void main(String args[]){
        CreateObject ob=new CreateObject();
        ob.display();
    }
}