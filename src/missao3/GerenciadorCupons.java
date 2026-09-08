package missao3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GerenciadorCupons {

    public static void demonstrar() {
        Set<CupomDesconto> conjuntoCupons = new HashSet<>();

        // Tentando inserir cupons, incluindo um com código repetido
        boolean r1 = conjuntoCupons.add(new CupomDesconto("PROMO10", 10.0));
        boolean r2 = conjuntoCupons.add(new CupomDesconto("PROMO20", 20.0));
        boolean r3 = conjuntoCupons.add(new CupomDesconto("PROMO10", 15.0)); // código repetido!
        boolean r4 = conjuntoCupons.add(new CupomDesconto("EXPIRADO", 0.0));

        System.out.println("Adicionou PROMO10 (1ª vez)? " + r1);   // true
        System.out.println("Adicionou PROMO20? " + r2);            // true
        System.out.println("Adicionou PROMO10 (2ª vez, duplicado)? " + r3); // false
        System.out.println("Adicionou EXPIRADO? " + r4);           // true

        System.out.println("\nCupons antes da limpeza: " + conjuntoCupons);
        System.out.println("Total: " + conjuntoCupons.size());

        removerCuponsZerados(conjuntoCupons);

        System.out.println("\nCupons depois da limpeza: " + conjuntoCupons);
        System.out.println("Total: " + conjuntoCupons.size());
    }

    /**
     * Remove, de forma segura, todos os cupons com porcentagem igual a zero.
     * Usa Iterator explicitamente para evitar ConcurrentModificationException,
     * que ocorreria se tentássemos usar conjuntoCupons.remove(...) dentro
     * de um for-each comum.
     */
    private static void removerCuponsZerados(Set<CupomDesconto> conjuntoCupons) {
        Iterator<CupomDesconto> it = conjuntoCupons.iterator();
        while (it.hasNext()) {
            CupomDesconto cupom = it.next();
            if (cupom.getPorcentagem() == 0) {
                it.remove(); // remoção segura através do próprio iterador
            }
        }
    }
}