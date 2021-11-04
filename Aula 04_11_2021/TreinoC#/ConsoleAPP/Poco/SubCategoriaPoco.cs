using System;

namespace ConsoleAPP.poco
{
    public class SubCategoriaPoco:CamposComuns
    {
        private int subCategoriaID;   
        private int categoriaID;
        public int SubCategoriaID { get => this.subCategoriaID; set => this.subCategoriaID = value; }
        public int CategoriaID { get => this.categoriaID; set => this.categoriaID = value; }
    }
}
