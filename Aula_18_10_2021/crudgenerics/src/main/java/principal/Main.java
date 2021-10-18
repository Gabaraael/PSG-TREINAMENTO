package principal;

import java.util.Date;

import dominio.Categoria;
import service.CategoriaService;


public class Main {

	public static void main(String[] args) {
		System.out.println("meow");
		CategoriaService s = new CategoriaService("treinojpa");
		s.inserir(new Categoria(null, "teste", new Date()));
		s.listar().forEach(t ->  {
			System.out.println(t);
		});
	}

}
