//Write a Java program to calculate the sum of all elements in an integer array?
public class SumOfArray{
    public static void main(String args[]){
        int []a={10,20,30,40,50,60};
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println("Sum is : "+sum);//210
    }
}