package org.example.modelos;

// A classe Documentario representa um documentário e implementa a interface ItemAudioVisual.
public class Documentario implements ItemAudioVisual {
    // Atributos básicos de um documentário: título, ano de lançamento e gênero.
    private String titulo;
    private int anoLancamento;
    private String genero;

    // Construtor da classe Documentario, inicializando os atributos com valores passados como parâmetro.
    public Documentario(String titulo, int anoLancamento, String genero) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.genero = genero;
    }

    // Implementação do método getTitulo() da interface ItemAudioVisual.
    // Retorna o título do documentário.
    @Override
    public String getTitulo() {
        return titulo;
    }

    // Implementação do método getAnoLancamento() da interface ItemAudioVisual.
    // Retorna o ano de lançamento do documentário.
    @Override
    public int getAnoLancamento() {
        return anoLancamento;
    }

    // Implementação do método getGenero() da interface ItemAudioVisual.
    // Retorna o gênero do documentário.
    @Override
    public String getGenero() {
        return genero;
    }

    // Getters e Setters podem ser adicionados aqui, caso haja necessidade de acessar
    // ou modificar os atributos diretamente.
}
