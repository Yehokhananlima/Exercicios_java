package familia28;

import java.util.Scanner;
//Exercicio 1
public class exercicio_maior {

	public static void main(String[] args) {
		
		int numero, i,  maior = 0;  //Declaração de variaveis
		
		Scanner read = new Scanner(System.in);
		
		for (i=0;i<=2;i++) {
		System.out.print("Escreva um número: ");  //Entrada de dados
		numero = read.nextInt();
		
		if (numero > maior) {
			maior = numero;
		}
		
		}
		System.out.println("O maior valor é: " + maior);  //Saida de dados
		read.close();								
		//Finalização da leitura		
	}
}

