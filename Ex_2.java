//Desenvolva um programa que peça notas entre 0 e 10, mostre um mensagem caso o valo seja inválido e continue pedindo até o usuário informar um valor válido.

package exercicios;
import java.util.Scanner;

public class Ex_2 {

public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
		
	System.out.println("Atribua uma nota de 0 a 10: ");
	
	int nota = scan.nextInt();
		
	while ((nota < 0) || (nota > 10)) {	
		System.out.println("Nota inválida, tente novamente!");
		System.out.println("Atribua uma nota de 0 a 10: ");
		nota = scan.nextInt();
					}
			
	if ((nota >= 0) && (nota <= 10)) {
		System.out.println("A nota atribuida foi: " + nota);
			}
	scan.close();
				} 
		}	

