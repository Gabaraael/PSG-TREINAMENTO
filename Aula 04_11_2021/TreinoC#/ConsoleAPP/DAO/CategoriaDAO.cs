using System;
using System.Collections.Generic;
using ConsoleAPP.FakeDB;
using ConsoleAPP.poco;
using System.Linq;

namespace ConsoleAPP.DAO
{
    public class CategoriaDAO
    {
        //CRUD
        public void Create(CategoriaPoco poco)
        {
            EstoqueFakeDB.Categorias.Add(poco);
        }

        public CategoriaPoco Read(int categoriaID)
        {
            return Procura(categoriaID);
        }

        public List<CategoriaPoco> ReadAll()
        {
            return EstoqueFakeDB.Categorias;
        }

        public void Update(CategoriaPoco poco)
        {
            CategoriaPoco busca = Procura(poco.categoriaID);
            EstoqueFakeDB.Categorias.Remove(busca);
            EstoqueFakeDB.Categorias.Add(poco);

        }

        public void Delete(CategoriaPoco poco)
        {
            CategoriaPoco busca = Procura(poco.categoriaID);
            EstoqueFakeDB.Categorias.Remove(busca);
        }

        private CategoriaPoco Procura(int id)
        {
            return EstoqueFakeDB.Categorias
                    .Where(c => (c.categoriaID == id))
                    .ToList().First();
        }        
    }
}
