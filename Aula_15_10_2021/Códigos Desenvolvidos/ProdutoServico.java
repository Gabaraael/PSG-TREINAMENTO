package servico;

import java.util.Date;

import java.util.List;

import dominio.Produto;

import repositorio.ProdutoRepositorio;

public class ProdutoServico {

	private ProdutoRepositorio repo;

	public void inserir() {
		Produto c = new Produto(null, null, null, "teste", new Date());
		repo.create(c);

	}

	public void alterar(Produto pro) {
		repo.update(pro);
	}

	public void excluirPorId(int id) {
		repo.delete(id);

	}

	public void excluir(Produto pro) {
		this.excluirPorId(pro.getProdutoID());

	}

	public List<Produto> listar() {
		return repo.readAll();

	}

	public Produto obter(int id) {
		return repo.read(id);
	}

	public ProdutoServico(ProdutoRepositorio repo) {		
		this.repo = repo;
	}

}
