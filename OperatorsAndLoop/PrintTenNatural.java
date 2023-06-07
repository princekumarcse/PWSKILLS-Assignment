// Print the sum of the first 10 natural numbers using do while loop.
class PrintTenNatural{
    public static void main(String args[]){
        int i=1,sum=0;
        do{
            sum=sum+i;
            i++;
        }while(i<=10);
        System.out.println("Sum of 10 Natural number is: "+sum);
    }
}