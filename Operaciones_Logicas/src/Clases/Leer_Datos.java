package Clases;

import java.util.Scanner;

public class Leer_Datos
{
    public static void x()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero: ");
        int num = sc.nextInt();
        System.out.println("Numero: ");
        double num2 = sc.nextFloat();

        System.out.println("Texto: ");
        String texto = sc.next();

        System.out.println("Entero "+num+" Decimal "+num2+" años");
        sc.close();
    }
}
