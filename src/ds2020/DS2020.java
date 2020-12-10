/*
 * in every .java file, can only have 1 public class
 * and for each public class, need to declare one main method
 * in every .java file, you can have non public classes
 * definition of a class - a template for creating objects
 * definition of an object - 'everything can be an obejct'
 */
package ds2020;

/**
 *
 * @author Aliff Aiman
 */

class Person {
    //classes can contain 2 things: 1. data, 2. methods (subroutine/behaviour)
    String name;
    //Integer age; //age is defined as an object of class intger
    int age; //age is defined as an object of type int
    String breakfast;
    
    void speak(){
        
        for(int i=0; i<1; i++){
            System.out.println("My name is: " + name + " and I am " + age + " years old");
        }
    }
    
    void eat(){
        System.out.println("I had " + breakfast + " this morning");
    }
    
    int calculateYearToGraduate(){
        
        int yearsLeft = 23 - age;
        return yearsLeft;
    }
    
    int calculateYearToMarry(int number){
        
        int yearsToMarry = 23 + number;
        return yearsToMarry;
    }
}

public class DS2020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person person1 = new Person(); 
        person1.name = "Aliff";
        person1.age = 20;
        person1.breakfast = "oats";
        
        Person person2 = new Person();
        person2.name = "Aiman";
        person2.age = 20;
        person2.breakfast = "bread";
        /*
        System.out.println(person1); //fetching memory address where the object is stored in physical harddisk
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person2.name);
        System.out.println(person2.age);
        */
        person1.speak();
        person1.eat();
        int a = person1.calculateYearToGraduate();
        int b = person1.calculateYearToMarry(a);
        System.out.println("Years left to graduate: " + a);
        System.out.println("Age to marry: " + b);
        person2.speak();
        person2.eat();
        
        
    }
    
}
