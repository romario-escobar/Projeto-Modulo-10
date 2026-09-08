package exercicioComplementar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Demonstra métodos utilitários ESTÁTICOS da classe Collections
 * (não confundir com a interface Collection), que operam sobre
 * listas já existentes.
 */
public class UtilitariosEstoque {

    public static void demonstrar() {
        List<Produto> estoque = new ArrayList<>();
        estoque.add(new Produto("Mouse", 50.0));
        estoque.add(new Produto("Teclado", 150.0));
        estoque.add(new Produto("Cadeira", 500.0));
        estoque.add(new Produto("Monitor", 900.0));

        System.out.println("Estoque original: " + estoque);

        // Collections.shuffle: embaralha a ordem dos elementos aleatoriamente
        Collections.shuffle(estoque);
        System.out.println("Estoque embaralhado (shuffle): " + estoque);

        // Collections.reverse: inverte a ordem atual da lista
        Collections.reverse(estoque);
        System.out.println("Estoque invertido (reverse): " + estoque);

        // Collections.min / max: usam o compareTo() do Produto (ordena por preço)
        Produto maisBarato = Collections.min(estoque);
        Produto maisCaro = Collections.max(estoque);
        System.out.println("Produto mais barato (min): " + maisBarato);
        System.out.println("Produto mais caro (max): " + maisCaro);

        // Collections.synchronizedList: "embrulha" um ArrayList comum
        // (que não é thread-safe) em uma versão sincronizada, sem
        // precisar trocar a implementação para Vector.
        List<Produto> estoqueSincronizado = Collections.synchronizedList(estoque);
        System.out.println("\nLista agora está encapsulada como thread-safe.");
        System.out.println("Conteúdo (via wrapper sincronizado): " + estoqueSincronizado);

        /*
         * Importante: ao usar Collections.synchronizedList(), o acesso
         * simples (add, get, size) já fica sincronizado automaticamente.
         * Porém, se for necessário ITERAR sobre a lista (for-each) em
         * um ambiente com múltiplas threads, é recomendado sincronizar
         * manualmente o bloco de iteração com "synchronized (lista) { ... }",
         * pois o Iterator em si não é protegido pelo wrapper.
         */
    }
}