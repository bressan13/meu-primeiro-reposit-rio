package org.example.modelos;

// A classe Filme representa um filme e implementa a interface ItemAudioVisual.
public class Filme implements ItemAudioVisual {
    // Atributos básicos de um filme: título, ano de lançamento e gênero.
    private String titulo;
    private int anoLancamento;
    private String genero;

    // Construtor da classe Filme, inicializando os atributos com valores passados como parâmetro.
    public Filme(String titulo, int anoLancamento, String genero) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.genero = genero;
    }

    // Implementação do método getTitulo() da interface ItemAudioVisual.
    // Retorna o título do filme.
    @Override
    public String getTitulo() {
        return titulo;
    }

    // Implementação do método getAnoLancamento() da interface ItemAudioVisual.
    // Retorna o ano de lançamento do filme.
    @Override
    public int getAnoLancamento() {
        return anoLancamento;
    }

    // Implementação do método getGenero() da interface ItemAudioVisual.
    // Retorna o gênero do filme.
    @Override
    public String getGenero() {
        return genero;
    }

    // Getters e Setters podem ser adicionados aqui caso seja necessário acessar
    // ou modificar os atributos diretamente.
}
