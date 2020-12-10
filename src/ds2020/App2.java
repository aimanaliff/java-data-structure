package ds2020;

class Machine {
    
    private String name;
    private int age;
    
    public Machine(){ //constructor without input parameter
        System.out.println("Constructor 1 running!");
        
    }
    
    public Machine(String name){ //constructor with 1 parameter type String
        this.name = name;
        System.out.println("Constructor 2 running" + name);
    }
    
    public Machine(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Constructor 3 running");
    }
    
}

public class App2 {

    public static void main(String[] args) {
        
        Machine machine1 = new Machine(); //new Machine(); is actually a constructor for class Machine
        Machine machine2 = new Machine("Yorushika");
        Machine machine3 = new Machine("Minami", 20);
        
    }
    
}
