package structure;

public class Node<T>{
    private T data;
    private Node nextNode; //the next node pointer
    
    public Node(T data){
        this.data = data;
}
    
    public T getData(){
        return this.data;
    }
    
    public Node getNextNode(){
        return this.nextNode;
    }
    
    public void setData(T data){
        this.data = data;
    }
    
    public void setNextNode(Node nextNode){
        this.nextNode = nextNode;
    }
    
    public String toString(){
        return "Data: " + this.data;
    }
}
