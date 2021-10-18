package ancestral;

public abstract class BaseGenericService<R> {

	protected R repositorio;
	
	protected String nomeUnidade;

	public String getNomeUnidade() {
		return nomeUnidade;
	}
	
	public R getRepositorio() {
		return this.repositorio;
	}

	public BaseGenericService(String nomeUnidade) {		
		this.nomeUnidade = nomeUnidade;
	}
	
	


	
	

}
