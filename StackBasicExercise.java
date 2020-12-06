package stackbasicexercise;

public class StackBasicExercise {

    public static void main(String[] args) {
        
        Stack1 aStack = new Stack1(8);
        
//        aStack.push(1);
//        aStack.push(4);
//        aStack.push(5);
//        aStack.push(6);
//        aStack.push(2);
//        aStack.push(9);
//        aStack.push(1);
//        aStack.push(0);
        aStack.addInput(14562910);
        aStack.showAdd();
        aStack.display();
        aStack.popBottom();
        aStack.display();
        
    }
    
}

class Stack1{
    int maxSize;
    int top;
    int arr[];
    int count = 0;
    int total = 0;
    
    public Stack1(int x){
        this.maxSize = x;
        this.arr = new int[maxSize];
        this.top = -1;
    }
    
    public void push(int x){
        if(!isStackFull()){
            arr[top+1] = x;
            top++;
            count++;
        }
        else{
            System.out.println("Stack overflow");
        }
    }
    
    public int pop(){
        if(!isStackEmpty()){
            int temp = peek();
            arr[top] = 0;
            top--;
//            count--;
            return temp;
        }
        else{
            return 0;
        }
    }
    
    public int peek(){
        if(top>0){
            return arr[top];
        }
        else{
            return 0;
        }
    }
    
    public boolean isStackEmpty(){
        if(top == -1){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean isStackFull(){
        if(top >= maxSize){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int popBottom(){
        int[] temp = new int[8];
        int ret = arr[0];
        for(int i = 1; i < top; i++){
            temp[i-1] = arr[i];
        }
        this.arr = temp;
        return ret;
    }
    
    public void addInput(int input){
        String str = Integer.toString(input);
        int length = str.length();
        for(int i=0; i<length; i++){
            push(Character.getNumericValue(str.charAt(i)));
        }
    }
    
    public void showAdd(){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
            System.out.print(arr[i] + " + ");
            if(i==arr.length-1){
                System.out.print(arr[i] + " = ");
            }
        }
        System.out.print(sum);
        System.out.println("");
    }
    
    public void display(){
        if(!isStackEmpty()){
            for(int i = maxSize-1; i>=0; i--){
                System.out.print(arr[i]);
            }
            System.out.println("");
        }
    }
    
}