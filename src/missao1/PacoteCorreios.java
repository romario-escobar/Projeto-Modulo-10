package missao1;

public class PacoteCorreios implements Rastreavel {

    private String codigoRastreio; // Ex: BR123456789

    public PacoteCorreios(String codigoRastreio) {
        this.codigoRastreio = codigoRastreio;
    }

    @Override
    public String getStatusRastreio() {
        return "Correios - Objeto " + codigoRastreio + " em trânsito na unidade de distribuição.";
    }
}