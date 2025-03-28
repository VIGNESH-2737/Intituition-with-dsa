// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        
    NodeDriver name = new NodeDriver();
    NodeDriver.init();
    NodeDriver.printNode();
    
    }
}

class Node{
    String data;
    Node right;
    Node left;
    
    Node(String data){
        this.data = data;
    }
    
    Node(String data, Node left, Node right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

class NodeDriver{
    
    static Node head;
    
    public static void init(){
        
    if(head == null){
        head = new Node("Vignesh");
    }
        
    if(head.left == null){
        head.left = new Node("Batman");
    }
        
    if(head.right == null){
        head.right = new Node("Ballman");
    }
}
    
    
public static void addNode(String parent, String value, boolean isLeft){
    
    if(!head.data.equals(parent)){
        if(head.left.data.equals(parent)){
            head = head.left;
        }else{
            head = head.right;
        }
    }
    if(isLeft){
        head.left = new Node(value);
    }else{
        head.right = new Node(value);
    }
    
}

public static void printNode(){
    System.out.println("Node :"+head.data);
    System.out.println("Left Node :"+head.left.data);
    System.out.println("Right Node :"+head.right.data);
    
    addNode("Vignesh","Bag",true);
    addNode("Vignesh","Dhinesh",false);
    
    System.out.println("Node :"+head.data);
    System.out.println("Left Node :"+head.left.data);
    System.out.println("Right Node :"+head.right.data);
    
    addNode("Dhinesh","Sneha",false);
    
    System.out.println("Right Node of Dhinesh:"+head.right.data);
    
}

}
