package Tareas;
import java.util.Scanner;

import javax.swing.*;


public class Condicional_if {
    static Scanner sc = new Scanner(System.in);
    public static void ej1() {
        System.out.println("Ingrese un numero para averiguar si es numero par o impar: ");
        int par_impar = sc.nextInt();
        if (par_impar % 2 == 0)
            System.out.println("Es par");
        else {
            System.out.println("Es impar");
        }
    }

    public static void ej2() {
        double total;
        System.out.println("Ingrese el nombre del producto: ");
        String producto = sc.nextLine();
        System.out.println("Ingrese el precio del producto: ");
        double precio = sc.nextInt();
        if (precio >= 100) {
            total = precio * 0.95;
            System.out.println("El precio es :" + total);
        } else if (precio <= 99) {
            total = precio;
            System.out.println("El precio es: " + total);
        }
    }


    //Ejercicio 3
    public static void ej3() {
        System.out.println("Ingrese el primer numero");
        int numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numero2 = sc.nextInt();

        if (numero1 > numero2) {
            System.out.println("El " + numero1 + " es mayor que " + numero2);
        } else if (numero1 < numero2) {
            System.out.println("El " + numero1 + " es menor que " + numero2);
        } else if (numero1 == numero2) {
            System.out.println("El " + numero1 + " es igual que " + numero2);
        }
    }

    // averiguar si el numero es positivo o negativo o igual a 0
    public static void ej4() {
        System.out.println("Ingrese el primer numero: ");
        int numeroa = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int numerob = sc.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        int numeroc = sc.nextInt();

        int mayor = numeroa;
        int menor = numeroa;

        if (numerob > mayor) {
            mayor = numerob;
        }
        if (numeroc > mayor) {
            mayor = numeroc;
        }
        if (numerob < menor) {
            menor = numerob;
        }
        if (numeroc < menor) {
            menor = numeroc;
        }
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
    }

    public static void ej5() {
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        if (edad < 18) {
            System.out.println("Eres menor de edad");
        } else if (edad >= 18 && edad <= 20) {
            System.out.println("Eres mayor de edad");
        } else if (edad >= 21 && edad <= 64) {
            System.out.println("Tienes la mayoria de la edad");
        } else if (edad >= 65) {
            System.out.println("Eres de la tercera edad");
        }
    }

    public static void ej6() {
        int resultado;
        System.out.println("Ingrese el primer numero");
        int numeroT = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numeroF = sc.nextInt();
        System.out.println("Escriba la operacion que quiere realizar: ");
        System.out.println("1: suma");
        System.out.println("2: resta");
        System.out.println("3: multiplicacion");
        System.out.println("4: division");
        int operacion = sc.nextInt();
        System.out.println(operacion);
        switch (operacion) {
            case 1:
                System.out.println("Suma");
                resultado = numeroT + numeroF;
                System.out.println("El resultado es: " + resultado);
                break;

            case 2:
                System.out.println("Resta");
                resultado = numeroT - numeroF;
                System.out.println("El resultado es: " + resultado);
                break;

            case 3:
                System.out.println("Multiplicacion");
                resultado = numeroT * numeroF;
                System.out.println("El resultado es: " + resultado);
                break;
            case 4:
                System.out.println("Division");
                if (numeroF == 0) {
                    System.out.println("ERROR NO SE PUEDE DIVIDIR CON CERO/ZERO/0");
                } else if (numeroF != 0) {
                    System.out.println("Division");
                    resultado = numeroT / numeroF;
                    System.out.println("El resultado es: " + resultado);
                }
            default:
                System.out.println("Expresion invalida");
                break;
        }
    }

    public static void ej7() {
        System.out.println("Ingrese el dia de semana en numeros(Numero del 1 al 7): ");
        int dia = sc.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("VALOR INDEFINIDA FAVOR ESCRIBIR NUMERO DEL 1 AL 7");
                break;
        }
    }
}