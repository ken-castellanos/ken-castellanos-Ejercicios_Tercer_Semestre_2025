import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        //Ejercicio 1
        //Si el numero es mayor o menor que 10
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero: "));
        if(num >= 10)
        {
            System.out.println("Es mayor que 10");
        }
        else
        {
            System.out.println("Es menor que 10");
        }

        //Ejercicio 2
        //Si el usuario es mayor de edad o no
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
        if(edad >= 18)
        {
            System.out.println("Eres mayor de edad");
        }
        else
        {
            System.out.println("Eres menor de edad");
        }

        //Ejercicio 3
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");

                if(nombre.equals("Leo"))
                {
                    System.out.println("La palabra es correcta");
                }
                else
                {
                    System.out.println("La palabra es incorrecta");
                }

        //Ejercicio 4
        // averiguar si el numero es positivo o negativo o igual a 0
        int number;
        number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        if (number > 0)
        {
            System.out.println("El numero es positivo");
        }
        else if(number < 0)
        {
            System.out.println("El numerp es negativo");
        }
        else
        {
            System.out.println("El numero es 0");
        }
    }



}