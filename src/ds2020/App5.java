package ds2020;

class Car extends MMachine{
    public void wipeWindShield(){
        System.out.println("Wiping windshield...");
    }
    
    public void start(){
        System.out.println("Car started... ");
    }
    
    public void stop(){
        System.out.println("Car stopped... ");
    }
}

class MMachine{
    public void start(){
        System.out.println("MMachine started... ");
    }
    public void stop(){
        System.out.println("MMachine stopped... ");
    }
}

public class App5 {

    public static void main(String[] args) {
        MMachine mach1 = new MMachine();
        mach1.start();
        mach1.stop();
        
        Car car1 = new Car();
        car1.wipeWindShield();
        car1.start();
        car1.stop();
    }
    
}
