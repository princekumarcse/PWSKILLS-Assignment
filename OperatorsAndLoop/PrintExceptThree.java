//Print all values between w and w00, except if it’s a multiple of 3}
class PrintExceptThree{
    public static void main(String args[]){
        for(int i=1;i<=100;i++){
            if(i%3==0){
                continue;
            }else{
                System.out.print(i+" ");
            }
        }
    }
}