package exercicios;

import java.util.Random;

public class Exercicio01 
{
    public static void main(String[] args)
    {
        Random pacoca = new Random();
        int[] notas = new int[20];
        int[] quantFinal = new int[11];
        
        for (int i = 0; i < notas.length; i++) 
        {
            notas[i] = pacoca.nextInt(101);
            if (notas[i] < 10) quantFinal[0]++;
            else if (notas[i] < 20) quantFinal[1]++;
            else if (notas[i] < 30) quantFinal[2]++;
            else if (notas[i] < 40) quantFinal[3]++;
            else if (notas[i] < 50) quantFinal[4]++;
            else if (notas[i] < 60) quantFinal[5]++;
            else if (notas[i] < 70) quantFinal[6]++;
            else if (notas[i] < 80) quantFinal[7]++;
            else if (notas[i] < 90) quantFinal[8]++;
            else if (notas[i] < 100) quantFinal[9]++;
            else quantFinal[10]++;
        }
        
        for (int i = 0; i < 100; i += 10) 
        {
            System.out.println("Houveram " + quantFinal[i / 10] + " notas no intervalo entre " + (i) + " e " + (i + 9) + ".");
        }
        System.out.println("Houveram " + quantFinal[10] + " notas 100.");
    }
}
