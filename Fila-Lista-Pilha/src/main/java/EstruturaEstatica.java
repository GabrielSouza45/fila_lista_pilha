import java.util.Arrays;

public class EstruturaEstatica<T> {

    private T[] elementos;
    private int tamanho;

    public T[] getElementos() {
        return elementos;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public EstruturaEstatica(int tamanho){
        this.elementos = (T[]) new Object[tamanho];
        this.tamanho = 0;
    }

    public EstruturaEstatica(){
        this(10);
    }

    public boolean adiciona(T elemento) {
        this.aumentaCapacidade();
        if (tamanho < elementos.length) {
            this.elementos[tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public boolean adiciona(int posicao, T elemento){
        this.aumentaCapacidade();
        if (!(posicao >= 0 && posicao < elementos.length)){
            throw new IllegalArgumentException("Posição inválida!");
        }
        for (int i=tamanho-1; i<=posicao; i--){
            elementos[i+1] = elementos[i];
        }
        elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }

    public void remove(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida!");
        }
        for (int i=posicao-1; i<tamanho-1; i++){
            elementos[i] = elementos[i+1];
        }
        this.tamanho--;
    }

    public void aumentaCapacidade(){
        if (tamanho == elementos.length){
            T[] novosElementos = (T[]) new Object[elementos.length*2];
            for (int i=0; i<this.elementos.length; i++){
                novosElementos[i] = elementos[i];
            }
            this.elementos = novosElementos;
        }
    }

    public boolean estaVazia(){
        return this.tamanho==0;
    }

    public int tamanho(){
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append("[");
        for (int i=0; i<this.tamanho-1; i++) {
            b.append(this.elementos[i]);
            b.append(", ");
        }

        if (this.tamanho>0){
            b.append(this.elementos[this.tamanho-1]);
        }

        b.append("]");

        return b.toString();

    }
}
