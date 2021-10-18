package repositorio;

import java.util.List;

import javax.persistence.Query;

import ancestral.BaseGenericRepository;

import ancestral.IGenericRepository;

import dominio.Produto;

public class ProdutoRepository 
extends BaseGenericRepository<Produto>
implements IGenericRepository<Produto> {

	public ProdutoRepository(String nomeUnidade) {
		super(nomeUnidade);		
	}

//Crud
	@Override
	public void create(Produto produto) {
		this.getSession().getTransaction().begin();
		this.getSession().persist(produto);
		this.getSession().getTransaction().commit();
		this.getSession().close();
		this.getFactory().close();
	}
	@Override
	public List<Produto> readAll() {
		Query qry = this.getSession().createQuery("FROM Produto");
		@SuppressWarnings("unchecked")
		List<Produto> lista = qry.getResultList();
		return lista;
	}
	@Override
	public Produto read(int id) {
		Produto pro = this.getSession().find(Produto.class, id);

		return pro;
	}
	@Override
	public Produto update(Produto produto) {
		Produto pro = this.getSession().find(Produto.class, produto.getProdutoID());
		this.getSession().detach(pro);
		this.getSession().getTransaction().begin();
		Produto mergeProduto= (Produto) this.getSession().merge(pro);
		this.getSession().getTransaction().commit();

		return mergeProduto;
	}	
	@Override
	public void delete(int id) {
		Produto pro = this.getSession().find(Produto.class, id);
		this.getSession().getTransaction().begin();
		this.getSession().remove(pro);
		this.getSession().getTransaction().commit();

	}
	
	@Override
	public void delete(Produto instance) {
		this.delete(instance.getProdutoID());		
	}


}
