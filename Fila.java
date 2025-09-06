public class Fila<T> extends Estrutura<T> {

    public Fila(int capacidade) {
        super(capacidade);
    }

    public Fila() {
        super();
    }

    public void enfileira(T elemento) {
        this.adiciona(elemento);
    }

    public T espiar() {
        if (this.estaVazia()) {
            return null;
        }
        return this.elementos[0];
    }

    public T desenfileira(){
        if (this.estaVazia()){
            return null;
        } final int POS = 0;
        T elementosASerRemovido = this.elementos[POS];
        this.remove(POS);
        return elementosASerRemovido;
    } 

}
