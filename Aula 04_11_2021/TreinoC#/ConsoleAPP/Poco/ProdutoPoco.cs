using System;

namespace ConsoleAPP.poco
{
    public class ProdutoPoco : CamposComuns
    {

        private int produtoID;

        private int categoriaID;

        private int subCategoriaID;

        public int ProdutoID { get => this.produtoID; set => this.produtoID = value; }
        public int CategoriaID { get => this.categoriaID; set => this.categoriaID = value; }
        public int SubCategoriaID { get => this.subCategoriaID; set => this.subCategoriaID = value; }
    }
}
