public class Pilha<T> extends EstruturaEstatica<T> {

    Pilha(int pos) {
        super(pos);
    }

    Pilha() {

    }

    public void empilha(T elemento) {
        super.adiciona(elemento);
    }

    public T topo() {
        if (estaVazia()) {
            return null;
        } else {
            return this.getElementos()[tamanho() - 1];
        }
    }

    public T desempilha() {
        if (estaVazia())
            return null;
        else {
            T elemento =  this.getElementos()[tamanho()-1];
            setTamanho(this.tamanho()-1);
            return elemento;
        }
    }

}
