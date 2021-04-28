package prova_poo;

public class questão_prova1 {
static int x= 5;
	public static void main(String[] args) {
		System.out.print(x);
		x = 5;
		while(x>=1) {
			x--;
			if(x%2==0) {
				System.out.println(x*x);
			}
			else {
				System.out.print(x);
			}
		}

	}

}
