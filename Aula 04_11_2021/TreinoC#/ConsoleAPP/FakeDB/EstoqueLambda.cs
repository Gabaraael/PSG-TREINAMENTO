using System;
using System.Collections.Generic;
using System.Linq;

namespace ConsoleAPP.FakeDB
{
    public class EstoqueLambda
    {
        String ruivas = "meow";
        public EstoqueLambda()
        {
            var c = EstoqueFakeDB.Categorias;
            var s = EstoqueFakeDB.SubCategorias;
            var p = EstoqueFakeDB.Produtos;
        }
        public void exibirCategorias()
        {

            Console.WriteLine("Categorias disponíveis");
            Console.WriteLine("----------------------");

            EstoqueFakeDB.Categorias.Where(c => (c.categoriaID > 0) && (c.categoriaID <= 3))
            .ToList()
            .ForEach(cat =>
            {
                Console.WriteLine("Categoria ID: {0}", cat.categoriaID);
                Console.WriteLine("Descricao: {0} ", cat.Descricao);
                Console.WriteLine("------------------------------------");
            });
        }

        public void exibirSubCategorias(int catID)
        {

            Console.WriteLine("SubCategorias disponíveis");
            Console.WriteLine("----------------------");
            EstoqueFakeDB.SubCategorias.Where(sub => (sub.CategoriaID ==  catID))
                    .ToList()
                    .ForEach(subcat => {                
                Console.WriteLine("\tSubCategoria");
                Console.WriteLine("\tID de Categoria: " + subcat.CategoriaID);
                Console.WriteLine("\tID de SubCategoria: " + subcat.SubCategoriaID);
                Console.WriteLine("\tDescricao: " + subcat.Descricao);
                Console.WriteLine("\tDataInsert: " + subcat.DataInsert);
                Console.WriteLine("------------------------------------");

            });

        }

        public void exibirProdutos(int subID)
        {
            EstoqueFakeDB.Produtos.Where(pro => pro.SubCategoriaID == subID)
                    .ToList()
                    .ForEach(prod => {
                Console.WriteLine("\t\t-------");
                Console.WriteLine("\t\tProdutos");
                Console.WriteLine("\t\tID de Categoria: " + prod.CategoriaID);
                Console.WriteLine("\t\tID de SubCategoria: " + prod.SubCategoriaID);
                Console.WriteLine("\t\tID de Produto: " + prod.ProdutoID);
                Console.WriteLine("\t\tDescricao: " + prod.Descricao);
                Console.WriteLine("\t\tDataInsert: " + prod.DataInsert);
            });

        }
    }
}


