package ds2020;
import java.util.ArrayList;
//Java has many Type Parameters
//E: Element
//K: Key
//N: Number
//T: Type
//V: Value

class Machine3{
    public String toString(){
        return "I am Machine3";
    }
    
    public void start(){
        System.out.println("Machine starting...");
    }
}

class Camera1 extends Machine3{
    public String toString(){
        return "I am Camera1";
    }
    
    public void snap(){
        System.out.println("Camera snapping...");
    }
}

public class App10 {

    public static void main(String[] args) {
        
        ArrayList<Machine3> list1 = new ArrayList<Machine3>();
        list1.add(new Machine3());
        
        
        ArrayList<Camera1> list2 = new ArrayList<Camera1>();
        list2.add(new Camera1());
        
        
        //how to parse an array as method parameter/argument
        //Note:
        //So, Camera extends Machine3 BUT
        //ArrayList<Camera1> does not extends ArrayList<Machine3>
        System.out.println("Printing list1 -----------");
        showList(list1); //can run if public static void showList(ArrayList<Machine3> list)
        System.out.println("Printing list2 -----------");
        showList(list2); //can run if public static void showList(ArrayList<Camera1> list)
    }
    /*
    public static void showList(ArrayList<Machine3> list){
        //iterate through an array, element by element
        for(Machine3 value: list){
            System.out.println(value);
        }
    } */
    
    //using wildcard to generalize <Type>
    //pair it with Object to generalize element in array
    public static void showList(ArrayList<? extends Machine3> list){
        //iterate through an array, element by element
        for(Machine3 value: list){
            System.out.println("Print value: " + value);
            System.out.println("Printing value.start():");
            value.start();      //not overriding method
            System.out.println(value.toString());  //overriding method
        }
        
        //normal for loop to iterate through an array
        for(int a=0; a<list.size(); a++){
            list.get(a);
        }
    }
}
