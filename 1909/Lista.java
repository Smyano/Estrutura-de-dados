public class Lista {
    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();
 
        System.out.println("Tamanho da Lista = " + lista.getTamanho());
 
        lista.adiciona("Claudio");
        lista.adiciona ("Camila");
        lista.adiciona ("Miguel");
        lista.adiciona ("Elis");
 
 
        System.out.println(lista);
        System.out.println("Tamanho da Lista = " + lista.getTamanho());
        System.out.println("Inicio da lista = " + lista.getInicio().getElemento());
        System.out.println("Fim da Lista = " + lista.getFim().getElemento());
 
        lista.remover("Camila");

        System.out.println(lista);
        System.out.println("Tamanho da Lista = " + lista.getTamanho());
        System.out.println("Inicio da lista = " + lista.getInicio().getElemento());
        System.out.println("Fim da Lista = " + lista.getFim().getElemento());
 
        System.out.println("Elmento na posicao 2 = " + lista.get(2).getElemento());
    }
}