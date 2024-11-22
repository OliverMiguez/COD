import java.util.Scanner;//permite utilizar el metodo scanner
/**
 * Maquina de cafe
 */
public class Main {
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
        //opciones de productos
            switch (op) {
                case 1:
                    System.out.println("El precio es 1.25€");
                    System.out.println("Introduce el dinero: ");
                    double dinero = sc.nextDouble();//almacena la info introducida
                    if (dinero >= 1.25) {
                        System.out.println("Dinero suficiente para el cafe");
                        azucar(sc);
                        cambio(dinero);
                        break;
                    }//end if
                case 2:
                    System.out.println("El precio es 1.55");
                    System.out.println("Introduce el dinero: ");
                    dinero = sc.nextDouble();
                    if(dinero>=1.55){
                        System.out.println("Dinero suficiente para el chocolate");
                        azucar(sc);
                        cambio2(dinero);
                        break;
                    }//end if
                case 3:
                    System.out.println("El precio es 1.25");
                    System.out.println("Introduce el dinero: ");
                    dinero = sc.nextDouble();
                    if(dinero>=1.25){
                        System.out.println("Dinero suficiente para el chocolate");
                        azucar(sc);
                        cambio(dinero);
                        break;
                    }//end if
            }//end switch
    }//end main
    /**
     * Funcion que pregunta si quieres azucar
      */
    static void azucar(Scanner sc ) {
        System.out.println("Quieres azucar 1-si, 2-no");
        int azucar = sc.nextInt();
        if(azucar == 1){
            System.out.println("Cuanto azucar quieres del 1 al 5: ");
            int cantidad = sc.nextInt();
            if(cantidad<5 && cantidad>-1){
                System.out.println("Sirviendo "+ cantidad + " terrones de azucar");
            }//end if
        }//end if
        else if (azucar == 2) {
            System.out.println("Sin azucar");
        }//end else if
    }//end azucar
    /**
     * Funcion que te devuelve el cambio.
     * @param dinero
     */
    static  void cambio(double dinero){
        if(dinero > 1.25){
            double cambio = dinero - 1.25;
            System.out.println("El cambio es: "+ cambio);
        }//emd if
    }//end cambio
    static  void cambio2(double dinero) {
        if (dinero > 1.55) {
            double cambio2 = dinero - 1.55;
            System.out.println("El cambio es: " + cambio2);
        }//emd if
    }//end cambio2
}//end class
