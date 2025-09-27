package Clases;

public class Operaciones
{
    final float g = 9.81f;
    public float vfinal(float vinicial, float tiempo)
    {
        return vinicial + g * tiempo;
    }

    public float altura(float altura_inicial,float vinicial, float tiempo)
    {
        return altura_inicial+(vinicial*tiempo)+(0.5f*(g*tiempo*tiempo));
    }
}
