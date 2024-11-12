package org.example.modelos;

// A classe SerieTV representa uma série de TV e implementa a interface ItemAudioVisual.
public class SerieTV implements ItemAudioVisual {
    // Atributos básicos de uma série de TV: título, ano de lançamento e gênero.
    private String titulo;
    private int anoLancamento;
    private String genero;

    // Construtor da classe SerieTV, inicializando os atributos com valores passados como parâmetro.
    public SerieTV(String titulo, int anoLancamento, String genero) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.genero = genero;
    }

    // Implementação do método getTitulo() da interface ItemAudioVisual.
    // Retorna o título da série de TV.
    @Override
    public String getTitulo() {
        return titulo;
    }

    // Implementação do método getAnoLancamento() da interface ItemAudioVisual.
    // Retorna o ano de lançamento da série de TV.
    @Override
    public int getAnoLancamento() {
        return anoLancamento;
    }

    // Implementação do método getGenero() da interface ItemAudioVisual.
    // Retorna o gênero da série de TV.
    @Override
    public String getGenero() {
        return genero;
    }

    // Getters e Setters podem ser adicionados aqui caso seja necessário acessar
    // ou modificar os atributos diretamente.
}
