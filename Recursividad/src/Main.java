//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import Clases.CicloFor;
import Clases.CicloWhile;
import Clases.Recursividad;

public class Main
{
    public static void main(String[] args)
    {
        Recursividad r = new Recursividad();
        r.cuentaRegresiva(10);

        System.out.println("Ciclo for");
        CicloFor cf = new CicloFor(0, 10, 1);
        cf.ForHechizo();

        System.out.println("Ciclo while");
        CicloWhile cw = new CicloWhile(0, 100, 3);
        cw.While();

    }
}