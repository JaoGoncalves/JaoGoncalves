
public class Main {

    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        // inserir
        Nodo novoNodo = new Nodo();
        Nodo nodo2 = new Nodo();
        Nodo nodo3 = new Nodo();

        novoNodo.setValor(5);
        lista.inserir(0, novoNodo);

        nodo2.setValor(10);
        lista.inserir(1, nodo2);

        nodo3.setValor(11);
        lista.inserir(2, nodo3);

        // System.out.println(lista.toString());
        // remover

        lista.remover(1);
        lista.remover(0);
        // System.out.println(lista.toString());

    }

}
