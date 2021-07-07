package familia28;

import java.util.Scanner;

public class exercicio_Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float [] [] a = new float [2][2];
		float [] [] b = new float [2][2];
		float [] [] resultado = new float [2][2];
		int l,c,valor;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com um valor: ");
		valor =leia.nextInt();
		
		for(1=0;1<2;1++)
		{
			for(c=0;c<2,c++)
			{
				System.out.println("\nEntre com  o valor de A: ");
				a[l][c] =leia.nextFloat();
				System.out.println("\nEntre com  o valor de B: ");
				b[l][c] =leia.nextFloat();
					
			}
		}
		System.out.println("\n\t\Menu de opcoes"); 
	}

}
