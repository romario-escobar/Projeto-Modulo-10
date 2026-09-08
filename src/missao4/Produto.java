package missao4;

public class Produto implements Comparable<Produto> {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    /**
     * Define a ordem natural do Produto: por ordem alfabética de nome.
     * Reutilizamos o compareTo() já implementado pela classe String.
     */
    @Override
    public int compareTo(Produto outro) {
        return this.nome.compareTo(outro.nome);
    }

    @Override
    public String toString() {
        return nome + " (R$ " + preco + ")";
    }
}