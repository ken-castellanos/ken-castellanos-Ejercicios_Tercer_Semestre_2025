package Clases;

import java.util.Scanner;

public class CondicionalIF
{
    public static void condicionalIf()
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if(x%2==0)
        {
            System.out.println("El valor "+x+" es par");
        }
        else
        {
            System.out.println("El valor "+x+" es impar");
        }
    }
}
