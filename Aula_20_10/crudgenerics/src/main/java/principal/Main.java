package principal;

import java.util.Date;
import dominio.Categoria;
import dominio.Produto;
import dominio.SubCategoria;
import service.CategoriaService;
import service.ProdutoServico;
import service.SubCategoriaServico;

public class Main {
	public static void main(String[] args) {

		CategoriaService c;
		SubCategoriaServico s;
		ProdutoServico p;
		// TESTE DE CATEGORIA
		try {
			c = new CategoriaService("treinojpa");
			c.inserir(new Categoria(null, "Test", new Date()));
			c.alterar(new Categoria(23, "Alterar", new Date()));
			c.obter(23);
			c.excluir(23);
			c.listar().forEach(t -> {
				System.out.println(t);
			});
		} catch (Exception e) {
			System.err.println("Ocorreu uma exceção durante os processos de Categoria " + e.getMessage());
		}
		// TESTE DE SUBCATEGORIA
		try {
			s = new SubCategoriaServico("treinamento-jpa");
			s.inserir(new SubCategoria(null, 1, "Test", new Date()));
			s.alterar(new SubCategoria(null, 23, "Test", new Date()));
			s.obter(23);
			s.excluir(23);
			s.listar().forEach(t ->{
				System.out.println(t);
			});
		} catch (Exception e) {
			System.err.println("Ocorreu uma exceção durante os processos de SubCategoria " + e.getMessage());
		}
		// TESTE DE PRODUTO
		try {
			p = new ProdutoServico("treinamento-jpa");
			p.inserir(new Produto(null, 1, 1,  "Test", new Date()));
			p.alterar(new Produto(23, 1, 1,  "alterar", new Date()));
			p.obter(23);
			p.excluir(23);
			p.listar().forEach(t ->{
				System.out.println(t);
			});
		} catch (Exception e) {
			System.err.println("Ocorreu uma exceção durante os processos de SubCategoria " + e.getMessage());
		}
	}
}