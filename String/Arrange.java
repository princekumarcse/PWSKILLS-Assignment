//write a program to sort the string alphabetetically
class Arrange{
    public static void main(String args[]){
        String str="zbdhshjsh";
        char arr[]=str.toCharArray();

        char temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print(arr);
    }
}