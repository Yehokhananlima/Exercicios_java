package familia28;

import java.util.Scanner;
import java.lang.Math;
//Exercicio 4
public class exercicio_impar {

	public static void main(String[] args) {
		
		int number; //Declara��o de variavel :3
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Insira um n�mero :) :"); //Entrada de dados :)
		number = read.nextInt();
		
		if (number%2 == 0) {
			System.out.println("O n�mero " + number + " � par.");  //Saida de dados XD
			System.out.println("Sua raiz quadrada �: " + Math.sqrt(number));
		}
		else {
			System.out.println("O n�mero " + number + " � impar.");  //Saida de dados :P
			System.out.println("Seu quadrado �: " + Math.pow(number, 2.0) );
		}
		read.close();          //Finaliza��o da leitura 
	}
	

}
