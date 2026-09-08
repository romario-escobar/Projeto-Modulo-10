package missao1;

public class CargaTransportadora implements Rastreavel {

    private String placaVeiculo;
    private String cidadeAtual;

    public CargaTransportadora(String placaVeiculo, String cidadeAtual) {
        this.placaVeiculo = placaVeiculo;
        this.cidadeAtual = cidadeAtual;
    }

    @Override
    public String getStatusRastreio() {
        return "Transportadora - Veículo " + placaVeiculo + " passando por " + cidadeAtual + ".";
    }
}