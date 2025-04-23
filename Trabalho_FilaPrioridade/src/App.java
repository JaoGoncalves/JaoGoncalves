public class App {
    public static void main(String[] args) throws Exception {
        FilaTriagem fila = new FilaTriagem();

        fila.adicionarFicha(new Ficha(1, 'N'));
        fila.adicionarFicha(new Ficha(1, 'U'));
        fila.adicionarFicha(new Ficha(2, 'U'));
        fila.adicionarFicha(new Ficha(2, 'N'));
        fila.adicionarFicha(new Ficha(3, 'U'));
        fila.adicionarFicha(new Ficha(3, 'N'));
        // fila.adicionarFicha(new Ficha(4, 'N'));

        fila.imprimirFila();

    }
}
