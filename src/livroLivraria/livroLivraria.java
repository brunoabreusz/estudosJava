package livroLivraria;
public class livroLivraria
{
    public int isbn, paginas, qtd;
    private String titulo, autor, editora, edicao;
    private float preco;

    public livroLivraria(int isbn, String titulo, String autor, String editora, String edicao, int paginas, float preco, int qtd)
    {
        this.isbn = isbn;
        this.titulo = titulo;  
        this.autor = autor;
        this.editora = editora;
        this.edicao = edicao;
        this.paginas = paginas;
        this.preco = preco;
        this.qtd = qtd;     
    }

    public void vender(int Quantidade)
    {   float valor;
        if (Quantidade <= qtd)
        {  qtd = qtd - Quantidade;
           valor = Quantidade * preco; 
           System.out.println("O valor é = "+ valor);
        }
        else
        {  System.out.println("Não tenho esta qtd no estoque");
        }  
    }

    public void comprar(int Quantidade)
    {   qtd = qtd + Quantidade; 
    }
         
    public void reajustePreco(float percentual) 
    {   preco = preco + ((preco * percentual)/100);  
    }   
    
    public void mostraDados()
    {  System.out.println("Isbn = "+isbn);
       System.out.println("Titulo = "+titulo);
       System.out.println("Autor = "+autor);
       System.out.println("Editora = "+ editora);
       System.out.println("Edição = "+ edicao);
       System.out.println("Preço = "+ preco);
       System.out.println("Quantidade = "+ qtd);
    }
  
    public void setIsbn(int isbn)
    {  this.isbn = isbn;
    }    
  
    public void setTitulo(String titulo)
    {   this.titulo = titulo;
    }
  
    public void setAutor(String autor)
    {   this.autor = autor;
    }
  
    public void setEditora(String editora)
    {   this.editora = editora;
    }    
  
    public void setEdicao(String edicao)
    {   this.edicao = edicao;
    }
  
    public int getIsbn()
    {  return isbn;
    }    
  
    public String getTitulo()
    {   return titulo;
    }
  
    public String getAutor()
    {   return autor;
    }
  
    public String getEditora()
    {   return editora;
    }    
  
    public String getEdicao()
    {   return edicao;
    }
}          
