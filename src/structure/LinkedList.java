package structure;

public class LinkedList<T> {
    
    private Node head;
    private int count;
    
    public void insertAtHead(T data){
        
        Node newNode = new Node(data); //creating a new node
        newNode.setNextNode(this.head); //current head pointer shows to the next node
        this.head = newNode; //makes the head points to the new node object, making newNode the new head element
    }
    
    public void deleteFromHead(){
        this.head = this.head.getNextNode();
    }
    
    public int length(){
        int length = 0;
        Node current = this.head;
        while (current != null){
            length++;
            current = current.getNextNode();
        }
        
        return length;
    }
    
    public Node find(T x){
        Node current = this.head;
        while(current != null){
            if(current.getData() == x){
                return current;
            }
            current = current.getNextNode();
        }
        return null;
    }
    
    public String toString(){

        String result = "(";
        Node current = this.head;
        
        while(current!=null){
            result += current.toString() + ",";
            current = current.getNextNode();
        }
        result += ")";
        return result;
    }
}
