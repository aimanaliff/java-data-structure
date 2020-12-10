package ds2020;
//Generics - casting
public class App7 {

    public static void main(String[] args) {
        //datatypes for numerical
        
        byte bytevalue = 20;
        short shortvalue = 55;
        int intvalue = 888;
        long longvalue = 23355;
        
        float floatvalue = 8834.3f;
        float floatvalue2 = (float)99.3;
        double doublevalue = 32.4;
        
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Byte.MAX_VALUE);
        
        intvalue = (int)longvalue;
        System.out.println(intvalue); //cast right hand side to match left side
        
        doublevalue = intvalue; //no problem to cast int to double
        
        intvalue = (int) floatvalue;
        System.out.println("Result: " + intvalue);
        
        bytevalue = (byte)127;
    
    }
}