# Módulo 10 — Coleções e Arquitetura em Java

Projeto Integrador desenvolvido para a disciplina de **Programação Orientada a Objetos**, com foco no framework de coleções (`java.util`), contratos de interface e tipagem estrita da JVM.

**Contexto:** simulação de módulos centrais de um **Sistema de Gestão Logística e E-Commerce**.

## 📦 Estrutura do projeto

```
Modulo10/
└── src/
    ├── missao1/   Interfaces, instanceof e Casting
    ├── missao2/   List, LinkedList e Vector
    ├── missao3/   Set, HashSet e Iterator
    ├── missao4/   TreeSet, Comparable e Comparator
    └── missao5/   Map e HashMap
```

Cada missão é um pacote Java independente, com sua própria classe `Main` para execução e teste.

## 🚀 Missões

### Missão 1 — Contratos de Serviço e Validação de Tipos
Rastreamento de pacotes de diferentes modalidades logísticas (Correios, Transportadora, Entrega Expressa) através de uma interface comum `Rastreavel`, com verificação de tipo via `instanceof` e casting explícito.

**Conceitos:** Interface e Realização · `instanceof` · Casting

### Missão 2 — Filas de Processamento, Listas e Concorrência
Gerenciamento de uma fila de pedidos com `LinkedList` e um registrador de logs de auditoria com `Vector`, demonstrando segurança em ambientes multithread.

**Conceitos:** `Collection` · `List` · `LinkedList` · `Vector` · `synchronized`

### Missão 3 — Prevenção de Duplicidades e Navegação Segura
Cadastro de cupons promocionais sem códigos repetidos, usando `HashSet` com `equals()`/`hashCode()` customizados, e remoção segura de elementos com `Iterator`.

**Conceitos:** `Set` · `HashSet` · `equals()`/`hashCode()` · Padrão `Iterator`

### Missão 4 — Classificação Automática e Algoritmos de Ordenação
Catálogo de produtos ordenado automaticamente por `TreeSet`, comparando a ordem natural (`Comparable`, por nome) com uma ordem customizada (`Comparator`, por preço).

**Conceitos:** `SortedSet` · `TreeSet` · `Comparable` · `Comparator`

### Missão 5 — Acesso Direto O(1) e Indexação por Chave
Módulo de PDV (Ponto de Venda) com consulta instantânea de produtos via código de barras, usando `HashMap` para acesso direto sem laços de repetição.

**Conceitos:** `Map` · `HashMap` · `keySet()` · `values()`

## ▶️ Como executar

Cada missão pode ser executada de forma independente, rodando a classe `Main` correspondente:

```bash
# Exemplo: rodando a Missão 1
cd src
javac missao1/*.java
java missao1.Main
```

Repita o processo trocando `missao1` pela missão desejada (`missao2`, `missao3`, `missao4` ou `missao5`).

> A Missão 5 espera uma entrada via teclado (código do produto) — execute pelo terminal para digitar a consulta.

## 🛠️ Tecnologias

- Java (JDK 17+)
- Coleções do pacote `java.util` (`List`, `Set`, `Map` e suas implementações)

## 📚 Sobre

Projeto desenvolvido como prática do Módulo 10 — Tópicos em Coleções, aplicando os principais contratos e estruturas de dados do Java em um cenário simulado de e-commerce e logística.