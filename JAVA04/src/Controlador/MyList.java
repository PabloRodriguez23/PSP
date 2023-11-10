package Controlador;

import Modelo.Empleado;
import Vista.Vista;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MyList<E> {

    private Node<E> firstNode;
    private Node<E> lastNode;
    private Node<E> actual;
    private static int contador = 0;

    public MyList() {
        this.firstNode = null;
        this.lastNode = null;
        this.actual = null;
    }

    public void showMyList() {
        Node<E> temporary = this.firstNode;
        while (temporary != null) {
            System.out.println(temporary.getMain());
//            System.out.println(temporary.getMain.toString());
            temporary = temporary.getSiguienteNode();
        }
    }

    public Node<E> getActual() {
        return actual;
    }

    public void setActual(Node<E> actual) {
        this.actual = actual;
    }

    public Node<E> getFirstNode() {
        return firstNode;
    }

    public Node<E> getLastNode() {
        return lastNode;
    }

    public void add(E p) {
        this.contador++;
        Node<E> newNode = new Node(p);
        if (contador == 1) {
            this.firstNode = newNode;
            this.lastNode = newNode;
            this.actual = newNode;
            actual.anteriorNode = null;
        } else {
            lastNode.setSiguienteNode(newNode);
            newNode.setAnteriorNode(this.lastNode);
            this.lastNode = newNode;
            lastNode.siguienteNode = null;

        }
    }

    public boolean esprimero() {
        return actual.anteriorNode == firstNode;
    }

    public boolean esultimo() {
        return actual.siguienteNode == lastNode;
    }

    public void remove() {
        this.contador--;
        if (actual == firstNode) {
            siguiente();
            firstNode = actual;
            actual.anteriorNode = null;
        } else {
            if (actual == lastNode) {
                anterior();
                lastNode = actual;
                actual.siguienteNode = null;
            } else {
                Node<E> aux = actual;
                siguiente();
                aux.getAnteriorNode().setSiguienteNode(aux.getSiguienteNode());
                aux.getSiguienteNode().setAnteriorNode(aux.getAnteriorNode());
            }

        }
    }

    public void modify(E p) {
        actual.setMain(p);
    }

    public void siguiente() {
        this.actual = actual.getSiguienteNode();
    }

    public void anterior() {
        this.actual = actual.getAnteriorNode();
    }

    public boolean existe(int numEmp) {
        Node<E> temporary = this.firstNode;
        boolean encontrado = false;
        while (temporary != null) {
            if (temporary.indice == numEmp) {
                encontrado = true;
                break;
            }
            temporary = temporary.getSiguienteNode();
        }
        return encontrado;
    }

    public void interCambiarfail(int numEmp1, int numEmp2) {
        Node<E> aux1 = this.firstNode;
        Node<E> aux2 = this.firstNode;
        while (aux1 != null) {
            if (aux1.getIndice() == numEmp1) {
                break;
            }
            aux1 = aux1.getSiguienteNode();
        }
        while (aux2 != null) {
            if (aux2.getIndice() == numEmp2) {
                break;
            }
            aux2 = aux2.getSiguienteNode();
        }
        Node<E> extra = new Node(aux1.getMain());
        aux1.setMain(aux2.getMain());
        aux1.setIndice(numEmp2);
        aux2.setMain(extra.getMain());
        aux2.setIndice(numEmp1);
    }
    
    public void interCambiaror(Node<E> numEmp1, Node<E> numEmp2) {
        Node<E> aux1 = numEmp1;
        Node<E> aux2 = numEmp2;
        Node<E> extra = new Node(aux1.getMain());
        aux1.setMain(aux2.getMain());
        aux1.setIndice(numEmp2.getIndice());
        aux2.setMain(extra.getMain());
        aux2.setIndice(numEmp1.getIndice());
    }
    
    

    public boolean sort() {
        int TAM = contador;
        int i=0;
        Node<E> aux1 = firstNode;
        Node<E> aux2 = firstNode;
        aux2 = aux2.siguienteNode;
        while(aux1!=null) {
            while (aux2!=null) {
                if (aux1.getIndice() > aux2.getIndice()) {
                    //interCambiarfail(aux1.getIndice(), aux2.getIndice());
                    interCambiaror(aux1, aux2);
                }
                aux2 = aux2.siguienteNode;
            }
            i++;
            System.out.println(i);
            aux1=aux1.siguienteNode;
            aux2=aux1;
        }
        return true;
    }
    
    public void guardar(){
        try {
            FileOutputStream fichsalida = new FileOutputStream("Lista.ser");
            ObjectOutputStream recorredor = new ObjectOutputStream(fichsalida);
            Node<E> aux1 = firstNode;
            while(aux1!=null){
                recorredor.writeObject(aux1.getMain());
                aux1=aux1.siguienteNode;
            }
        } catch (IOException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void CrearJList() {
       DefaultListModel<Empleado> modeloJList=  modeloJList = new DefaultListModel<>();
       JList<Empleado> JListEmpleados= new JList<>(modeloJList);
       JScrollPane scroll= new JScrollPane(JListEmpleados);
       JFrame ventanaJList ;
       
       Node<E> Actual = firstNode;
       
        while (Actual != null) {
            modeloJList.addElement((Empleado) Actual.getMain());
            Actual = Actual.getSiguienteNode();
        }

        JListEmpleados.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        ventanaJList = new JFrame("Lista de Empleados");
        ventanaJList.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        JListEmpleados.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        ventanaJList.add(scroll);
        ventanaJList.pack();
        ventanaJList.setVisible(true);
   }

// Inner class
    public class Node<E> {

        private Node<E> siguienteNode;
        private Node<E> anteriorNode;
        private int indice;
        E main;

        public Node(E p) {
            this.siguienteNode = null;
            this.anteriorNode = null;
            this.main = p;
            Empleado aux = (Empleado) p;
            this.indice = aux.getNumero();
        }

        public Node<E> getSiguienteNode() {
            return this.siguienteNode;
        }

        public void setIndice(int indice) {
            this.indice = indice;
        }

        public int getIndice() {
            return indice;
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
