package exercicios;

import java.util.Random;

public class Exercicio05 
{

    public static void main(String[] args) 
    {
        Random pacoca = new Random();
        int num = 1;
        int i = 0;
        int check = 0;
        int[] vetor = new int[5];
        
        while (vetor[4] == 0)
        {
            num = 11 + pacoca.nextInt(110);
            
            for (int j = 0; j < 5; j++) {
                if (num == vetor[j]) check++;
            }
            
            if (check == 0) 
            {
                vetor[i] = num;
                i++;
            }
            else check = 0;
        }
        
        for (int j = 0; j < 5; j++) {
            System.out.println(vetor[j]);
        }
    }
    
}
