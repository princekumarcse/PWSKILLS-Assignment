/*1.Create a class that keeps track of the number of instances created. Implement a static
variable and method to accomplish this.*/

class Instance{
    private static int count=0;
    public Instance(){
        count++;
    }

    public static int getInstanceCount(){
        return count;
    }
}
public class InstanceCreate{
    public static void main(String args[]){

    Instance obj1= new Instance();
    System.out.println(Instance.getInstanceCount());  

    Instance obj2= new Instance();
    System.out.println(Instance.getInstanceCount()); 
    }
}