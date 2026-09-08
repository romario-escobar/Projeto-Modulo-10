package exercicioComplementar;

public class Produto implements Comparable<Produto> {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    /**
     * Ordem natural por PREÇO — essencial aqui, porque as consultas de
     * subSet/headSet/tailSet desta missão são por faixa de preço.
     * Se a ordem natural fosse por nome, os "cortes" feitos pelo
     * TreeSet não corresponderiam a faixas de preço.
     */
    @Override
    public int compareTo(Produto outro) {
        return Double.compare(this.preco, outro.preco);
    }

    @Override
    public String toString() {
        return nome + " (R$ " + preco + ")";
    }
}