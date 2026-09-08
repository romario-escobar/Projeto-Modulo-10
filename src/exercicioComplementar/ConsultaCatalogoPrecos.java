package exercicioComplementar;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Demonstra consultas por faixa de preço usando os métodos de
 * "recorte" do SortedSet: subSet, headSet e tailSet.
 */
public class ConsultaCatalogoPrecos {

    public static void demonstrar() {
        TreeSet<Produto> catalogo = new TreeSet<>();
        catalogo.add(new Produto("Mouse", 50.0));
        catalogo.add(new Produto("Teclado", 150.0));
        catalogo.add(new Produto("Cadeira", 500.0));
        catalogo.add(new Produto("Monitor", 900.0));
        catalogo.add(new Produto("Notebook", 3500.0));

        System.out.println("Catálogo completo (ordenado por preço): " + catalogo);

        // headSet(x): tudo ANTES de x (exclusive) -> um "teto" de preço.
        // Aqui usamos um Produto "de busca", só com o preço, apenas
        // para servir de referência de comparação (compareTo usa só o preço).
        SortedSet<Produto> ateQuatrocentos = catalogo.headSet(new Produto("", 400.0));
        System.out.println("\nProdutos até R$ 400,00 (headSet): " + ateQuatrocentos);

        // tailSet(x): tudo A PARTIR de x (inclusive) -> um "piso" de preço.
        SortedSet<Produto> deQuinhentosParaCima = catalogo.tailSet(new Produto("", 500.0));
        System.out.println("Produtos a partir de R$ 500,00 (tailSet): " + deQuinhentosParaCima);

        // subSet(x, y): tudo ENTRE x (inclusive) e y (exclusive) -> uma faixa.
        SortedSet<Produto> faixaIntermediaria =
                catalogo.subSet(new Produto("", 100.0), new Produto("", 1000.0));
        System.out.println("Produtos entre R$ 100,00 e R$ 1000,00 (subSet): " + faixaIntermediaria);
    }
}