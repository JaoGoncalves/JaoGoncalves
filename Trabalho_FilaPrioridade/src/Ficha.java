public class Ficha {
    private int numero;
    private char tipo;

    // criando construtor
    public Ficha(int numero, char tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    // gets e sets
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Ficha [numero=" + numero + ", tipo=" + tipo + "]";
    }

}
