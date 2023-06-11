//write a  simple program to take input from user in java.
import java.util.Scanner;
class InputFromUsers{
    public static void main(String rag[]){
    Scanner sc= new Scanner(System.in);
   
    System.out.println("Enter Your Name: ");
    String name=sc.nextLine();
    
    System.out.println("Enter Any Numbers: ");
    int num=sc.nextInt();

    System.out.println("Your Output is: ");
    System.out.println(num);
    System.out.print(name);
    }
}