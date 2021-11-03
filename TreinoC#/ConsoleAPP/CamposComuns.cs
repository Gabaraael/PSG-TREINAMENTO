using System;

namespace ConsoleAPP
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
