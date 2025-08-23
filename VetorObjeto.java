import java.util.Arrays;

public class VetorObjeto {
    

    public Object[] elementos;
    public int tamanho;

    public VetorObjeto(int capacidade){
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    public void adiciona(Object elemento)throws Exception{
        this.aumentaCapacidade();
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
    }

    public int tamanho(){
        return this.tamanho;
    }

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");
        // Busca a primeira informaÃ§Ã£o ate a penultima
        for(int i=0; i<this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }
        // busc a ultima informaÃ§Ã£o
        if(this.tamanho> 0){
            s.append(this.elementos[this.tamanho-1]);
        }
        s.append("]");
        return s.toString();
    }

    public Object busca(int posicao)throws Exception{
        if(posicao >=0 && posicao < tamanho){
            return elementos[posicao];
        } else {
            throw new Exception("PosiÃ§Ã£o InvÃ¡lida");
        }
    }

    public int busca1 (Object elemento){
        for (int i=0; i < tamanho; i++){
            if(elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public boolean adicionaInicio(int posicao, Object elemento) throws Exception{
        this.aumentaCapacidade();
        if (posicao >=0 && posicao < tamanho){
            for (int i=this.tamanho-1; i >= posicao; i--){
                this.elementos[i+1] = this.elementos[i];
            }
            this.elementos[posicao] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("PosiÃ§Ã£o InvÃ¡lida");
        }
        return true;
    }

    private void aumentaCapacidade(){
        if (this.tamanho == this.elementos.length){
            Object[] elementosNovos = new Object[this.elementos.length * 2];
            for (int i=0; i < this.elementos.length;i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public void remover(int posicao) throws Exception{
        if(posicao >+ 0  && posicao < tamanho){
            for(int i = posicao; i < this.tamanho -1; i ++){
                this.elementos[i] = this.elementos[i+1];
            }
            this.elementos[tamanho] = null;
            this.tamanho--;
        } else {
            throw new Exception ("posição valida");
        }
    }

}


