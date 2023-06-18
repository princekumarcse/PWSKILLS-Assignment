/*5.Write a program which has static block and constructor overloading,initialise variables
using constructors and print it.*/
class Person{
    private String name;
    private int age;

    static{
        System.out.println("Static Block executed!");
    }
    public Person(){
        this.name="Unknown";
        this.age=0;
    }
    public Person(String name ,int age){
        this.name=name;
        this.age=age;
    }
    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
public class Constructor{
    public static void main(String args[]){
        Person p1=new Person();
        p1.displayDetails();

        Person p2=new Person("Prince Kumar",20);
        p2.displayDetails();
        Person p3=new Person("Ramu Kumar",30);
        p3.displayDetails();
    }
}