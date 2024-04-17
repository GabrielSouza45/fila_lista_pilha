public class Lista<T> extends EstruturaEstatica<T> {

    public Lista(int tamanho){
        super(tamanho);
    }

    public Lista(){
        super();
    }

    public boolean adiciona(T elemento){
        return super.adiciona(elemento);
    }

    public boolean adiciona(T elemento, int posicao){
        return super.adiciona(posicao, elemento);
    }

    public void remove(int posicao){
        super.remove(posicao);
    }

    public T busca(int posicao){
        return super.getElementos()[posicao-1];
    }

    public int busca(T elemento){
        for (int i=0; i<tamanho()-1; i++){
            if (getElementos()[i].equals(elemento)){
                return i+1;
            }
        }
        return -1;
    }
}
