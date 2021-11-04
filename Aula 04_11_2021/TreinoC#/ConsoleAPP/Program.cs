using System;
using System.Collections.Generic;
using System.Linq;
using ConsoleAPP.FakeDB;

namespace ConsoleAPP
{
    class Program
    {
        public static void Main(string[] args)
        {
         



             EstoqueLambda l = new EstoqueLambda();
            l.exibirCategorias();
            
            int catID = Convert.ToInt32(Console.ReadLine());
            l.exibirSubCategorias(catID);
            int subID = Convert.ToInt32(Console.ReadLine());
            l.exibirProdutos(subID);


        }
    }
}
