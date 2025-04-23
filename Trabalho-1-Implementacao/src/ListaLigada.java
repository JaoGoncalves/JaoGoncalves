public class ListaLigada {
    private Nodo lista;
    private int tamanho;

    // criando o construtor
    public ListaLigada() {
        this.lista = null;
        this.tamanho = 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void inserir(int posicao, Nodo novoNodo) {
        // caso a posiçao seja maior que o tamanho da lista,entra na condição
        // ou se a posicao for um numero negativo
        if (posicao < 0 || posicao > tamanho) {
            System.out.println("Posição inválida.");
            return;
        }

        if (posicao == 0) {
            novoNodo.setProx(lista);
            lista = novoNodo;
        } else {
            Nodo atual = lista;
            for (int i = 0; i < posicao - 1; i++) {
                atual = atual.getProx();
            }
            novoNodo.setProx(atual.getProx());
            atual.setProx(novoNodo);
        }

        this.tamanho++;
    }

    public void remover(int posicao) {
        if (posicao < 0 || posicao >= tamanho || lista == null) {
            System.out.println("Posição inválida ou lista vazia.");
            return;
        }

        if (posicao == 0) {
            lista = lista.getProx();
        } else {
            Nodo aux = lista;
            for (int i = 0; i < posicao - 1; i++) {
                aux = aux.getProx();
            }
            aux.setProx(aux.getProx().getProx());
        }

        this.tamanho--;
    }

    @Override
    public String toString() {
        return "ListaLigada [inicio=" + lista + ", tamanho=" + tamanho + "]";
    }

}
