package livroLivraria;
import java.io.*;
class controleLivros
{
    public static void main(String arg[]) throws java.io.IOException
    {  String aux;
      int isbn, paginas, qtd, qtdVenda;//  diaE, mesE, anoE, diaD, mesD, anoD,
       String titulo, autor, editora, edicao;
       float  preco; // multa
       //String // usuario

       
       BufferedReader obj = new BufferedReader(new InputStreamReader(System.in)); 
       System.out.println("Informe o ISBN: ");
       aux = obj.readLine();
       isbn = Integer.valueOf(aux).intValue();
       System.out.println("Digite o título do livro: ");
       titulo = obj.readLine();
       System.out.println("Digite o autor do livro: ");
       autor = obj.readLine();
       System.out.println("Digite a editora do livro: ");
       editora = obj.readLine();
       System.out.println("Digite a edição do livro: ");
       edicao = obj.readLine();
       System.out.println("Informe o número de páginas: ");
       aux = obj.readLine();
       paginas = Integer.valueOf(aux).intValue();
       System.out.println("Informe o preço do livro: ");
       aux = obj.readLine();
       preco = Float.valueOf(aux).floatValue();
       System.out.println("Informe a quantidade: ");
       aux = obj.readLine();
       qtd = Integer.valueOf(aux).intValue();
       
       livro objLivro = new livro(isbn, titulo, autor, editora, edicao);
       objLivro.mostraDados();
       
       livroLivraria objLivroLivraria = new livroLivraria(isbn, titulo, autor, editora, edicao, paginas, preco, qtd);
       System.out.println("Informe a quantidade de livros que quer vender: ");
       aux = obj.readLine();
       qtdVenda = Integer.valueOf(aux).intValue();
       objLivroLivraria.vender(qtdVenda);
       objLivroLivraria.mostraDados();
       
    }
}   

    