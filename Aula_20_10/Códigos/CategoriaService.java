package service;

import java.util.List;

import ancestral.BaseGenericService;
import ancestral.IgenericService;

import repositorio.CategoriaRepository;

import dominio.Categoria;

public class CategoriaService extends BaseGenericService<CategoriaRepository> implements IgenericService<Categoria> {

	public CategoriaService(String nomeUnidade) {
		super(nomeUnidade);
		this.repositorio = new CategoriaRepository(this.nomeUnidade);
	}

	@Override
	public void inserir(Categoria instance) {
		this.repositorio.create(instance);

	}

	@Override
	public void alterar(Categoria instance) {
		this.repositorio.update(instance);

	}

	@Override
	public void excluir(Categoria instance) {
		this.repositorio.delete(instance);

	}

	@Override
	public void excluir(int id) {
		this.repositorio.delete(id);

	}

	@Override
	public List<Categoria> listar() {
		return (this.repositorio.readAll());
		
	}

	@Override
	public Categoria obter(int id) {
		return(this.repositorio.read(id));	

	}
	
	public void dispose() {
		this.repositorio.dispose();
	}

}
