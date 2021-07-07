package familia28;

import java.util.Scanner;

/*2- Faça um programa que entre com três números e coloque em ordem crescente.*/

public class Laços_de_descisao 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int num1, num2, num3, maior;  //Definindo as variaveis 
		
		Scanner cafe = new Scanner(System.in); /*O Scanner vai atribuir  uma função a uma palavra para entrada de dados(memoria)*/
		
		System.out.print("\nDigite o primeiro numero: ");  // para imprimir uma mensagem para o usuario
		num1 = cafe.nextInt();
		
		System.out.print("\nDigite o segundo numero: ");
		num2 = cafe.nextInt();
		
		System.out.print("\nDigite o terceiro numero: ");
		num3 = cafe.nextInt();
		
		if (num1<num2 && num2<num3)									//if = se  ele so irá funcionar se o argumento dentro de parenteses for verdadeiro
		{
		 System.out.print("\n Ordem crescente: "+num1+num2+num3); 
			
		}
		else if (num1<num3 && num3<num2)							// else if = senão  ele irá funcionar caso o if seja falso
		{
		 System.out.print("\n Ordem crescente: "+num1+num3+num2); 
			
		}
		else if (num2<num1 && num1<num3 )
		{
		 System.out.print("\n Ordem crescente: "+num2+num1+num3); 
			
		}
		else if (num2<num3 && num3<num1 )
		{
		 System.out.print("\n Ordem crescente: "+num2+num3+num1); 
			
		}
		else if (num3<num1 && num1<num2 )
		{
		 System.out.print("\n Ordem crescente: "+num3+num1+num2); 
			
		}
		else  
		{
		 System.out.print("\n Ordem crescente: "+num3+num2+num1); 
			
		} 
	}

}
