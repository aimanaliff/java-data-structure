package ds2020;

import java.util.ArrayList;

public class App11 {

    public static void main(String[] args) {
        
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(100);
        num.add(10);
        num.add(400);
        num.add(500);
        
        //removing items/elements from an array using method remove
        num.remove(0);
        
        //System.out.println(num.get(0));
        
        
        
        for(int i=0; i<num.size(); i++){
            System.out.println(num.get(1));
        }
        
        for(Integer value: num){
            System.out.println(value);
        }
    }
    
}
