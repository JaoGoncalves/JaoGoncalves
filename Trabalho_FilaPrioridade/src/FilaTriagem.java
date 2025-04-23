import java.util.ArrayList;

public class FilaTriagem {
    private ArrayList<Ficha> fila;

    public FilaTriagem() {
        this.fila = new ArrayList<>();
    }

    // metodo adiciona ficha
    public void adicionarFicha(Ficha ficha) {
        if (ficha.getTipo() == 'N') { // Atendimento normal, vai para o final da fila
            fila.add(ficha);
        } else if (ficha.getTipo() == 'U') {
            int i = 0;
            while (i < fila.size()) { // Ira percorrer a lista, O(N)
                Ficha atual = fila.get(i);
                // aplica a ordem de prioridade, quem chega primeiro é do tipo U vai ao inicio
                if (atual.getTipo() == 'N' || (atual.getTipo() == 'U' && atual.getNumero() > ficha.getNumero())) {
                    break;
                }
                i++;
            }
            fila.add(i, ficha);
        } else {
            System.out.println("Tipo de ficha inválido. Use 'U' para urgente e 'N' para normal).");
        }

    }

    // metodo imprimir filha
    public void imprimirFila() {
        System.out.print("Fila de atendimento:");
        for (Ficha ficha : fila) {
            System.out.print(ficha);
        }
    }
}
