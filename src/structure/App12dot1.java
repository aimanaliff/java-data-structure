package structure;

public class App12dot1 {

    public static void main(String[] args) {
        
    Stack2 myStack = new Stack2(4);
    
    myStack.push("A");
    myStack.push("B");
    myStack.push("C");
    
    myStack.display();
    }
    
}

class Stack2{
    // data for stack
    int maxSize;        // declare size of the array
    int top;            // declare pointer to the stack
    String arr[];          // declare an int array
    
    // a constructor
    public Stack2(int x){
        this.maxSize = x;
        this.arr = new String[maxSize];    // very important! specifying type of Stack
        this.top = 0;   // point top pointer to zero at initialization
    }
    
    // good to know if stack is empty or not
    // and if stack is empty, cannot pop 
    public boolean isEmpty(){
        if (top == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    // because, if stack is full, cannot insert new element
    public boolean isFull(){
        if(top >= maxSize){
            return true;
        }
        else{
            return false;
        }
    }
        
    // method push to insert an element into stack
    public void push(String str){
        // before push, test if stack full
        if(!isFull()){
            arr[top] = str;     // insert an element where top is pointing
            top++;              // make sure to move the top pointer one up
        }
        else{
            System.out.println("Stack overflow!!!");
        }
    }
    
    // method pop to delete an element of stack
    public String pop(){
        if(!isEmpty()){
            String temp = peek();  // just to know what we are popping
            arr[top-1] = null;
            top--;
            return temp;
        }
        else{
            return null;
        }
    }
    
    // good to have a method that peeks at the top element of the stack
    public String peek(){
        if(top > 0){
            return arr[top-1];
        }
        else{
            return null;
        }
    }
    
    // method display to show stack elements
    public void display(){
        if(!isEmpty()){
            for(int i=0; i<maxSize; i++){
                System.out.println(arr[i]);
            }
        }
    }
}