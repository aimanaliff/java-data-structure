
package structure;

public class App12dot2 {

    public static void main(String[] args) {
        
        Stacks<String> leStack = new Stacks<String>(3);
        
        leStack.push("40");
        leStack.display();
        
        leStack.push("21");
        leStack.display();

        leStack.push("4");
        leStack.display();
        
        leStack.pop();
        leStack.pop();
        leStack.display(); //cannot push anymore because array is occupied with 0
    }
    
}

class Stacks<T>{
    
    int maxSize;
    int top;
    T arr[];
    int count = 0;
    
    public Stacks(int num){
        this.maxSize = num;
        arr = (T[])new Object[maxSize];
        this.top = -1;
    }
    
    public void push(T x){
        if(!isFull()){
            arr[top+1] = x;
            top++;
            count++;
        }
        else{
            System.out.println("Stack overflow");
        }
    }
    
    public T pop(){
        if(!isEmpty()){
            T temp = peek();
            arr[top] = null;
            top--;
            return temp;
        }
        else{
            return null;
        }
    }
    
    public boolean isFull(){
        if(top >= maxSize){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        else{
            return false;
        }
    }
    
    public T peek(){
        if(top>0){
            return arr[top];
        }
        else{
            return null;
        }
    }
    
    public void display(){
        if(!isEmpty()){
            for(int i = count-1; i>=0; i--){
                System.out.println("("+i+")"+arr[i]);
            }
        }
    }
}