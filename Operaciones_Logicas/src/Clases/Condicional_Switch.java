package Clases;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Condicional_Switch {
    public static void x()
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println("MENU PRINCIPAL");
        System.out.println("1 SALUDOS");
        System.out.println("2 FIRMAS");
        System.out.println("3 DESCANSO");
        System.out.println("-1 SALIR");

        switch (x)
        {
            case 1:
            {
                System.out.println("Hola");
                break;
            }
            case 2:
            {
                System.out.println("Holis");
                break;
            }
            case 3:
            {
                System.out.println("Buenas");
                break;
            }
            case -1:
            {
                System.out.println("Hello");
                break;
            }
        }
    }
}
