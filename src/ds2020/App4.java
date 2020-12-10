package ds2020;

class Frog{
    
    private int id;
    private String name;
    
    public Frog(int id, String name){
        this.id = id;
        this.name = name;
    }
    public String toString(){
//        return id + " : " + name;
        
//        StringBuilder ab = new StringBuilder();
//        ab.append(id).append(" : ").append(name);
//        return ab.toString();
        
        return String.format("%-4d: %s", id, name);
    }
}

public class App4 {

    public static void main(String[] args) {
        Frog frog1 = new Frog(777, "Froggy");
        Frog frog2 = new Frog(888, "Buggy");
        
        System.out.println(frog1);
        System.out.println(frog2);
    }
    
}
