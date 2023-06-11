// write a program to know whether the given string in palindrome.
class Palindrome{
    public static void main(String args[]){
        String s="abc";
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){
            reverse+=s.charAt(i);
        }
        if(s.equals(reverse)){
            System.out.print("Yes,Palindrome String");
        }else{
            System.out.print("Not,Palindrome String");
        }
    }
}