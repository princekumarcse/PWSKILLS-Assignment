// Write a program to demonstrate method overloading with 3 different parameters.
class MethodOverLoading{
    public static int Add(int x, int y){
        return x+y;
    }
    public static double Add(double x,double y){
        return x+y;
    }
    public static float Add(float x,float y){
        return x+y;
    }
    public static void main(String args[]){
    
    System.out.println("Sum is"+" "+Add(2,5));
    System.out.println("Sum is"+" "+Add(2.5,5.6));
    System.out.println("Sum is"+" "+Add(5.7f,5.8f));

    }
}