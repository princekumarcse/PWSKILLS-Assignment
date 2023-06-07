// Write a Java program to calculate the sum of all elements in an integer array?
class SumOfArray{
    public static int Sum(int arr[]){
    int result=0;
      for(int i=0;i<arr.length;i++){
        result=result+arr[i];
      }
      return result;
    }
    public static void main(String args[]){
        int arr[]={3,5,6,7,9};
        System.out.println("Sum of Array is: "+Sum(arr));
    }
}