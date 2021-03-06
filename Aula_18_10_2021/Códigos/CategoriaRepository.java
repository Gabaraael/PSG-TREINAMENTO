package repositorio;

import java.util.List;

import javax.persistence.Query;

import ancestral.BaseGenericRepository;
import ancestral.IGenericRepository;
import dominio.Categoria;

public class CategoriaRepository extends BaseGenericRepository<Categoria> implements IGenericRepository<Categoria> {

	public CategoriaRepository(String nomeUnidade) {
		super(nomeUnidade);		
	}

	@Override
	public void create(Categoria instance) {
		// TODO Auto-generated method stub
		this.getSession().getTransaction().begin();
		this.getSession().persist(instance);
		this.getSession().getTransaction().commit();
	}

	@Override
	public List<Categoria> readAll() {
		Query qry = this.getSession().createQuery("FROM Categoria");
		@SuppressWarnings("unchecked")
		List<Categoria> lista = qry.getResultList();
		return lista;
	}

	@Override
	public Categoria read(int id) {
		Categoria cat = this.getSession().find(Categoria.class, id);
		return cat;
	}

	@Override
	public Categoria update(Categoria instance) {
		Categoria cat = this.getSession().find(Categoria.class, instance.getCategoriaID());
		this.getSession().detach(cat);
		this.getSession().getTransaction().begin();
		Categoria mergeCategoria = (Categoria) this.getSession().merge(instance);
		this.getSession().getTransaction().commit();
		return mergeCategoria;
	}

	@Override
	public void delete(int id) {
		Categoria cat = this.getSession().find(Categoria.class, id);
		this.getSession().getTransaction().begin();
		this.getSession().remove(cat);
		this.getSession().getTransaction().commit();
	}

	@Override
	public void delete(Categoria instance) {
		this.delete(instance.getCategoriaID());

	}

}
