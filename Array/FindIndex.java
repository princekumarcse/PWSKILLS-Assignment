// Write a Java program to find the index of a specific element in an integer array.?
class FindIndex{

    public static int index(int arr[],int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x)
              return i;
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={4,7,9,7,28,78};
        int idx=8;
        int res=index(arr,idx);
        if(res==-1){
            System.out.println(idx + " Not Found in Array");
        }else{
            System.out.println(idx+" Is on Index no "+res);
        }
    }
}