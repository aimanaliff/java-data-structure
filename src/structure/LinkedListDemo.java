package structure;

public class LinkedListDemo {

    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<String>();
        
        list.insertAtHead("10");
        list.insertAtHead("Hello");
        list.insertAtHead("Hi");
        list.insertAtHead("Morning");
        list.insertAtHead("Tree");
        
        System.out.println(list);
        list.deleteFromHead();
        System.out.println(list);
        
    }
    
}
