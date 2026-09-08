package missao2;

import java.util.LinkedList;
import java.util.List;

/**
 * Demonstra o uso da fila de pedidos pendentes no checkout,
 * utilizando a interface List associada a uma instância de LinkedList.
 */
public class FilaPedidos {

    public static void demonstrar() {
        // Declaramos pela interface (List), instanciamos pela implementação (LinkedList).
        List<String> fila = new LinkedList<>();

        // Inserção nas extremidades
        fila.add("Pedido #1001");       // vai para o final
        fila.add("Pedido #1002");       // vai para o final
        fila.add(0, "Pedido #1000");    // insere no início (posição 0)

        System.out.println("Fila de pedidos: " + fila);

        // Recuperação ordenada (percorrendo do início ao fim)
        System.out.println("Processando pedidos em ordem:");
        for (String pedido : fila) {
            System.out.println("-> Processando: " + pedido);
        }

        /*
         * Por que LinkedList é mais eficiente que ArrayList para
         * inserções frequentes no início da lista?
         *
         * O ArrayList é baseado em um array interno. Ao inserir um
         * elemento na posição 0, o Java precisa deslocar TODOS os
         * elementos existentes uma posição à frente para abrir espaço.
         * Esse deslocamento tem custo O(n), ou seja, quanto maior a
         * lista, mais lenta fica cada inserção no início.
         *
         * A LinkedList, por sua vez, é uma lista duplamente encadeada:
         * cada elemento (nó) guarda apenas uma referência para o
         * próximo e para o anterior. Inserir no início significa
         * apenas criar um novo nó e redirecionar duas referências
         * (o "next" do novo nó e o ponteiro de "primeiro" da lista).
         * Isso tem custo O(1), constante, independente do tamanho
         * da lista. Por isso, para filas com muitas inserções no
         * início (ou no fim), LinkedList é a escolha mais eficiente.
         */
    }
}