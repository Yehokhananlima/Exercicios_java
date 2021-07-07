package familia28;

import java.util.Scanner;

		public class exercicio_dowhile6 {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 0, media = 0, multiplo =0, soma = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do
		{
		System.out.print("\nInsira um numero para iniciar e digite 0 para encerrar o programa: ");
			x = leia.nextInt();
			
		if (x %3==0)
			{
				soma = soma+x;
				multiplo++;
			}		
		}
		while(x!=0);
		
		media =soma/multiplo;
		
		System.out.println("\nQuantidade de numeros multiplos de 3: "+multiplo);
		System.out.println("\nMedia dos multiplos de 3: "+media);	
	}

}
