package familia28;

import java.util.Scanner;
//Exercicio 2
public class exercicio_Crescente {

	public static void main(String[] args) {

		double y, o, h;
		
					Scanner read = new Scanner(System.in);
				//Entrada de dados
					System.out.print("Oi lindeza! insira o valor de y: ");
						y = read.nextDouble();
		
					System.out.print("Oi xuxu coloque o valor de o: ");
						o = read.nextDouble();
		
					System.out.print("Beldade! insira o valor de h: ");
						h = read.nextDouble();
				//Logica
				if((y>o) && (y>h)) {
	            if(y>h) {
	           //Saida de dados
	                System.out.println("A crescente dos números é: " + h + ", " + o + " e " + y + ".");
	            }
	            else if(h>o) {
	                System.out.println("A crescente dos números é: " + o + ", " + h + " e " + y + ".");
	            }
	        }
				else if((o>y) && (o>h)) {
	            if(y>h) {
	                System.out.println("A crescente dos números é: " + h + ", " + y + " e " + o + ".");
	            }
	            else if(h>y) {
	            	System.out.println("A crescente dos números é: " + y + ", " + h + " e " + o + ".");
	            }
	        }
				else if((h>y) && (h>o)) {
	            if(y>o) {
	                System.out.println("A crescente dos números é: " + o + ", " + o + " e " + h + ".");
	            }
	            else if(o>y) {
	                System.out.println("A crescente dos números é: " + y + ", " + o + " e " + h + ".");
	            }
	        }
		 read.close();																
		 		//Finalização da leitura
	   }
}
