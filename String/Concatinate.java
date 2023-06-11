//how do you concatenate two strings in java?Give an Example?
class Concatinate{
    public static void main(String args[]){
        String s1="Prince";
        String s2="Kumar";
        String s=s1+" " +s2;
        System.out.println(s);

        String name=s1.concat(s2);
        System.out.println(name);

    }
}