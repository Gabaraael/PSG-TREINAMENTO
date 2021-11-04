using System;

namespace ConsoleAPP.poco
{
    public class CamposComuns : CamposDeData
    {
        protected String descricao;

        public string Descricao {
             get => this.descricao; 
             set => this.descricao = value; 
             }
    }

}
