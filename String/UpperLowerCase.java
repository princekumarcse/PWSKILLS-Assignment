//write a java program to convert upper case to lower case and vice versa.
import java.util.*;
class UpperLowerCase{
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter any String: ");
    String s=sc.nextLine();
    if(s.equals(s.toUpperCase())){
        System.out.println(s.toLowerCase());
    }else{
        System.out.println(s.toUpperCase());
    }
    }
}