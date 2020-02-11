package exercicios;

import java.util.ArrayList;

public class Exercicio02 
{

    public static void main(String[] args) 
    {
        int[] v1 = new int[50];
        ArrayList<Integer> v2 = new ArrayList();
        
        System.out.print("V1 : ");
        
        for (int i = 0; i < 50; i++) {
            v1[i] = i + 1;
            System.out.print(v1[i] + " ");
            
            if (verPrimo(v1[i])) 
            {
                v2.add(v1[i]);
            }
        }
        
        System.out.print("\nV2 : ");
        
        for (int i = 0; i < v2.size(); i++) {
            System.out.print(v2.get(i) + " ");
        }
    }

    public static boolean verPrimo(int num) 
    {
        int contador = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                contador++;
            }
        }

        if (contador == 2) {
            return true;
        }
        return false;
    }
}
