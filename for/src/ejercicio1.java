import java.util.Scanner;

public class ejercicio1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = sc.nextInt();
        System.out.println("\nTabla de multiplicar del "+numero+":");
        for (int i=1;i<=10;i++)
        {
            System.out.println(numero+"*"+i+"="+(numero*i));
        }
    }
}
