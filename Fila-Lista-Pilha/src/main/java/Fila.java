public class Fila<T> extends EstruturaEstatica<T>{

    Fila(){
        super();
    }
    Fila(int qtd){
        super(qtd);
    }

    void enfileira(T elemento){
        super.adiciona(elemento);
    }

    T espiar(){
        if (estaVazia())
            return null;
        else
            return getElementos()[0];
    }

    T desenfileirar(){
        if (estaVazia())
            return null;
        else {
            final int POS = 1;
            T elemento = getElementos()[POS];
            super.remove(POS);
            return elemento;

        }

    }

}
