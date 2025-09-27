import javax.swing.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
    {
    public static void main(String[] args)
    {
        //Ejercicio 1
        {
            System.out.println("Ingrese un numero: ");
            int par_impar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            if (par_impar % 2 == 0)
                System.out.println("Es par");
            else {
                System.out.println("Es impar");
            }
        }
        //Ejercicio 2
        {
            double total;
            System.out.println("Ingrese el nombre del producto: ");
            String producto = JOptionPane.showInputDialog("Ingrese el nombre del producto: ");
            System.out.println(producto);
            System.out.println("Ingrese el precio del producto: ");
            double precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del producto"));
            if (precio >= 100) {
                total = precio * 0.95;
                System.out.println("El precio es :" + total);
            } else if (precio <= 99) {
                total = precio;
                System.out.println("El precio es: " + total);
            }
        }
        //Ejercicio 3
        {
            System.out.println("Ingrese el primer numero");
            int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
            System.out.println(numero1);
            System.out.println("Ingrese el segundo numero");
            int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
            System.out.println(numero2);

            if (numero1 > numero2) {
                System.out.println("El " + numero1 + " es mayor que " + numero2);
            } else if (numero1 < numero2) {
                System.out.println("El " + numero1 + " es menor que " + numero2);
            } else if (numero1 == numero2) {
                System.out.println("El " + numero1 + " es igual que " + numero2);
            }
        }

        //Ejercicio 4
        {
            System.out.println("Ingrese el primer numero: ");
            int numeroa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
            System.out.println(numeroa);
            System.out.println("Ingrese el segundo numero: ");
            int numerob = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
            System.out.println(numerob);
            System.out.println("Ingrese el tercer numero: ");
            int numeroc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero: "));
            System.out.println(numeroc);

            int mayor = numeroa;
            int menor = numeroa;

            if (numerob > mayor)
            {
                mayor = numerob;
            }
            if (numeroc > mayor)
            {
                mayor = numeroc;
            }
            if (numerob < menor)
            {
                menor = numerob;
            }
            if (numeroc < menor)
            {
                menor = numeroc;
            }
            System.out.println("El numero mayor es: " +mayor);
            System.out.println("El numero menor es: " +menor);
        }

        //Ejercicio 5
        {
            System.out.println("Ingrese su edad: ");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
            System.out.println(edad);
            if(edad < 18)
            {
                System.out.println("Eres menor de edad");
            }
            else if(edad >= 18 && edad <= 20)
            {
                System.out.println("Eres mayor de edad");
            }
            else if(edad >= 21 && edad <= 64)
            {
                System.out.println("Tienes la mayoria de la edad");
            }
            else if(edad >= 65)
            {
                System.out.println("Eres de la tercera edad");
            }
        }

        //Ejercicio 6
        {
            int operacion=0;
            int resultado;
            System.out.println("Ingrese el primer numero");
            int numeroT = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
            System.out.println(numeroT);
            System.out.println("Ingrese el primer numero");
            int numeroF = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
            System.out.println(numeroF);
            System.out.println("Escriba la operacion que quiere realizar: ");
            System.out.println("1: suma");
            System.out.println("2: resta");
            System.out.println("3: multiplicacion");
            System.out.println("4: division");
            int operacion = Integer.parseInt(JOptionPane.showInputDialog("Escriba la operacion que quiere realizar: (1: suma, 2: resta, 3: multiplicacion, 4: division)\""));
            System.out.println(operacion);
            switch (operacion)
            {
                case 1:
                    System.out.println("Suma");
                    resultado = numeroT + numeroF;
                    System.out.println("El resultado es: " + resultado);
                    break;

                case 2:
                    System.out.println("Resta");
                    resultado = numeroT - numeroF;
                    System.out.println("El resultado es: " + resultado);
                    break;

                    case 3:
                        System.out.println("Multiplicacion");
                        resultado = numeroT * numeroF;
                        System.out.println("El resultado es: " + resultado);
                        break;
                        case 4:
                        System.out.println("Division");
                        if (numeroF == 0) {
                            System.out.println("ERROR NO SE PUEDE DIVIDIR CON CERO/ZERO/0");
                            System.exit(0);
                        } else if (numeroF != 0) {
                            System.out.println("Division");
                            resultado = numeroT / numeroF;
                            System.out.println("El resultado es: " + resultado);
                        }
                    default:
                        System.out.println("Expresion invalida");

                        break;
                }
        }

        //Ejercicio 7
        {
            System.out.println("Ingrese el dia de semana en numeros(Numero del 1 al 7): ");
            String dia = JOptionPane.showInputDialog("Ingrese el dia de semana en numeros(Numero del 1 al 7): ");
            System.out.println(dia);
            switch (dia)
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("VALOR INDEFINIDA FAVOR ESCRIBIR NUMERO DEL 1 AL 7");
                break;

        }
    }
    }
