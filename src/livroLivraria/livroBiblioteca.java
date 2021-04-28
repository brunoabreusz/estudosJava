package livroLivraria;
public class livroBiblioteca
{  public int isbn;
   public String titulo, autor, editora, edicao;
   public float multa;
   public String usuario;
   public int diaE, mesE, anoE, diaD, mesD, anoD;

  public livroBiblioteca(int isbn, String titulo, String autor, String editora, String edicao)
  {   this.isbn = isbn;
      this.titulo = titulo;
      this.autor = autor;
      this.editora = editora;
      this.edicao = edicao;
      multa=0;
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
  
  public void emprestimo(String usuario, int dia, int mes, int ano)
  { this.usuario = usuario;
    diaE = dia;
    mesE = mes;
    anoE = ano;
    diaD = dia + 8;
    mesD = mes;
    anoD = ano;
  }
    

  public void devolucao(int dia, int mes, int ano)
  {  int difDia=0, difMes=0, difAno=0; 
     difAno = ano - anoD;
     difMes = mes - mesD;
     difDia = dia - diaD;
     
     if (difDia > 0)
     {   multa = difDia * 2;
     }
     if (difMes > 0)
     {   multa = multa + (difMes * 31 * 2);
     }
     if (difAno > 0)
     {   multa = multa + (difAno * 360 * 2);
     }    
     if ((difAno > 0) || (difMes > 0) || (difDia > 0))
     {  System.out.println("Sua multa e de R$ "+multa);
         usuario ="";
     }
     else
     {  System.out.println("Livro devolvido");
     }
  }
}
     
