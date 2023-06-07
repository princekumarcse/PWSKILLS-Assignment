// Tell if the number in the input is prime or not.
class CheckPrime{
    public static void main(String args[]){
        int num=13,i=0;
        for(i=2;i<num;i++){
            if(num%i==0)
            break;
        }if(i==num){
            System.out.println(num+" Is Prime");
        }else{
            System.out.println(num+" Is Not Prime");
        }
    }
}