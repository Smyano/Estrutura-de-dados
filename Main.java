public class Main {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<Integer>();

        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);

        System.out.println(fila.espiar());

        if(fila.espiar() == null){
            System.out.println("nnn");
        }else{
            System.out.println("fsdfsd" + fila.espiar());
        }


    } 
}