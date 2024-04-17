public class Teste {

    public static void main(String[] args) {


        Lista<String> lista = new Lista<>();

        System.out.println("Vazia? " + lista.estaVazia());
        lista.adiciona("Gabriel");
        lista.adiciona("Debora");
        lista.adiciona("Antonio");
        lista.adiciona("Zacarias");

        System.out.println(lista);
        System.out.println(lista.tamanho());

        lista.remove(2);

        System.out.println(lista);
        System.out.println(lista.tamanho());

        System.out.println("Vazia? " + lista.estaVazia());

        System.out.println("Antonio, Pos: "+ lista.busca("Antonio"));
        System.out.println("Pos 1: "+ lista.busca(1));



        System.out.println("\n  PILHA:");
        Pilha<Integer> pilha = new Pilha<>();

        System.out.println("Vazia? " + pilha.estaVazia());
        for (int i = 1; i <= 10; i++) {
            pilha.empilha(i);
        }

        System.out.println(pilha);
        System.out.println(pilha.tamanho());
        System.out.println("Vazia? " + pilha.estaVazia());

        System.out.println("Topo: " + pilha.topo());

        pilha.desempilha();
        System.out.println(pilha);


        System.out.println("\n  FILA:");


        Fila<Integer> fila = new Fila<>();
        for (int i =1; i<=10; i++){
            fila.adiciona(i);
        }
        System.out.println(fila);

        System.out.println(fila.espiar());

        System.out.println(fila.desenfileirar());
        System.out.println(fila);
    }

}
