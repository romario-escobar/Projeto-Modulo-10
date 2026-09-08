package missao1;

public class CentralRastreamento {

    /**
     * Recebe QUALQUER objeto (Object) e verifica em tempo de execução
     * se ele "realiza" a interface Rastreavel.
     */
    public static void inspecionarItem(Object item) {
        if (item instanceof Rastreavel) {
            // Casting explícito: dizemos ao compilador para tratar
            // "item" como Rastreavel, e não mais apenas como Object.
            Rastreavel itemRastreavel = (Rastreavel) item;
            System.out.println(itemRastreavel.getStatusRastreio());
        } else {
            System.out.println("Item não é passível de rastreamento: " + item);
        }
    }
}