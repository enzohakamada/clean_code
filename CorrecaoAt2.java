package Aula16;
import java.util.Scanner;
public class CorrecaoAt2 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Cadastre uma senha ( Apenas Números ): ");
		int masterPin = ler.nextInt();
		
		System.out.println("Digite um número: ");
		double n1 = ler.nextDouble();
		System.out.println("Digite um número: ");
		double n2 = ler.nextDouble();
		
		double soma = n1 + n2;
		
		System.out.println("Digite a sua senha para desbloquear a soma: ");
		int pinTry = ler.nextInt();
		
		ler.close();
		
		String acesso = pinTry == masterPin ? "A soma é: " + soma : "Erro! Senha Errada!";
		System.out.println(acesso);
	}

}
