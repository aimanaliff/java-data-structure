package ds2020;

class Thing{
    public String name; //non-static instance/variable
    public static String desc; //static instance/variable
    public final static int luckynumb = 7; //final cannot change the value
    
    public void showName(){ //non-static method
        System.out.println(name);
    }
    
    public static void showDesc(){ //static method
        System.out.println(desc);
    }
}
public class App3 {

    public static void main(String[] args) {
        Thing thing1 = new Thing();
        Thing thing2 = new Thing();
        
        thing1.name = "Box";
        thing2.name = "Pen";
        
        System.out.println(thing1.name);
        System.out.println(thing2.name);
        
        Thing.desc = "I am a thing";
        System.out.println(Thing.desc);
        
        thing1.showName();
        thing2.showName();
        Thing.showDesc();
        
        System.out.println(Math.PI);
        //Thing.luckynumb = 10; //cannot change value due to the final
    }
    
}
