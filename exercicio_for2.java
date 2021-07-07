package familia28;

import java.util.Scanner;

public class exercicio_for2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int x, pares = 0,num, impares = 0;
		
				Scanner leia = new Scanner(System.in);
		
			for(x=1; x<= 10; x++)
	 {
				System.out.print("\nInsira um numero: ");
				num = leia.nextInt();
		 
		 	if(num % 2 == 0) 
		 	{
		 		num = pares;
		 		pares ++;				 
		 		}
		 	else 
		 		{
		 		num = impares;
			 	impares++;
			}	 
	 }
				System.out.println("\n Quantidade de numeros pares: "+ pares +"\n Quantidade de numeros impares: "+ impares);
				leia.close();
	}
}
