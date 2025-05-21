package Aula16;
import java.util.Scanner;
public class CorrecaoAt1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Informe um valor: ");
		double a = ler.nextDouble();
		
		ler.close();
		
		String multiplo = (a % 5 == 0) ? "O número " + a + " é multiplo de 5" : "O número " + a + " não é multiplo de 5";
		System.out.println(multiplo);
	}

}
