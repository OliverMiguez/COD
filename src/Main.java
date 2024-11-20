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
                        azucar();
                    break;
                    }//end if

                case 2:
                    System.out.println("El precio es 1.55");
                    System.out.println("Introduce el dinero: ");
                    dinero = sc.nextDouble();
                    if(dinero>=1.55){
                        System.out.println("Dinero suficiente para el chocolate");
                        azucar();
                        cambio(dinero);
                    }//end if
                case 3:
                    System.out.println("El precio es 1.25");
                    System.out.println("Introduce el dinero: ");
                    dinero = sc.nextDouble();
                    if(dinero>=1.25){
                        System.out.println("Dinero suficiente para el chocolate");
                        azucar();
                        cambio(dinero);
                    }//end if

            }//end switch


    }//end main

    /**
     * Funcion que pregunta si quieres azucar
      */
    static void azucar() {
        System.out.println("Quieres azucar: s/n ");
        System.out.println("si");
        System.out.println("Sirviendo azucar");

    }//end azucar

    /**
     * Funcion que te devuelve el cambio
     * @param dinero
     */
    static  void cambio(double dinero){

    }//end cambio

}//end class
