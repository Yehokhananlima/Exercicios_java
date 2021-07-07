package familia28;

import java.util.Scanner;


public class Exercicio_While3 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int age,ageB = 0, Cless = 0, Cmore = 0;
		
		Scanner l = new Scanner(System.in);
		
		System.out.print("Digite sua idade xuxu: ");
		age = l.nextInt();
		
			while(age!= -99)
		{
		System.out.print("\n Digite sua idade minha flor: ");
			age = l.nextInt();
		
			if (age<21)
			{
			Cless ++;
			}
		
			else if (age>50)
			{
			Cmore ++;
			}
		
			else
			{
			ageB ++;
			}
		
		}
		System.out.println("\nTem varios novinhos com menos de 21 anos : "+Cless);
		
		System.out.println("\nTem varios Coroa com mais de 50 anos : "+Cmore);
		
	
		
	
		
		
				
		
		
	}

}
