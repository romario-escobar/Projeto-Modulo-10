package missao2;

import java.util.Vector;

/**
 * Demonstra o registrador de eventos usando Vector<String>,
 * ilustrando o conceito de classe synchronized e a diferença
 * de segurança em ambientes concorrentes (multithread) frente
 * ao ArrayList.
 */
public class RegistradorLogs {

    // Vector é internamente sincronizado: seus métodos (add, get, remove...)
    // são "synchronized", ou seja, apenas uma thread por vez pode
    // executá-los sobre a mesma instância.
    private static Vector<String> logs = new Vector<>();

    public static void demonstrar() throws InterruptedException {

        // Simulamos duas "threads de auditoria" escrevendo logs ao mesmo tempo.
        Runnable tarefaThreadA = () -> {
            for (int i = 1; i <= 5; i++) {
                logs.add("[Thread-A] Evento de auditoria " + i);
            }
        };

        Runnable tarefaThreadB = () -> {
            for (int i = 1; i <= 5; i++) {
                logs.add("[Thread-B] Evento de auditoria " + i);
            }
        };

        Thread threadA = new Thread(tarefaThreadA);
        Thread threadB = new Thread(tarefaThreadB);

        threadA.start();
        threadB.start();

        // Espera as duas threads terminarem antes de continuar
        threadA.join();
        threadB.join();

        System.out.println("Total de logs registrados: " + logs.size());
        for (String log : logs) {
            System.out.println(log);
        }

        /*
         * Diferença de segurança em ambiente concorrente: Vector x ArrayList
         *
         * Vector: seus métodos são "synchronized". Isso significa que,
         * quando a Thread-A está executando logs.add(...), a JVM bloqueia
         * o acesso a esse método para qualquer outra thread até a
         * primeira operação terminar. Isso garante que o array interno
         * do Vector nunca fique em um estado inconsistente, mesmo com
         * várias threads escrevendo ao mesmo tempo. Note que, mesmo
         * assim, o total final (10 logs) é sempre correto e nenhum
         * dado é perdido.
         *
         * ArrayList: NÃO é sincronizado. Se substituíssemos o Vector
         * por um ArrayList neste mesmo cenário com duas threads,
         * poderíamos ter comportamentos imprevisíveis: elementos
         * sobrescritos, exceções como ArrayIndexOutOfBoundsException,
         * ou até um tamanho final incorreto (menor que 10), porque
         * duas threads poderiam tentar redimensionar o array interno
         * ou escrever na mesma posição ao mesmo tempo (condição de corrida).
         *
         * O custo do Vector: essa segurança tem um preço de performance.
         * Mesmo em código single-thread, toda chamada de método paga o
         * custo de sincronização, tornando o Vector mais lento que o
         * ArrayList quando não há concorrência real.
         */
    }
}