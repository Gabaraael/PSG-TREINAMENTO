package servico;

import java.util.Date;

import java.util.List;

import dominio.Categoria;

import repositorio.CategoriaRepositorio;

public class CategoriaServico extends baseServico {

	private CategoriaRepositorio repo;

	public void inserir() {
		Categoria c = new Categoria(null, "teste", new Date());
		repo.create(c);

	}

	public void alterar(Categoria cat) {
		repo.update(cat);
	}

	public void excluirPorId(int id) {
		repo.delete(id);

	}

	public void excluir(Categoria cat) {
		this.excluirPorId(cat.getCategoriaID());

	}

	public List<Categoria> listar() {
		return repo.readAll();

	}

	public Categoria obter(int id) {
		return repo.read(id);
	}

	public CategoriaServico(CategoriaRepositorio repo) {		
		this.repo = repo;
	}

}
