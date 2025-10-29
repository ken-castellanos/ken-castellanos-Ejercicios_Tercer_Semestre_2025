package Clases;

public class Acumulador
{
    int fin;
    double sumatoria = 0;

    public Acumulador(int fi)
    {
        fin = fi;
    }

    public void formula()
    {
        for(int i = 1; i<=fin ; i++)
        {
            sumatoria += Math.pow(2*i+1, (double) 1 /(2*i+1));
        }
        System.out.println(sumatoria);
    }
}
