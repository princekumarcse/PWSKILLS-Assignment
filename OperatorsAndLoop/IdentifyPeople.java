// Write a program to identify people as "Child" (age < 12), "Teenager" (12 <= age < 18) or "Adult" (age >= 18).
import java.util.Scanner;
class IdentifyPeople{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age=sc.nextInt();
        if(age<12){
            System.out.println("Child");
        }else if(age>=12 && age<18){
            System.out.println("Teenager");
        }else{
            System.out.println("Adult");
        }
    }
}