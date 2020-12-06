
package exercise3;

public class Exercise3Q2 {

    public static void main(String[] args) {
        
        GenericQueue<Integer> q1 = new GenericQueue<Integer>(20);
        
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.enqueue(40);
        q1.enqueue(50);
        q1.enqueue(60);
        q1.enqueue(70);
        q1.enqueue(80);
        q1.enqueue(90);
        
        
        q1.changeOrder(9);
        q1.display();
        
    }
    
}

class GenericQueue<T>{
    int maxSize;
    int head;
    int tail;
    T arr[];
    
    public GenericQueue(int n){
        this.maxSize = n;
        this.head = 0;
        this.tail = 0;
        arr = (T[]) new Object[maxSize];
    }
    
    public void size(){
        int count = 0;
        if(!isEmpty()){
            for(int i=0; i<tail; i++){
                count++;
            }
            System.out.println("Size of queue: " + count);
        }
        else
            System.out.println("Size of queue:" + 0);
    }
    
    public boolean isEmpty(){
        return tail ==0;
    }
    
    public boolean isFull(){
        return tail >= maxSize;
    }
    
    public void enqueue(T s){
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
    
    public void enqueueMany(String s){
        String[] temp = s.split(" ");
        for(int i = 0; i<temp.length; i++){
            enqueue((T)temp[i]);
        }
    }
    
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Dequeue failed, queue is empty");
        }
        else{
            T temp = arr[head];
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
    
    
    public void peek(){
        System.out.println(arr[head]);
    }
    
    public void changeOrder(int k){
        for(int i=0; i<k-1; i++){
            T temp = arr[head];
            dequeue();
            enqueue(temp);
        }
    }
}