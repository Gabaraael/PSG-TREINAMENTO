package Principal;

import repositorio.CategoriaRepositorio;

import repositorio.ProdutoRepositorio;

import repositorio.SubCategoriaRepositorio;

import servico.CategoriaServico;

import servico.ProdutoServico;

import servico.SubCategoriaServico;

public class Principal {

	public static void main(String[] args) {	
		printCategorias();
		printSubCategorias();
		printProdutos();			
	}
	public static void printProdutos() {
		ProdutoRepositorio repo = new ProdutoRepositorio("treinojpa");	
		ProdutoServico s = new ProdutoServico(repo);		
		s.listar().forEach(t ->{
			System.out.println(t);
		});
	}
	
	public static void printCategorias() {
		CategoriaRepositorio repo = new CategoriaRepositorio("treinojpa");	
		CategoriaServico s = new CategoriaServico(repo);		
		s.listar().forEach(t ->{
			System.out.println(t);
		});
	}
	
	public static void printSubCategorias() {
		SubCategoriaRepositorio repo = new SubCategoriaRepositorio("treinojpa");	
		SubCategoriaServico s = new SubCategoriaServico(repo);		
		s.listar().forEach(t ->{
			System.out.println(t);
		});
	}
	
}
