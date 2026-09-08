package exercicioComplementar;

public class Main {
    public static void main(String[] args) {

        System.out.println("========== 1. Consulta de Catálogo por Faixa de Preço (SortedSet) ==========");
        ConsultaCatalogoPrecos.demonstrar();

        System.out.println("\n========== 2. Fila de Atendimento (Queue) ==========");
        FilaAtendimento.demonstrar();

        System.out.println("\n========== 3. Utilitários de Estoque (Collections) ==========");
        UtilitariosEstoque.demonstrar();

        System.out.println("\n========== 4. Sessões Ativas (Hashtable + Enumeration) ==========");
        SessaoAtiva.demonstrar();
    }
}