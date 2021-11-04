using System;
using ConsoleAPP.DAO;
using ConsoleAPP.poco;

namespace ConsoleAPP.Serice
{
    public class Service
    {
        CategoriaDAO dao = new CategoriaDAO();
        public void exibirMenu()
        {
            bool sair = false;
            int op = this.printMenu();
            do
            {

                switch (op)
                {
                    case 1:
                        this.printMenuInserir();
                        break;
                    case 2:
                        this.printMenuListar();
                        break;
                    case 3:
                        this.printMenuDetalhar();
                        break;
                    case 4:
                        printMenuAlterar();
                        break;
                    case 5:
                        break;
                    case 6:
                        sair = true;
                        break;
                    default:
                        Console.WriteLine("Opção não disponível");
                        op = this.printMenu();
                        break;

                }
            } while (sair != true);
        }

        private int printMenu()
        {
            Console.WriteLine("##--Menu Categorai - CRUD--##");
            Console.WriteLine("-------------------------------");
            Console.WriteLine("| Opção 1 - INSERIR    |");
            Console.WriteLine("| Opção 2 - LISTAR     |");
            Console.WriteLine("| Opção 3 - DETALHAR   |");
            Console.WriteLine("| Opção 4 - ALTERAR    |");
            Console.WriteLine("| Opção 5 - EXCLUIR    |");
            Console.WriteLine("| Opção 6 - SAIR       |");
            Console.WriteLine("-------------------------------");
            Console.WriteLine("Digite uma opção");
            return Convert.ToInt32(Console.ReadLine());
        }

        private void printMenuListar()
        {
            for (CategoriaPoco item : this.dao.ReadAll())
            {
                Console.WriteLine("##--Menu Categoria - LISTAR--##");
                Console.WriteLine("-------------------------------");
                Console.WriteLine("| CategoriaID:       " + item.categoriaID);
                Console.WriteLine("| Descricao:        " + item.Descricao);
                Console.WriteLine("-------------------------------");

            }

        }

        private void printMenuInserir()
        {
            Console.WriteLine("##--Menu Categoria - INSERIR--##");
            Console.WriteLine("-------------------------------");
            Console.WriteLine("Digite o ID da categoria");
            int id =  Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Digite a descricao da categoria");
            String esc = this.sc.next();

            CategoriaPoco poco = new CategoriaPoco();
            pojo.setCategoriaID(id);
            pojo.setDescricao(esc);
            this.dao.create(pojo);

            if (this.dao.read(id) != null)
            {
                Console.WriteLine("Categoria Adicionada.");
                Console.WriteLine("-------------------------------");
            }
            else
            {
                Console.WriteLine("Erro ao adicionar a categoria");
            }

        }

        private void printMenuDetalhar()
        {
            Console.WriteLine("##--Menu Categoria - DETALHAR--##");
            Console.WriteLine("Digite o ID da categoria");
            int op = Convert.ToInt32(Console.ReadLine());
            CategoriaPoco item = this.dao.Read(op);
            if (item == null)
            {
                System.out.println("Categoria não existe");
            }
            else
            {
                Console.WriteLine("-------------------------------");
                Console.WriteLine("| CategoriaID:       " + item.categoriaID);
                Console.WriteLine("| Descricao:        " + item.Descricao);
                Console.WriteLine("-------------------------------");
            }

        }



        private void printMenuAlterar()
        {
            Console.WriteLine("##--Menu Categoria - ALTERAR--##");
            Console.WriteLine("Digite o ID da categoria");
            int op = this.sc.nextInt();
            CategoriaPoco item = this.dao.Read(op);
            if (item == null)
            {
                Console.WriteLine("Categoria não existe");
            }
            else
            {
                Console.WriteLine("Digite a nova descricao");
                item.Descricao = Convert.ToString(Console.ReadLine());
            }
        }
    }
}
