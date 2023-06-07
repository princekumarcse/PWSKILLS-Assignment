/* Write a short program that prints each number from 1 to 100 on a new line, except if the number is a
multiple of 5 or 7.*/
class PrintNum{
    public static void main(String args[]){
        for(int i=1;i<=100;i++){
            if(i%5==0 || i%7==0)
            continue;
            System.out.println(i);
        }
    }
}