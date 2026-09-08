package missao5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // Map indexando produtos por código alfanumérico (chave -> valor)
        Map<String, Produto> mapaEstoque = new HashMap<>();

        // Cadastro dos produtos com put(chave, valor)
        mapaEstoque.put("COD001", new Produto("Teclado Mecânico", 250.0));
        mapaEstoque.put("COD002", new Produto("Mouse Sem Fio", 90.0));
        mapaEstoque.put("COD003", new Produto("Monitor 24\"", 899.90));

        // 3. Exibindo todas as chaves registradas (retorno do tipo Set)
        Set<String> codigos = mapaEstoque.keySet();
        System.out.println("Códigos cadastrados: " + codigos);

        // 4. Exibindo todos os produtos armazenados (retorno do tipo Collection)
        Collection<Produto> produtos = mapaEstoque.values();
        System.out.println("Produtos em estoque: " + produtos);

        // Consulta instantânea via leitor de código de barras (simulado por teclado)
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite o código do produto para consultar (ex: COD001):");
        String codigoDigitado = scanner.nextLine();

        // Acesso direto via get(chave) -> O(1) em média, SEM usar laço de repetição
        Produto produtoEncontrado = mapaEstoque.get(codigoDigitado);

        if (produtoEncontrado != null) {
            System.out.println("Produto encontrado: " + produtoEncontrado);
        } else {
            System.out.println("Nenhum produto cadastrado com o código: " + codigoDigitado);
        }

        scanner.close();
    }
}