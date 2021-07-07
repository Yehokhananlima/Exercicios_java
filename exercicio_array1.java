package familia28;

import java.util.Scanner;


public class  exercicio_array1
{

    	public static void main(String[] args) 
    {
        // TODO Auto-generated method stub
        int[] A = { 1, 0, 5, -2, -5, 7 };

        int x, soma, res = 0;

        Scanner leia = new Scanner(System.in);

        for (x = 0; x < 6; x++) 
        {
            res = A[0] + A[1] + A[5];

            A[4] = 100;

        }
        System.out.println("\nResultado: " + res);

        for (x = 0; x < 6; x++)

        {
        System.out.println("\nPosição: " + x + " = " + A[x]);
        }

    }

}