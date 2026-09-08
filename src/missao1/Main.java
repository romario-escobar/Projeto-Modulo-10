package missao1;

public class Main {
    public static void main(String[] args) {

        PacoteCorreios pacote = new PacoteCorreios("BR123456789");
        CargaTransportadora carga = new CargaTransportadora("ABC1D23", "Niterói-RJ");
        EntregaExpressa expressa = new EntregaExpressa("João", 15);

        // Um objeto que NÃO implementa Rastreavel, para testar o caminho "else"
        String objetoQualquer = "Isso não é rastreável";

        System.out.println("--- Testando a Central de Rastreamento ---");
        CentralRastreamento.inspecionarItem(pacote);
        CentralRastreamento.inspecionarItem(carga);
        CentralRastreamento.inspecionarItem(expressa);
        CentralRastreamento.inspecionarItem(objetoQualquer);
    }
}