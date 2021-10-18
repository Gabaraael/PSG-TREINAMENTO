package ancestral;

import java.util.List;

public interface IgenericService<T> {

	void inserir(T instance);
	
	void alterar(T instance);
	
	void excluir(T instance);
	
	void excluir(int id);
	
	List<T> listar();
	
	T obter(int id);
	
	public void dispose();
}
