//Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada.//

package exercicios;
import java.util.Scanner;

public class Ex_3 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int tabuada;
				
		System.out.println("De qual número de 1 a 10 você quer ver a tabuada: ");
		tabuada = leitor.nextInt();
		
		System.out.println("Tabuada de " + tabuada);
		
			for (int i = 0; i <= 10; i = i + 1) {
			System.out.println(tabuada + "x" + i + "=" + (tabuada*i));
					}
			leitor.close();
	}
}