package exercicios;

import java.util.Random;

public class Exercicio03 
{

    public static void main(String[] args) 
    {
        Random pacoca = new Random();
        int[] notas = new int[20];
        int[] quantFinal = new int[6];
        double porcentagem = 0;
        
        for (int i = 0; i < notas.length; i++) 
        {
            notas[i] = 1 + pacoca.nextInt(5);
            quantFinal[notas[i]]++;
        }
        
        porcentagem = (quantFinal[4] + quantFinal[5]) / 20.0 * 100;
        
        for (int i = 1; i < 6; i++) {
            System.out.println("A quantidade de notas " + i + " : " + quantFinal[i]);
        }
        System.out.println("A porcentagem de notas 4 e 5 : " + porcentagem + "%");
    }
    
}
