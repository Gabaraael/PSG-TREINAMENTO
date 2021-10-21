package repositorio;

import java.util.List;

import javax.persistence.Query;

import ancestral.BaseGenericRepository;
import ancestral.IGenericRepository;

import dominio.SubCategoria;

public class SubCategoriaRepositorio extends BaseGenericRepository<SubCategoria>
		implements IGenericRepository<SubCategoria> {

	public SubCategoriaRepositorio(String nomeUnidade) {
		super(nomeUnidade);
	}

	@Override
	public void create(SubCategoria instance) {
		this.getSession().getTransaction().begin();
		this.getSession().persist(instance);
		this.getSession().getTransaction().commit();
		this.getSession().close();
		this.getFactory().close();

	}

	public List<SubCategoria> readAll() {
		Query qry = this.getSession().createQuery("FROM SubCategoria");
		@SuppressWarnings("unchecked")
		List<SubCategoria> lista = qry.getResultList();
		return lista;
	}

	public SubCategoria read(int id) {
		SubCategoria subcat = this.getSession().find(SubCategoria.class, id);

		return subcat;
	}

	public SubCategoria update(SubCategoria subCategoria) {
		SubCategoria subcat = this.getSession().find(SubCategoria.class, subCategoria.getSubCategoriaID());
		this.getSession().detach(subcat);
		this.getSession().getTransaction().begin();
		SubCategoria mergeSubCategoria = (SubCategoria) this.getSession().merge(subCategoria);
		this.getSession().getTransaction().commit();

		return mergeSubCategoria;
	}

	public void dispose() {
		this.getSession().close();
		this.getFactory().close();
	}
	
	@Override
	public void delete(SubCategoria instance) {
		this.delete(instance.getSubCategoriaID());		
	}

	public void delete(int id) {
		SubCategoria subcat = this.getSession().find(SubCategoria.class, id);
		this.getSession().getTransaction().begin();
		this.getSession().remove(subcat);
		this.getSession().getTransaction().commit();

	}

	
}
