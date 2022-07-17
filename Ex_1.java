//Desenvolva um programa que leia cinco números, informe o maior número e a média dos números informados.

package exercicios;
import java.util.Scanner;

public class Ex_1 {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int numero;
	int soma = 0;
	int maior = 0;
	
	
	for (int cont = 1; cont <= 5; cont++) {
			
		System.out.println("Digite um número inteiro: ");
			
		numero = scan.nextInt();
				
		if (numero > maior) {
			maior = numero;
		}
			soma = soma + numero;
		}									
		
		scan.close();
		
		System.out.println("A soma dos números digitados foi " + soma + ", a média é " + (soma/5)+ " e o maior número foi o " + maior);
		
			}
	
}