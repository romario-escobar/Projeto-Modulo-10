package missao1;

/**
 * Contrato (interface) que define o comportamento de rastreamento.
 * Qualquer classe que "realizar" esta interface é obrigada a
 * implementar o método getStatusRastreio().
 */
public interface Rastreavel {
    String getStatusRastreio();
}