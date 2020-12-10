package ds2020;

class Plant{
    private String name;
    private int age;
    
    public String getName(){
        return name;
    }
    
    public void setName(String newName){ 
        this.name = newName;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int newAge){
        age = newAge;
    }
}

class Robot{
    //notes: encapsulation using private parameters
    //because you are hiding the data inside a particular classes
    
    private String name;
    private int age;

    //notes: method can have access specifier like public, private, protected
    //methods can have one return argument
    //methods can carry many input parameters/arguments
    //methods can simplify data fetching using getters and setters
    
    public String getName(){
        return name;
    }
    
    public void setName(String newName){ 
        this.name = newName;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int newAge){
        age = newAge;
    }
    
    public void speak(String text){
        System.out.println(text);
    }
    
    public void jump(int height){
        System.out.println("Jumping: " + height);
    }
    
    public void move(String direction, double distance){
        System.out.println("Moving " + distance + "km in " + direction + " direction");
    }
}

public class App1 {
    public static void main(String[] args) {
        
        Robot robot1 = new Robot();
        robot1.speak("Hai, I'm robot");
        robot1.jump(7);
        robot1.move("West", 15.9);
        String greeting = "Hi Hello";
        robot1.speak(greeting);
        
        robot1.setName("ARA");
        System.out.println(robot1.getName());
        robot1.setAge(20);
        System.out.println(robot1.getAge());
        
        Plant plant1 = new Plant();
        plant1.setName("Dandelion");
        System.out.println(plant1.getName());
        plant1.setAge(100);
        System.out.println(plant1.getAge());
    }
}
