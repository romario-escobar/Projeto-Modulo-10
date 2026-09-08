package missao2;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("=== Parte 1: Fila de Pedidos (List / LinkedList) ===");
        FilaPedidos.demonstrar();

        System.out.println();
        System.out.println("=== Parte 2: Registrador de Logs (Vector / synchronized) ===");
        RegistradorLogs.demonstrar();
    }
}