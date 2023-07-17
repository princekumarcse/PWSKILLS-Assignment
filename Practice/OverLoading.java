//write a program to demonstrate method overloading with 3 different parameters.
public class OverLoading{
      public int sum(int x, int y){
        return (x+y);
      }
       public int sum(int x, int y, int z){
        return (x+y+z);
      }
       public int sum(int x, int y, int z,int a){
        return (x+y+z+a);
      }

      public static void main(String args[]){
        OverLoading ol= new OverLoading();

        System.out.println("Sum is : "+ol.sum(10,20));
        System.out.println("Sum is : "+ol.sum(10,20,30));
        System.out.println("Sum is : "+ol.sum(10,20,30,40));
      }
}