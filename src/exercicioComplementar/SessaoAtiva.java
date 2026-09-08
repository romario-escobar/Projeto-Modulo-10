package exercicioComplementar;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Simula uma tabela de configurações/sessões ativas usando Hashtable,
 * a estrutura "avó" do HashMap. Assim como Vector, o Hashtable é
 * sincronizado por padrão (thread-safe), mas é considerado uma
 * classe legada (existe desde o Java 1.0).
 *
 * Para percorrê-la, usamos Enumeration — a forma clássica de
 * navegação anterior ao Iterator, sem suporte a remoção segura
 * durante o percurso (não existe um "remove()" no Enumeration).
 */
public class SessaoAtiva {

    public static void demonstrar() {
        Hashtable<String, String> sessoesAtivas = new Hashtable<>();

        sessoesAtivas.put("SESSAO_A1B2", "cliente=Romario; status=ativo");
        sessoesAtivas.put("SESSAO_C3D4", "cliente=Ana; status=ativo");
        sessoesAtivas.put("SESSAO_E5F6", "cliente=Carlos; status=inativo");

        System.out.println("Total de sessões registradas: " + sessoesAtivas.size());

        // Percorrendo as CHAVES com Enumeration
        System.out.println("\nChaves das sessões (Enumeration):");
        Enumeration<String> chaves = sessoesAtivas.keys();
        while (chaves.hasMoreElements()) {
            String chave = chaves.nextElement();
            System.out.println("- " + chave);
        }

        // Percorrendo os VALORES com Enumeration
        System.out.println("\nDetalhes das sessões (Enumeration):");
        Enumeration<String> valores = sessoesAtivas.elements();
        while (valores.hasMoreElements()) {
            String valor = valores.nextElement();
            System.out.println("- " + valor);
        }

        // Uma observação: o Hashtable, diferente do HashMap, NÃO aceita
        // chaves ou valores nulos — lançaria NullPointerException.
    }
}