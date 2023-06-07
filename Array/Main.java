/*Write a program to create an object of an class which contain a method and call that class method in
main method.*/
class Main{
public static int add(int x, int y){
    return x+y;
}

public static void main(String args[]){
    Main obj=new Main();
    System.out.println("Sum is "+ obj.add(5,7));
}
}