package servico;

import java.util.Date;

import java.util.List;

import dominio.SubCategoria;

import repositorio.SubCategoriaRepositorio;


public class SubCategoriaServico {
	private SubCategoriaRepositorio repo;

	public void inserir() {
		SubCategoria subcat = new SubCategoria(null, null, "teste", new Date());
		repo.create(subcat);

	}

	public void alterar(SubCategoria subcat) {
		repo.update(subcat);
	}

	public void excluirPorId(int id) {
		repo.delete(id);

	}

	public void excluir(SubCategoria subcat) {
		this.excluirPorId(subcat.getSubCategoriaID());

	}

	public List<SubCategoria> listar() {
		return repo.readAll();

	}

	public SubCategoria obter(int id) {
		return repo.read(id);
	}

	public SubCategoriaServico(SubCategoriaRepositorio repo) {		
		this.repo = repo;
	}

}
