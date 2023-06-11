//Write a program to reverse a sentence while preserving the position
class ReverseSentence{
    public static void main(String args[]){
        String str="Think Twice";

        String result="";

        for(int i=str.length()-1;i>=0;i--){
            result+=str.charAt(i);
            
        }
        System.out.print(result);
    }
}