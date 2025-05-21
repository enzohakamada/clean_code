package Aula16;
import java.util.Scanner;
public class CorrecaoAt3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int a[] = new int [2];
		
		for(int i=0; i<2; i++) {
			System.out.println("Informe o " + i + "º valor..: ");
			a[i] = ler.nextInt();
		}
		
		int b[] = new int [2];
		int c[] = new int [4];
		
		for(int i=0; i<2; i++) {
			System.out.println("Informe o " + i + "º valor..: ");
			b[i] = ler.nextInt();
		
			c[i] = a[i];
			c[i+2] = b[i];
		}
		ler.close();
		
		for(int i=0; i<4; i++) {
			System.out.println("O " + i + "º valor é..: " + c[i]);
		}
	}

}
