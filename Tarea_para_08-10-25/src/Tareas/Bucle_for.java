package Tareas;
import java.util.Scanner;
import javax.swing.*;

public class Bucle_for {
    static Scanner sc = new Scanner(System.in);

    public static void ej1() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public static void ej2() {
        int numero = 0;
        for (int i = 0; i <= 50; i++) {
            numero += i;
        }
        System.out.println(numero);
    }

    public static void ej3()
    {
        System.out.println("Favor escribir un numero para escribir la tabla de multiplicacion");
        int tabla = sc.nextInt();
        System.out.println(tabla);
        for (int i = 1; i <= 10; i++) {
            System.out.println(tabla * i);
        }
    }

    public static void ej4() {
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void ej5()
    {
        System.out.println("Favor escribir un numero para sacarle el factorial");
        int n = sc.nextInt();
        System.out.println(n);
        long factorial = 1;
        for(int i=1; i<=n; i++)
        {
            factorial *= i;
        }
        System.out.println(factorial);
    }

    public static void ej6()
    {
        int par = 0;
        int impar = 0;

        for(int i=1; i<=100; i++)
        {
            if(i%2==0)
            {
                par += i;
            }
            else
            {
                impar += i;
            }
        }
        System.out.println("El total de la suma de los numeros pares es: "+par);
        System.out.println("El total de la suma de los numeros impares es: "+impar);
    }

    public static void ej7()
    {
        System.out.print("Introduce un número: ");
        int multiplo = sc.nextInt();

        // Validación: evitar división por cero
        if (multiplo == 0) {
            System.out.println("No se pueden calcular múltiplos de 0.");
        } else {
            // El número de múltiplos de 'numero' entre 1 y 100 es: 100 / |numero|
            int cantidad = 100 / Math.abs(multiplo);
            System.out.println("Hay " + cantidad + " múltiplos de " + multiplo + " entre 1 y 100.");
        }
    }

    public static void ej8()
    {
        System.out.println("Favor escribir una palabra");
        String original = sc.nextLine();

        String invertido = "";
        for(int i = original.length()-1; i>=0; i--)
        {
            invertido += original.charAt(i);
        }
        System.out.println("La palabra invertida es: "+invertido);
    }

    public static void ej9()
    {
                System.out.println("Números primos entre 1 y 100:");

                for (int primo = 2; primo <= 100; primo++)
                {
                    if (esPrimo(primo))
                    {
                        System.out.print(primo + " ");
                    }
                }
                System.out.println(); // Salto de línea al final
            }

            // Método para verificar si un número es primo
            public static boolean esPrimo(int n)
            {
                if (n <= 1) {
                    return false;
                }
                if (n == 2) {
                    return true;
                }
                if (n % 2 == 0) {
                    return false;
                }
                // Solo revisamos divisores impares hasta la raíz cuadrada de n
                for (int i = 3; i * i <= n; i += 2) {
                    if (n % i == 0) {
                        return false;
                    }
                }
                return true;
            }
            public static void ej10()
            {
                System.out.print("Introduce la altura de la pirámide (n): ");
                int n = sc.nextInt();

                // Validación básica
                if (n <= 0)
                {
                    System.out.println("La altura debe ser un número positivo.");
                    return;
                }

                for (int fila = 1; fila <= n; fila++)
                {
                    // Imprimir espacios en blanco antes de los asteriscos
                    for (int espacio = 1; espacio <= n - fila; espacio++)
                    {
                        System.out.print(" ");
                    }

                    // Imprimir asteriscos: en la fila 'fila', hay (2 * fila - 1) asteriscos
                    for (int asterisco = 1; asterisco <= 2 * fila - 1; asterisco++)
                    {
                        System.out.print("*");
                    }

                            // Salto de línea al final de cada fila
                            System.out.println();
                }
            }
}