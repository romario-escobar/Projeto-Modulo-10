package exercicioComplementar;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Gerencia uma fila de pedidos de atendimento usando exclusivamente
 * o contrato da interface Queue: offer(), peek() e poll().
 *
 * Diferente de add()/remove()/element() (que lançam exceção em
 * situações-limite), offer()/poll()/peek() foram desenhados para
 * "falhar de forma silenciosa" (retornando false ou null), o que é
 * mais seguro em cenários onde a fila pode estar cheia ou vazia.
 */
public class FilaAtendimento {

    public static void demonstrar() {
        Queue<String> fila = new LinkedList<>();

        // offer(): insere no final da fila (equivalente a add(), mas sem lançar exceção)
        fila.offer("Pedido #2001");
        fila.offer("Pedido #2002");
        fila.offer("Pedido #2003");

        System.out.println("Fila atual: " + fila);

        // peek(): observa o próximo da fila SEM remover
        System.out.println("Próximo a ser atendido (peek): " + fila.peek());
        System.out.println("Fila continua igual após peek: " + fila);

        // poll(): remove e devolve o primeiro da fila
        String atendido = fila.poll();
        System.out.println("\nAtendendo (poll): " + atendido);
        System.out.println("Fila após o atendimento: " + fila);

        // Esvaziando a fila inteira com poll(), até ela ficar vazia
        System.out.println("\nAtendendo o restante da fila:");
        String proximo;
        while ((proximo = fila.poll()) != null) {
            System.out.println("Atendendo: " + proximo);
        }

        // poll() em fila vazia devolve null, em vez de lançar exceção
        System.out.println("Fila vazia? peek() agora retorna: " + fila.peek());
    }
}