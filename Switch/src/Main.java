import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        // Menu operaciones matematicas
        float numero1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el numero 1: "));
        float numero2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el numero 2: "));

        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Operaciones matematicas\n1.Suma\n2.Resta\n3.Multiplicacion\n4.Division\nOpcion:"));

        switch (opcion)
        {
            case 1:
                JOptionPane.showMessageDialog(null, "El resultado es " + (numero1 + numero2));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "El resultado es " + (numero1 - numero2));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "El resultado es " + (numero1 * numero2));
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "El resultado es " + (numero1 / numero2));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida.");
        }
    }
}