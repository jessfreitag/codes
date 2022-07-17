//Desenvolva um programa que leia o nome e idade e permita a entrada apenas de maiores de 18 anos, ou menores acompanhados de responsável.

package exercicios;
import java.util.Scanner;

public class Ex_4 {

	public static void main(String[] args) {
					
	Scanner texto = new Scanner(System.in);
	int idade;
	String nome;
					
	System.out.println("Entre com seu nome:");
	nome = texto.nextLine();
	
	System.out.println("Entre com sua idade:");
	idade = texto.nextInt();
			
	if (idade >= 18) {
		System.out.println("Olá " + nome + " você tem " + idade + " anos.\n");
		System.out.println("Você pode entrar!");
	} else {
		System.out.println("Acesso permitido para menores de idade apenas acompanhado de responsável.");
			}
	texto.close();
		}
	}