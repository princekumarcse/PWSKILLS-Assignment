//write a program to delete all consonants from the string "Hello,have a good day".
class DeleteConsonant{
    public static void main(String args[]){
        String s="Hello,have a good day";
        String str="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                str=str+ch;
            }else{
                continue;
            }
        }
        System.out.println("String with Consonant: "+s);
        System.out.print("String without Consonant: :"+str);
    }
}