/*Find if the input character is ‘a’ or not.
Note: Input characters will be lowercase alphabets.*/
import java.util.Scanner;
class FindChar{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        char ch=Sc.next().charAt(0);
        if(ch=='a'){
            System.out.print("Yes Given Input is a");
        }else{
            System.out.print("Not");
        }
    }
}