
package structure;

public class App13 {

    public static void main(String[] args) {
        Queue q1 = new Queue(5);
//        q1.enqueue("A");
//        q1.enqueue("B");
//        q1.enqueue("C");
//        q1.enqueue("D");
//        q1.enqueue("E");
        q1.enqueueMany("A B C");
        q1.display();
        
        q1.dequeue();
        q1.dequeue();
        q1.display();
        
        q1.enqueue("T");
        q1.display();
        
        q1.dequeueAll();
        q1.display();
    }
    
}

class Queue{
    int maxSize;
    int head;
    int tail;
    String arr[];
    
    public Queue(int n){
        this.maxSize = n;
        this.head = 0;
        this.tail = 0;
        arr = new String[maxSize];
    }
    
    public boolean isEmpty(){
        return tail ==0;
    }
    
    public boolean isFull(){
        return tail >= maxSize;
    }
    
    public void enqueue(String s){
        if(isEmpty()){
            arr[head] = s;
            tail++;
        }
        else{
            if(isFull()){
                System.out.println("Queue is full");
            }
            else{
                arr[tail] = s;
                tail++;
            }
        }
    }
    
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Dequeue failed, queue is empty");
        }
        else{
            String temp = arr[head];
            for(int i = 0; i<tail-1; i++){
                arr[i] = arr[i+1];
            }
            tail--;
        }
    }
    
    public void display(){
        if(!isEmpty()){
            for(int i = 0; i<tail; i++){
                System.out.print(arr[i] + " ");
            }
        }
        else{
            System.out.println("Nothing to display");
        }
        System.out.println("");
    }
    
    public void enqueueMany(String s){
        String[] temp = s.split(" ");
        for(int i = 0; i<temp.length; i++){
            enqueue(temp[i]);
        }
    }
    
    public void dequeueAll(){
        if(!isEmpty()){
            for(int i = tail-1; i>=0; i--){
                dequeue();
            }
        }
    }
    
    public void peek(){
        
    }
}