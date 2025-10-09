import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int submenu = 0;
        int menu = 0;
        while(menu != -1)
        {
            System.out.println("Escribir que menu quiere ver:");
            System.out.println("1: Bucle for");
            System.out.println("2: Condicional if");
            System.out.println("-1: Salir");
            menu = sc.nextInt();
            if(menu == 1)
            {
                submenu = 0;
                while (submenu != -1)
                {
                    System.out.println("Escribir el numero del ejercicio(del 1 al 10): ");
                    System.out.println("-1 para salir");

                    submenu = sc.nextInt();
                    if (submenu == 1)
                    {
                        System.out.println("Imprime todos los números del 1 al 100.");
                        Tareas.Bucle_for.ej1();
                    }
                    if (submenu == 2)
                    {
                        System.out.println("Calcula la suma de los números del 1 al 50 e imprime el resultado.");
                        Tareas.Bucle_for.ej2();
                    }

                    if (submenu == 3)
                    {
                        System.out.println("Pide un número al usuario e imprime su tabla de multiplicar del 1 al 10.");
                        Tareas.Bucle_for.ej3();
                    }

                    if (submenu == 4)
                    {
                        System.out.println("Muestra todos los números pares del 2 al 100.");
                        Tareas.Bucle_for.ej4();
                    }

                    if (submenu == 5)
                    {
                        System.out.println("Pide un número e imprime su factorial (ejemplo: 5! = 5×4×3×2×1).");
                        Tareas.Bucle_for.ej5();
                    }

                    if (submenu == 6)
                    {
                        System.out.println("Calcula por separado la suma de los números pares y la de los impares entre 1 y 100.");
                        Tareas.Bucle_for.ej6();
                    }

                    if (submenu == 7)
                    {
                        System.out.println("Pide un número e imprime cuántos múltiplos de ese número hay entre 1 y 100.");
                        Tareas.Bucle_for.ej7();
                    }

                    if (submenu == 8)
                    {
                        System.out.println("Pide una palabra y usa un for para imprimirla al revés.");
                        Tareas.Bucle_for.ej8();
                    }

                    if (submenu == 9)
                    {
                        System.out.println("Muestra todos los números primos entre 1 y 100.");
                        Tareas.Bucle_for.ej9();
                    }
                    if (submenu == 10)
                    {
                        System.out.println("Dibuja una pirámide de asteriscos de altura n (donde n lo da el usuario).");
                        Tareas.Bucle_for.ej10();
                    }
                }
            }


            if(menu == 2)
            {
                submenu = 0;
                while (submenu != -1)
                {
                    System.out.println("Escribir el numero del ejercicio(Del 1 al 7): ");
                    System.out.println("-1 para salir");

                    submenu = sc.nextInt();
                    if (submenu == 1)
                    {
                        System.out.println("Programa que pida al usuario ingresar un numero e identifique si el numero es par o impar");
                        Tareas.Condicional_if.ej1();
                    }

                    if (submenu == 2)
                    {
                        System.out.println("-pida al usuario nombre del producto\n" +
                                "-Pida al usuario precio del producto\n" +
                                "-calcule el subtotal\n" +
                                "-si el producto es mayor a 100 que se aplique un descuento del 5%\n" +
                                "-calcule el total a pagar");
                        Tareas.Condicional_if.ej2();
                    }

                    if (submenu == 3)
                    {
                        System.out.println("Programa que pida dos números y que muestre el mayor y el menor");
                        Tareas.Condicional_if.ej3();
                    }

                    if (submenu == 4)
                    {
                        System.out.println("Programa que pida tres números y que muestre el mayor y el menor");
                        Tareas.Condicional_if.ej4();
                    }

                    if (submenu == 5)
                    {
                        System.out.println("Programa que pida al usuario su edad, realizar las siguientes validaciones:\n" +
                                "-Si tiene entre 18 años 20 → \"Eres mayor de edad\"\n" +
                                "-Si tiene entre 21 años o 64 → \"Tienes la mayoría de edad\"\n" +
                                "-Si tiene 65 años o más → \"Eres de la tercera edad\"\n" +
                                "-Si tiene menos de 18 años → \"Es menor de edad\"");
                        Tareas.Condicional_if.ej5();
                    }

                    if (submenu == 6)
                    {
                        System.out.println("Programa que pida dos números al usuario, y que seleccione la operacion que desea realizar:\n" +
                                "-suma(+)\n" +
                                "-Resta (-):\n" +
                                "-Multiplicación (*):\n" +
                                "-División (/):\n" +
                                "-Verificación especial: Si intenta dividir por cero, muestra error y termina el programa");
                        Tareas.Condicional_if.ej6();
                    }

                    if (submenu == 7)
                    {
                        System.out.println("Pide al usuario que ingrese un número del 1 al 7\n" +
                                "-Si el número es 1 → muestra \"Lunes\"\n" +
                                "-Si el número es 2 → muestra \"Martes\"\n" +
                                "-Si el número es 3 → muestra \"Miércoles\"\n" +
                                "-Si el número es 4 → muestra \"Jueves\"\n" +
                                "-Si el número es 5 → muestra \"Viernes\"\n" +
                                "-Si el número es 6 → muestra \"Sábado\"\n" +
                                "-Si el número es 7 → muestra \"Domingo\"\n" +
                                "-Manejo de errores:\n" +
                                "-Si el número no está entre 1 y 7 → muestra \"Número no válido\"");
                        Tareas.Condicional_if.ej7();
                    }
                        }
                    }
                }
            }
        }
