public class Main
{
    public static void main(String[] args)
    {
        //FizzBuzz el reto es recorre los numeros del 1 al 100
        // reemplasando los multiplos de 3 por Fizz,
        // los multiplos de 5 por Buzz y los multiplos de 3 y 5 por FizzBuzz
        for (int i=1;i<=100;i++ )
        {
            if (i%3==0 && i%5==0)
            {
                System.out.println("FizzBuzz");
            }
            else if (i%3==0)
            {
                System.out.println("Fizz");
            }
            else if (i%5==0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }

    }
}