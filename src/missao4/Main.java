package missao4;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        // Inserindo produtos fora de ordem propositalmente
        Produto p1 = new Produto("Teclado", 150.0);
        Produto p2 = new Produto("Monitor", 900.0);
        Produto p3 = new Produto("Cadeira", 500.0);
        Produto p4 = new Produto("Mouse", 80.0);

        System.out.println("=== Catálogo com ordem NATURAL (Comparable -> nome) ===");
        TreeSet<Produto> catalogoNatural = new TreeSet<>();
        catalogoNatural.add(p1);
        catalogoNatural.add(p2);
        catalogoNatural.add(p3);
        catalogoNatural.add(p4);

        // Mesmo tendo sido inseridos fora de ordem, o TreeSet já
        // devolve os elementos ordenados alfabeticamente (O(log n) por inserção).
        for (Produto p : catalogoNatural) {
            System.out.println(p);
        }

        System.out.println("\n=== Catálogo com ordem CUSTOMIZADA (Comparator -> preço) ===");
        TreeSet<Produto> catalogoPreco = new TreeSet<>(new ComparadorPorPreco());
        catalogoPreco.add(p1);
        catalogoPreco.add(p2);
        catalogoPreco.add(p3);
        catalogoPreco.add(p4);

        for (Produto p : catalogoPreco) {
            System.out.println(p);
        }
    }
}