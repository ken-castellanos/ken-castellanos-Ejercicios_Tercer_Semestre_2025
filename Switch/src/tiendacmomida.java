import javax.swing.JOptionPane;

public class tiendacmomida
{
    public static void main(String[] args)
    {

        System.out.println("Menu");
        System.out.println("1. Pupusas");
        System.out.println("2. Baleadas");
        System.out.println("3. Pollo ");
        String op=JOptionPane.showInputDialog("Ingrese la opcion");
        switch (op)
        {
            case "Baleadas":
                System.out.println("Producto agregado");
                String opci=JOptionPane.showInputDialog("Desea agregar bebida?(Si/No)");


                if("Si".equals(opci))
                {
                    System.out.println("Bebida agregada");
                    System.out.println("Pedido: ");
                    System.out.println("1.Baleadas");
                    System.out.println("2.Bebdia: Si");
                }
                else
                {
                    System.out.println("Pedido completo");
                    System.out.println("Pedido: ");
                    System.out.println("1.Baleadas");
                    System.out.println("2.Bebdia: No");
                }


                break;
            case "Pupusas":
                System.out.println("Producto agregado");
                String opci0=JOptionPane.showInputDialog("Desea agregar bebida?(Si/No)");


                if("Si".equals(opci0))
                {
                    System.out.println("Bebida agregada");
                    System.out.println("Pedido: ");
                    System.out.println("1.Pupusas");
                    System.out.println("2.Bebdia: Si");
                }
                else
                {
                    System.out.println("Pedido completo");
                    System.out.println("Pedido: ");
                    System.out.println("1.Pupusas");
                    System.out.println("2.Bebdia: No");
                }




                break;

            case "Pollo":
                System.out.println("Producto agregado");
                String opcii=JOptionPane.showInputDialog("Desea agregar bebida?(Si/No)");


                if("Si".equals(opcii))
                {
                    System.out.println("Bebida agregada");
                    System.out.println("Pedido: ");
                    System.out.println("1.Pollo");
                    System.out.println("2.Bebdia: Si");
                }
                else
                {
                    System.out.println("Pedido completo");
                    System.out.println("Pedido: ");
                    System.out.println("1.Pollo");
                    System.out.println("2.Bebdia: No");
                }
                break;
            default:
                System.out.println("Opcion no valida");

                break;
        }

    }
}
