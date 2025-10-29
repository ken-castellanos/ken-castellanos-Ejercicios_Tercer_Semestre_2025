package Clases;

public class CicloWhile
{
    int inicio;
    int finalizacion;
    int aumento;

    public CicloWhile(int i, int f, int a)
    {
        inicio = i;
        finalizacion = f;
        aumento = a;
    }
    public void While()
    {
        if(finalizacion <= inicio)
        {
            System.out.println("Finn");
            return;
        }
        System.out.println(inicio);
        inicio+=aumento;
        While();
    }
}
