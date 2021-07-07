package familia28;

import java.util.Scanner;

public class Exercicio1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int anos,meses,dias,total_dias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nQuantos anos voce tem minha flor?: ");
		anos = leia.nextInt();
		System.out.println("\nQuantos meses voce tem meu anjo?: ");
		meses = leia.nextInt();
		System.out.println("\nQuantos dias voce tem xuxu?: ");
		dias = leia.nextInt();
		 
		 total_dias = anos*365+meses*30+dias;
		 
		 System.out.println("O seu total de dias é: "+total_dias);
		
		
		
		

	}

}
