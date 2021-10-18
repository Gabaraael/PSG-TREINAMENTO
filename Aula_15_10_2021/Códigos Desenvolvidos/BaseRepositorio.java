package repositorio;

import javax.persistence.*;

public abstract class BaseRepositorio {

	protected EntityManagerFactory emf;

	protected EntityManager em;

	public EntityManagerFactory getEmf() {
		return emf;
	}

	public EntityManager getEm() {
		return em;
	}
	
	public BaseRepositorio(String nomeUnidade){
		this.emf = Persistence.createEntityManagerFactory(nomeUnidade);		
	}

}
