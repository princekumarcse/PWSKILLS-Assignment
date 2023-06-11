//write a program to reverse a string without using the inbuilt method
class ReverseStringWithoutInbuilt{
    public static void main(String args[]){
        String s="Prince Kumar";
        String str="";
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            str+=ch;
        }
       System.out.println(s);   
       System.out.println(str);
    }
}