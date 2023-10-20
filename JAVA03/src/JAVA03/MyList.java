package JAVA03;

public class MyList <E> {
    private Node<E> firstNode;
    private Node<E> lastNode;
    private Node<E> actual;
    private static int contador=0;
    
    public MyList(){
        this.firstNode = null;
        this.lastNode = null;
        this.actual = null;
    }
    
    public void showMyList(){
        Node<E> temporary = this.firstNode;
        while (temporary != null){
            System.out.println(temporary.getMain());
//            System.out.println(temporary.getMain.toString());
            temporary=temporary.getSiguienteNode();
        }
    }

    public Node<E> getActual() {
        return actual;
    }
    
    public void add(E p){
        this.contador++;
        Node<E> newNode = new Node(p);
        if(contador==1){
        this.firstNode = newNode;
        this.lastNode = newNode;
        this.actual = newNode;
        actual.anteriorNode=null;
        }else{
            lastNode.setSiguienteNode(newNode);
            newNode.setAnteriorNode(this.lastNode);
            this.lastNode = newNode;
            lastNode.siguienteNode=null;
            
        }
    }
        
    public boolean esprimero(){
        return actual.anteriorNode==firstNode;
    }
    
    public boolean esultimo(){
        return actual.siguienteNode==lastNode;
    }
    
    public void remove(){
        this.contador--;
        if(actual==firstNode){
            siguiente();
            firstNode = actual;
            actual.anteriorNode = null;
        }else{
            if(actual==lastNode){
                anterior();
                lastNode=actual;
                actual.siguienteNode=null;
            }else{
            Node<E> aux = actual;
            siguiente();
            aux.getAnteriorNode().setSiguienteNode(aux.getSiguienteNode());
            aux.getSiguienteNode().setAnteriorNode(aux.getAnteriorNode());
            }
            
        }
    }
    
    public void modify(E p){
        actual.setMain(p);
    }
    
    public void siguiente(){
        this.actual = actual.getSiguienteNode();
    }
    
    public void anterior(){
        this.actual = actual.getAnteriorNode();
    }

    
// Inner class

    public class Node<E>{
        private Node<E> siguienteNode;
        private Node<E> anteriorNode;
        E main;
        
        public Node(E p){
            this.siguienteNode = null;
            this.anteriorNode = null;
            this.main = p;                   
        }
        
        public Node<E> getSiguienteNode() {
            return this.siguienteNode;
        }
        
        public Node<E> getAnteriorNode() {
            return this.anteriorNode;
        }

        public void setSiguienteNode(Node<E> nextNode) {
            this.siguienteNode = nextNode;
        }
        
        public void setAnteriorNode(Node<E> anteriorNode) {
            this.anteriorNode = anteriorNode;
        }

        public E getMain() {
            return main;
        }

        public void setMain(E p) {
            this.main = p;
        }
    }
}
