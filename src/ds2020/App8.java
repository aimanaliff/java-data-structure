package ds2020;
//Upcasting & Downcasting
//Important for generics
public class App8 {

    public static void main(String[] args) {
        Machine2 mach1 = new Machine2();
        Camera cam1 = new Camera();
        
        mach1.start();
        cam1.start();
        cam1.snap();
        
        System.out.println("Upcasting output ---------------------");
        //Upcasting example
        //Machine2 mach2 = new Camera();
        Machine2 mach2 = cam1; //line 16 means the same as lne 15
        mach2.start();
        
        System.out.println("Downcasting output --------------");
        //Downcasting
        Machine2 mach3 = new Camera(); //mach3 is object of child
        //Camera cam2 = new Machine2();
        Camera cam2 = (Camera)mach3; //casting allows "downcasting"
        cam2.start();
        cam2.snap();
        cam2.stop();
    }
    
}

class Machine2{
    public void start(){
        System.out.println("Machine started...");
    }
    
    public void stop(){
        System.out.println("Machine stopped...");
    }
}

class Camera extends Machine2{
    public void start(){
        System.out.println("Camera started...");
    }
    
    public void snap(){
        System.out.println("Photo taken...");
    }
}