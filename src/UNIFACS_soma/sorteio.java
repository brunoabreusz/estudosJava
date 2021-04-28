package UNIFACS_soma;
import java.util.*;
public class sorteio{

	public static void main(String[] args) {
	
    int[] valores = new int[6];
    Random gera = new Random();

    int i = 0;
    while (i < valores.length) {
        valores[i] = gera.nextInt(5);
        boolean colide = false;
        for (int j = 0; j < i; j++){
            if (valores[i] == valores[j]){
                colide = true;
                break;
            }               
        }
        if (!colide){
            i++;
        }
    }

    for (int valor : valores){
        System.out.println(valor);
    }
	
	}
	
}
