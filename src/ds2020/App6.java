package ds2020;
//Polymorphism = many shapes
//Poly means you can use object of child class anywhere you would an object of parent class
public class App6 {

    public static void main(String[] args) {
        Plantt plantt1 = new Plantt();
        Tree tree1 = new Tree();
        
        Plantt plantt2 = tree1;
        plantt2.grow();
        tree1.shedLeaves();
    }
    
}

//create a class Tree, as a child class to Plant
class Plantt{
    public void grow(){
        System.out.println("Plantt growing...");
    }
}

class Tree extends Plantt{

    @Override
    public void grow() {
        //super.grow(); 
        System.out.println("Tree growing...");
    }
    
    public void shedLeaves(){
        System.out.println("Leaves shedding...");
    }
    
}