package missao1;

public class EntregaExpressa implements Rastreavel {

    private String nomeEntregador;
    private int minutosParaChegada;

    public EntregaExpressa(String nomeEntregador, int minutosParaChegada) {
        this.nomeEntregador = nomeEntregador;
        this.minutosParaChegada = minutosParaChegada;
    }

    @Override
    public String getStatusRastreio() {
        return "Entrega Expressa - " + nomeEntregador + " chegará em aproximadamente "
                + minutosParaChegada + " minutos.";
    }
}