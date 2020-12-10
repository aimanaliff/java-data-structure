package structure;

public class App12 {

    public static void main(String[] args) {
        
        Stack1 myStack = new Stack1(4);
//        int[] stk = {10, 20, 30, 40, 50};
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
//        myStack.pushMany(10,20,30,40);
        myStack.display();
        System.out.println("Pop: " + myStack.pop());
        
        myStack.display();
        
    }
}

class Stack1{
    // data for stack
    int maxSize;        // declare size of the array
    int top;            // declare pointer to the stack
    int arr[];          // declare an int array
    int count = 0;
    
    // a constructor
    public Stack1(int x){
        this.maxSize = x;
        this.arr = new int[maxSize];    // very important! specifying type of Stack
        this.top = -1;   // point top pointer to zero at initialization
    }
    
    // good to know if stack is empty or not
    // and if stack is empty, cannot pop 
    public boolean isEmpty(){
        if (top == -1){
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
    public void push(int str){
        // before push, test if stack full
        if(!isFull()){
            arr[top+1] = str;     // insert an element where top is pointing
            top++;
            count++;// make sure to move the top pointer one up
        }
        else{
            System.out.println("Stack overflow!!!");
        }
    }
    
    // method pop to delete an element of stack
    public int pop(){
        if(!isEmpty()){
            int temp = peek();  // just to know what we are popping
            arr[top] = 0;
            top--;
            return temp;
        }
        else{
            return 0;
        }
    }
    
    // good to have a method that peeks at the top element of the stack
    public int peek(){
        if(top > 0){
            return arr[top];
        }
        else{
            return 0;
        }
    }
    
    // method display to show stack elements
    public void display(){
        if(!isEmpty()){
            for(int i=count-1; i>=0; i--){
                System.out.println("("+i+") " + arr[i]);
            }
        }
//        for(int i:arr){
//            System.out.println(i);
//        }
    }
    
    public void pushMany(int... a){
        if(!isFull()){
            for(int i:a){
                arr = a;
            }
        }
    }
}