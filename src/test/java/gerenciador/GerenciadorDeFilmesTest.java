package gerenciador;

import org.example.gerenciador.GerenciadorDeFilmes;
import org.example.modelos.Filme;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class GerenciadorDeFilmesTest {

    @Test
    public void testeAdicionarItem() {
        GerenciadorDeFilmes gerenciador = new GerenciadorDeFilmes();
        Filme filme = new Filme("Matrix", 1999, "Ficção Científica");
        gerenciador.adicionarItem(filme);
        assertEquals(1, gerenciador.listarItens().size());
    }

    @Test
    public void testeRemoverItem() {
        GerenciadorDeFilmes gerenciador = new GerenciadorDeFilmes();
        Filme filme = new Filme("Matrix", 1999, "Ficção Científica");
        gerenciador.adicionarItem(filme);
        gerenciador.removerItem("Matrix");
        assertEquals(0, gerenciador.listarItens().size());
    }

    @Test
    public void testeBuscarItemPorTitulo() {
        GerenciadorDeFilmes gerenciador = new GerenciadorDeFilmes();
        Filme filme = new Filme("Matrix", 1999, "Ficção Científica");
        gerenciador.adicionarItem(filme);
        assertNotNull(gerenciador.buscarItemPorTitulo("Matrix"));
    }
}