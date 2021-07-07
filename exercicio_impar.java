package familia28;

import java.util.Scanner;
import java.lang.Math;
//Exercicio 4
public class exercicio_impar {

	public static void main(String[] args) {
		
		int number; //Declaração de variavel :3
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Insira um número :) :"); //Entrada de dados :)
		number = read.nextInt();
		
		if (number%2 == 0) {
			System.out.println("O número " + number + " é par.");  //Saida de dados XD
			System.out.println("Sua raiz quadrada é: " + Math.sqrt(number));
		}
		else {
			System.out.println("O número " + number + " é impar.");  //Saida de dados :P
			System.out.println("Seu quadrado é: " + Math.pow(number, 2.0) );
		}
		read.close();          //Finalização da leitura 
	}
	

}
