package org.example.gerenciador;

import org.example.modelos.Filme;

// Classe principal contendo o método main para executar e testar o GerenciadorDeFilmes.
public class Main {
    public static void main(String[] args) {
        // Cria uma instância do GerenciadorDeFilmes para gerenciar a coleção de itens.
        GerenciadorDeFilmes gerenciador = new GerenciadorDeFilmes();

        // Cria um novo objeto Filme com título, ano de lançamento e gênero.
        Filme filme = new Filme("Matrix", 1999, "Ficção Científica");

        // Adiciona o filme criado à coleção de itens do gerenciador.
        gerenciador.adicionarItem(filme);

        // Serializa o objeto filme para uma string JSON usando o método do gerenciador.
        String json = gerenciador.serializarParaJSON(filme);
        // Exibe a string JSON resultante no console.
        System.out.println("Filme serializado: " + json);

        // Desserializa a string JSON de volta para um objeto Filme.
        Filme filmeDeserializado = gerenciador.deserializarDeJSON(json);
        // Exibe o título do filme desserializado para verificar a integridade dos dados.
        System.out.println("Filme deserializado: " + filmeDeserializado.getTitulo());
    }
}
