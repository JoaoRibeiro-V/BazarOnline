import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.shopup.Classes.*;

public class TestsShopUp {
    // 1 — Criar produto e verificar preço inicial
    @Test
    void testCriarProduto() {
        Estoque e = new Estoque(10);
        Produto p = new Produto(1, "Camisa", 50.0, "M", e);

        assertEquals(50.0, p.getPreco());
    }

    // 2 — Validar tamanho do produto
    @Test
    void testTamanhoProduto() {
        Produto p = new Produto(2, "Tenis", 120.0, "G", new Estoque(5));

        assertEquals("G", p.getTamanho());
    }

    // 3 — Aplicar desconto válido
    @Test
    void testAplicarDesconto() {
        Produto p = new Produto(3, "Calça", 100.0, "M", new Estoque(8));

        boolean resultado = p.aplicarDesconto(10); // 10%

        assertTrue(resultado);
        assertEquals(90.0, p.getPreco());
    }

    // 4 — Impedir desconto inválido
    @Test
    void testDescontoInvalido() {
        Produto p = new Produto(4, "Óculos", 200.0, "P", new Estoque(3));

        boolean resultado = p.aplicarDesconto(150); // inválido

        assertFalse(resultado);
    }

    // 5 — Reduzir estoque corretamente
    @Test
    void testReducaoEstoque() {
        Estoque e = new Estoque(10);
        e.reduzir(3);

        assertEquals(7, e.getQuantidade());
    }

    // 6 — Impedir estoque negativo
    @Test
    void testEstoqueNaoNegativo() {
        Estoque e = new Estoque(2);
        e.reduzir(5);  // não deve reduzir

        assertEquals(2, e.getQuantidade());
    }

    // 7 — Adicionar estoque
    @Test
    void testAdicionarEstoque() {
        Estoque e = new Estoque(5);
        e.adicionar(4);

        assertEquals(9, e.getQuantidade());
    }

    // 8 — Validar email correto
    @Test
    void testEmailValido() {
        Usuario u = new Usuario("Maria", "maria@gmail.com");

        assertTrue(u.emailValido());
    }

    // 9 — Email inválido
    @Test
    void testEmailInvalido() {
        Usuario u = new Usuario("João", "teste@yahoo.com");

        assertFalse(u.emailValido());
    }

    // 10 — Criar categoria
    @Test
    void testCriarCategoria() {
        Categoria c = new Categoria(1, "Roupas");

        assertEquals("Roupas", c.getNome());
    }
}
