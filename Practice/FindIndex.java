//Write a Java program to find the index of a specific element in an integer array.?

public class FindIndex{
    public static void main(String args[]){
        int []a={10,30,20,50,66,89,67};
        int key=50;
        int flag=0;
        for( int i=0;i<a.length;i++){
            if(a[i]==key){
                flag=i;
                break;
            }
        }
        if(flag==0){
            System.out.println("Index not Found");
            
        }else{
            System.out.println("Index number of "+key+ " is : "+flag);
        }
    }
}