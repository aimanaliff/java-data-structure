package ds2020;
//Generics
//ArrayList is a member of the JAVA COLLECTION FRAMEWORK

import java.util.ArrayList;

public class App9 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("mango");
        
        String fruit = (String)list.get(3); //Downcasting from object to string
        System.out.println(fruit);
        
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("cat");
        list2.add("dog");
        list2.add("fish");
        list2.add("rat");
        
        String animal = list2.get(1);
        System.out.println(animal);
        
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        list3.add(1);
        list3.add(10);
        list3.add(100);
        list3.add(1000);
        
        int number = list3.get(2);
        System.out.println(number);
        
        ArrayList<Double> list4 = new ArrayList<Double>();
        list4.add(0.1);
        list4.add(0.12);
        list4.add(0.123);
        list4.add(0.1234);
        
        double db = list4.get(3);
        System.out.println(db);
        
    }
    
}
