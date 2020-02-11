package exercicios;

public class Exercicio04 
{

    public static void main(String[] args) 
    {
        int max = 1;
        
        System.out.println("(a)");
        for (int i = 0; i < 10; i++) 
        {
            for (int j = 0; j < max; j++) {
                System.out.print("*");
            }
            System.out.println("");
            if (max < 10) max++;
        }
        
        System.out.println("(b)");
        
        for (int i = 0; i < 10; i++) 
        {
            for (int j = 0; j < max; j++) {
                System.out.print("*");
            }
            System.out.println("");
            if (max > 0) max--;
        }
        
        System.out.println("(c)");
        int min = 0;
        max = 10;
        
        for (int i = 0; i < 10; i++) 
        {
            for (int j = 0; j < min; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < max; j++) {
                System.out.print("*");
            }
            System.out.println("");
            if (max > 1) max--;
            min++;
        }
        
        System.out.println("(d)");
        
        for (int i = 0; i < 10; i++) 
        {
            for (int j = 0; j < min; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < max; j++) {
                System.out.print("*");
            }
            System.out.println("");
            if (min > 1) min--;
            max++;
        }
    }
    
}
