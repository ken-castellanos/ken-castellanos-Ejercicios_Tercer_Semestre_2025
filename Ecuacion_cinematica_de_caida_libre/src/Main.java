import Clases.Operaciones;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Operaciones op = new Operaciones();
        System.out.println("Altura: "+op.altura(0, 0, 6));
        System.out.println("Velocidad final: "+op.vfinal(0,6));
    }
}