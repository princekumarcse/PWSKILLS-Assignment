//Write a program to print the day name based upon the day number.1 - Monday, 2 - Tuesday, etc.
import java.util.Scanner;
class PrintDay{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Day Number: ");
        int day=sc.nextInt();
        switch(day){
            case 1:{
                System.out.println("Monday");
                break;
            }
            case 2:{
                System.out.println("Tuesday");
                break;
            }
            case 3:{
                System.out.println("Wednessday");
                break;
            }
            case 4:{
                System.out.println("Thursday");
                break;
            }
            case 5:{
                System.out.println("Friday");
                break;
            }
            case 6:{
                System.out.println("Saturday");
                break;
            }
            case 7: {
                System.out.println("Sunday");
                break;
            }
            default:
                System.out.print("Enter Valid Input");
                break;
        }
    }
}