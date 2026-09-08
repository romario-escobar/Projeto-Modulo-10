package missao4;

import java.util.Comparator;

/**
 * Comparator externo à classe Produto, permitindo uma ordenação
 * alternativa (por preço) sem alterar a ordem natural definida
 * em Produto.compareTo() (que ordena por nome).
 */
public class ComparadorPorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        // Double.compare já devolve negativo, zero ou positivo
        // seguindo a mesma regra de compareTo/compare.
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}