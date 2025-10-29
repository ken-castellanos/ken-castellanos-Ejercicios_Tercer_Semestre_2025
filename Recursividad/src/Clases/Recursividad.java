package Clases;

public class Recursividad
{
    // Cuenta regresiva desde un número dado hasta 0
    public void cuentaRegresiva(int numero)
        {
            // Al llegar a 0, imprime "¡Despegue!" y termina la recursión
            if(numero == 0)
            {
                System.out.println("¡Despegue!");
                return;
            }

            // Imprime el número actual y llama a sí misma con el número decrecido en 1
            System.out.println(numero);
            cuentaRegresiva(numero-1);
    }
}