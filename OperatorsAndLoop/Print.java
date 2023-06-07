/*T& Write a short program that gives the following as output -
For each multiple of 3, print "Fizz" instead of the number.
For each multiple of 5, print "Buzz" instead of the number.
For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number.
Otherwise print the number itself.*/
 class Print{
    public static void main(String args[]){
        int num =1;
        if(num%3==0 && num%5==0){
            System.out.println("FizzBuzz");
        } else if(num%5==0){
            System.out.println("Buzz");
        }else if(num%3==0 ){    
            System.out.println("Fizz");
        }else{
            System.out.println(num);
        }
    }
 }