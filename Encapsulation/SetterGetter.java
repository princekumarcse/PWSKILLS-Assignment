/*3.Use a private keyword for a variable and use setter and getter methods to initialise and
print the values.*/
class Details{
    private int x;

    public void setData(int x){
        this.x=x;
    }
    public int getData(){
        return x;
    }
    public void Display(){
        System.out.println("Value is: "+x);
    }
}
public class SetterGetter{
    public static void main(String args[]){
        Details obj1=new Details();
        obj1.setData(20);
        obj1.Display();

        Details obj2=new Details();
        obj2.setData(30);
        obj2.Display();
    }
}