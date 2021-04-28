package livroLivraria;
public class livro
{   private int isbn;
    private String titulo, autor, editora, edicao;

  public livro(int isbn, String titulo, String autor, String editora, String edicao)
  {   this.isbn = isbn;
      this.titulo = titulo;
      this.autor = autor;
      this.editora = editora;
      this.edicao = edicao;
  }
 
  public void mostraDados()
  { System.out.println("Isbn = "+isbn);
    System.out.println("Titulo = "+titulo);
    System.out.println("Autor = "+autor);
    System.out.println("Editora = "+ editora);
    System.out.println("Edição = "+ edicao);
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


