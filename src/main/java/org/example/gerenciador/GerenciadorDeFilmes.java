package org.example.gerenciador;

import org.example.modelos.Filme;
import org.example.modelos.ItemAudioVisual;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

// Classe GerenciadorDeFilmes responsável por gerenciar uma coleção de itens audiovisuais.
public class GerenciadorDeFilmes {
    // Lista de itens audiovisuais (Filmes, Séries, Documentários, etc.)
    private List<ItemAudioVisual> colecao;

    // Construtor da classe que inicializa a coleção como uma nova ArrayList.
    public GerenciadorDeFilmes() {
        this.colecao = new ArrayList<>();
    }

    // Método para adicionar um item audiovisual à coleção.
    public void adicionarItem(ItemAudioVisual item) {
        colecao.add(item);
    }

    // Método para remover um item da coleção com base no título.
    // Remove o item se o título informado corresponder (ignorando maiúsculas/minúsculas).
    public void removerItem(String titulo) {
        colecao.removeIf(item -> item.getTitulo().equalsIgnoreCase(titulo));
    }

    // Método para listar todos os itens na coleção.
    // Retorna uma nova lista com todos os itens para evitar alterações externas.
    public List<ItemAudioVisual> listarItens() {
        return new ArrayList<>(colecao);
    }

    // Método para buscar um item na coleção com base no título.
    // Retorna o primeiro item encontrado com o título especificado ou null se não encontrar.
    public ItemAudioVisual buscarItemPorTitulo(String titulo) {
        return colecao.stream()
                .filter(item -> item.getTitulo().equalsIgnoreCase(titulo))
                .findFirst()
                .orElse(null);
    }

    // Método para serializar um objeto Filme para JSON usando a biblioteca Gson.
    // Retorna uma string JSON representando o objeto Filme.
    public String serializarParaJSON(Filme filme) {
        Gson gson = new Gson();
        return gson.toJson(filme);
    }

    // Método para desserializar uma string JSON em um objeto Filme usando Gson.
    // Recebe uma string JSON e retorna um objeto Filme correspondente.
    public Filme deserializarDeJSON(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, Filme.class);
    }
}
