import java.util.Scanner;
public class PromNotas
{

    public static void main(String[] args)
    {
        double notas, prom, suma = 0;
        byte i;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese sus 5 notas: ");
        for(i = 0; i < 5; i++)
        {
            notas = entrada.nextDouble();
            suma += notas;
        }

        prom = suma / 5;

        System.out.println("El promedio de las 5 notas es = " + prom + " %");

        if (prom >= 70)
        {
            System.out.println("  Aprobado.");
        }
        else
        {
            System.out.println("  Reprobado.");
        }
        entrada.close();
    }
}