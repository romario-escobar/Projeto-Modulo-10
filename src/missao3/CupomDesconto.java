package missao3;

import java.util.Objects;

public class CupomDesconto {

    private String codigo;
    private double porcentagem;

    public CupomDesconto(String codigo, double porcentagem) {
        this.codigo = codigo;
        this.porcentagem = porcentagem;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPorcentagem() {
        return porcentagem;
    }

    /**
     * Dois cupons são considerados iguais se tiverem o mesmo código,
     * independentemente da porcentagem ou de serem objetos distintos
     * na memória.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;                 // mesmo objeto na memória
        if (o == null || getClass() != o.getClass()) return false;
        CupomDesconto outro = (CupomDesconto) o;
        return Objects.equals(this.codigo, outro.codigo);
    }

    /**
     * O hashCode DEVE ser consistente com equals(): se dois objetos são
     * iguais por equals(), eles precisam ter o mesmo hashCode(). Por isso
     * baseamos o cálculo exclusivamente no campo "codigo", assim como
     * fizemos no equals().
     */
    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "Cupom{" + codigo + ", " + porcentagem + "%}";
    }
}