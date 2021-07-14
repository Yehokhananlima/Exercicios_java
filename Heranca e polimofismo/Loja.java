package Heranca;


import java.util.ArrayList;
import java.util.Scanner;

public class Loja {

	public static void main(String[] args) 
	{
		int op;
		Scanner read = new Scanner(System.in);
		
		ArrayList<String> storage = new ArrayList();
		
		do {
			System.out.println("\n(1) Armazenar Chocolate\n"
					+ "(2) Retirar um Chocolate? \n(3) Atualizar um Chocolate\n(4) Mostrar todos os Chocolate do estoque"
					+ "\n(0) Encerrar o programa");
			
			System.out.println("\nDigite sua opção: ");
			
			op = read.nextInt();
			switch(op)
			
			{case 1:
				read.nextLine();
				System.out.println("\nDigite o Chocolate para adicionar ao estoque: ");
				String produto = read.nextLine();
				storage.add(produto);
				break;
				
			case 2:
				read.nextLine();
				System.out.println("\nDigite o Chocolate para remover do estoque: ");
				String produto1 = read.nextLine();
				if(storage.contains(produto1))
				{
					storage.remove(produto1);
				}
				
				else
				{
					System.out.println("\n este Chocolate não existe no estoque...");
				}
				
				System.out.println(storage);
				break;
				
				
			case 3:
				read.nextLine();
				System.out.println("\nDigite o Chocolate que quer atualizar: ");
				String verifica = read.nextLine();
				System.out.println("\nDigite o nome do produto que entrará no lugar de "+verifica+" : ");
				String novo = read.nextLine();
				
				if(storage.contains(verifica))
				{
					storage.remove(verifica);
					storage.add(novo);
				}
				
				else
				{
					System.out.println("\nProduto não existente...");
				}
				System.out.println(storage);
				break;
				
			case 4:
				System.out.println("\nOs produtos do estoque são: ");
				System.out.println(storage);
				break;
				default:
					System.out.println("\nPrograma Finalizado!!!...");
				
			}
			
		}
		while(op!=0);
		}

	}
