// Write a Java program to print an entire array?
class PrintArray{
    
    public static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]){
        int arr[]={2,3,4,5,23,7,8,9};
        PrintArr(arr);
    }
}