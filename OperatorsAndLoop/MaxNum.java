// Årint the maximum of 3 numbers a, b, c taken as input.
import java.util.Scanner;
class MaxNum{
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Three Number: ");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    if(a>b && a>c){
        System.out.print(a+ " Is Maximum");
    }else if(b>c){
        System.out.print(b+ " Is Maximum");
    }else{
        System.out.print(c+ " Is Maximum");
    }
    }
}