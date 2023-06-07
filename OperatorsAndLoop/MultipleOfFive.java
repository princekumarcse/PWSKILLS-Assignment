// Print the first multiple of 5 which is also a multiple of 7?
class MultipleOfFive{
    public static void main(String args[]){
        int i=0;
        for(i=1;  ;i++){
            if(i%5==0 && i%7==0)
            break;
        }
        System.out.println("First Multiple of 5 and 7 is: "+ i);
    }
}