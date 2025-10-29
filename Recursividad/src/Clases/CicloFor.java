package Clases;

public class CicloFor {
    int rangoI;
    int rangoF;
    int incremento;

    public CicloFor(int in, int fi, int inc)
    {
        rangoI = in;
        rangoF = fi;
        incremento=inc;
    }
    public void ForHechizo()
    {
        if(rangoF <= rangoI)
        {
            System.out.println("Ciclo Finalizado");
            return;
        }
        System.out.println(rangoI);

        rangoI+=incremento;
        ForHechizo();
    }
}
