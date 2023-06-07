//Print the sum of the first ‘n’ natural numbers using a for loop, where n is the input
import java.util.Scanner;
class SumOfNaturalNum{
    public static int sum(int n){
        int result=0;
        for(int i=1;i<=n;i++){
            result=result+i;
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
        System.out.print("Sum is: "+sum(n));
    }
}