package UNIFACS_soma;
import java.io.*; // Biblioteca
public class soma {

	public static void main (String args[]) throws java.io.IOException {
		String aux;
		int a, b;
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Digite o primeiro número");
		aux = obj.readLine();
		a = Integer.valueOf(aux).intValue();
		System.out.println("Digite o segundo número");
		aux = obj.readLine();
		b = Integer.valueOf(aux).intValue();
		a = a + b;
		
		System.out.println("O Resultado: " + a);
	}
	
	
}

// é preciso importar uma biblioteca pra fazer entrada e saida em java.
// em java a entrada de dados é string na linha 11 e 14 foram feitos a conversão pra int.
