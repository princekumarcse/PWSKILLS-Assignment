/*2.Write a program and create a constructor with parameters and initialise the variable using
a constructor.*/

class Person{
    private String name;
    private int age;
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void Display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
public class PersonDetails{
    public static void main(String args[]){
        Person p1=new Person("Prince",20);
        p1.Display();
        Person p2=new Person("Rahul",21);
        p2.Display();
    }
}