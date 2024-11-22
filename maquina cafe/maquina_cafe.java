import java.util.Scanner;
/**
 * Maquina de cafe
 */
public class maquina_cafe {
    /**
     * Metodo principal del programa
     *
     * @author Oliver Miguez Alonso
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//llama al metodo scanner

    //Opciones de consumo
        System.out.println("1-cafe,2-chocolate,3-te: ");
        System.out.println("Elige una opcion:");
        int op = sc.nextInt();

        //variables
        double dinero;//dinero introducido
        double precio = 1.25;//precio productos

        //Introduces dinero
        System.out.println("Introduce el dinero: ");
        dinero = sc.nextDouble();//almacena la info introducida

        //opciones de productos
        while (dinero < precio) {//en caso de no introducir sufuciente dinero
            System.out.println("Introduce mas dinero");
            double engadir = sc.nextDouble();
            dinero = dinero + engadir;
        }//end while

        //en caso de que si haya dinero
        if (dinero >= precio) {

            //todas las distintas opciones de elección
            switch (op) {
                case 1:
                    System.out.println("El precio es 1.25€");
                    System.out.println("Dinero suficiente para el cafe");
                    azucar(sc);
                    cambio(dinero, precio);
                    break;
                case 2:
                    System.out.println("El precio es 1.25");
                    System.out.println("Dinero suficiente para el chocolate");
                    azucar(sc);
                    cambio(dinero, precio);
                    break;
                case 3:
                    System.out.println("El precio es 1.25");
                    System.out.println("Dinero suficiente para el te");
                    azucar(sc);
                    cambio(dinero, precio);
                    break;
            }//end switch
        }//end if
    }//end main
    /**
     * Funcion que pregunta si quieres azucar
      */
    static void azucar(Scanner sc ) {
        System.out.println("Quieres azucar 1-si, 2-no");//pregunta si quieres azucar
        int azucar = sc.nextInt();

        //si quieres azucar
        if(azucar == 1){
            System.out.println("Cuanto azucar quieres del 1 al 5: ");
            int cantidad = sc.nextInt();
            if(cantidad<5 && cantidad>-1){
                System.out.println("Sirviendo "+ cantidad + " terrones de azucar");
            }//end if
        }//end if

        //si no quieres azucar
        else if (azucar == 2) {
            System.out.println("Sin azucar");
        }//end else if
    }//end azucar

    /**
     * Funcion que te devuelve el cambio.
     * @param dinero dinero que introduzca el usuario
     */
    static void cambio(double dinero, double precio) {
        if (dinero > precio) {
            double cambio = dinero - 1.25;
            System.out.println("El cambio es: "+ cambio);
        }//emd if
    }//end cambio

}//end class
