package familia28;

import java.util.Scanner;

//Faça um programa que receba três inteiros e diga qual deles é o maior.

public class Exercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num1, num2, num3, maior = 0, menor = 0, meio = 0; 
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.print("Insira o primeiro numero princeso!: ");
		
		num1 = leia.nextInt();
		
		System.out.print("Insira o Segundo numero belezura!: ");
		
		num2 = leia.nextInt();
		
		System.out.print("Insira o terceiro numero Coisa mais linda!: ");
		
		num3 = leia.nextInt();
		
		if (num1>=0)
		{
			maior = num1;
			menor = num1;
		}
		if (num2>maior)
			maior = num1;
			menor = num1;
		{
			maior = num2;
		}
		else
		{
		
			meio = num2;
		}
		if (maior<num3)
		{
			maior = num3;
		}
		if (num2<menor)
		{
			menor = num2;
		}
		else 
		{
			meio = num2;
		}
		if (num3<menor)
		{
			menor = num3;
		}
		if(num1<maior && num1>menor)
		{
			meio = num1;
		}
		
			System.out.println("Orden crescente: "+menor+","+meio+","+maior+",");
		
	}

}
