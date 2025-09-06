import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class Teste {

    
    public static void main(String[] args) {
    Queue<Integer> fila = new LinkedList<Integer>();

    fila.add(1);
    fila.add(2);
    fila.add(3); 
    
   System.out.println(fila.toString()); 
   System.out.println(fila.peek());
   System.out.println(fila.remove()); 

    // public static void main(String[] args) {
    // Queue<Integer> fila = new Fila<Integer>();

    // @Override
    // public int size(){
    //     throw new UnsupportedOperationException("Not supported yet");
    // }

    // Fila<Integer> fila = new Fila<Integer>();
    // fila.enfileira(1);
    // fila.enfileira(2);
    // fila.enfileira(3);        

    // System.out.println(fila.toString());
    // System.out.println(fila.desenfileira());
    // System.out.println(fila.toString());


    //     Stack<Integer> stack = new Stack<Integer>();

    // stack.push(1);
    // stack.push(2);
    // stack.push(3);  

    // System.out.println(stack);
    // System.out.println(stack.peek());
    // System.out.println(stack.pop());
    // System.out.println(stack);
    
    }
}
