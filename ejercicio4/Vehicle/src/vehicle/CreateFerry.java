package vehicle;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * El objetivo principal de la clase es llamar los metodos de las otras clases,
 * permitir crear instancias de las clases y ejecutar el programa para comprobar
 * su funcionalida
 *
 * @version 01-01-01 2022-02-14
 *
 * @author Jose Colina josecolinamartinez@gmail.com
 *
 * @since 01
 */
public class CreateFerry {

    /**
     * [Detalle el objetivo del método. Metodo creado con el fin de recorrer el
     * ArrayList, obtener los datos del mismo y agregar una cancion dependiendo
     * de la opcion ingresada por el usuario ]
     *
     * @param option contiene la opcion elegida por el usuario
     * @param list contiene el nuevo arreglo donde se alojaran los ferrys
     *
     * @author Jose Colina josecolinamartinez@gmail.com
     *
     * @since 01
     *
     */
    public static void createFerry(int option, List list) {
        switch (option) {

            case 1 -> {
                int numberPassengers = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de pasajeros en el ferry"));

                int powerFerry = Integer.parseInt(JOptionPane.showInputDialog("ingrese la potencia del ferry"));

                int numberSeats = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de asientos del ferry"));

                String name = JOptionPane.showInputDialog("ingrese el nombre del ferry");

                Vehicle f1 = new Vehicle(numberPassengers, powerFerry, numberSeats, name);

                f1.speed(powerFerry);
                f1.isCrew(numberPassengers);

                list.add(f1);

            }

            case 2 -> {
                System.out.println("\n" + list.toString());
            }
            default -> {
                System.out.println("termino");
            }

        }
    }

    public static void main(String[] args) {

        /**
         * Metodo creado con el fin de dar a elegir al usuario las opciones 
         * presentes en el programa, ademas pasa parametros requeridos por
         * el metodo createFerry
         *
         * @author Jose Colina josecolinamartinez@gmail.com
         *
         * @since 01
         *
         */
        List listFerrys = new ArrayList();
        int option = 0;
        while (option < 3) {
            option = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                  Elija una opcion: 
                                                                  1- Crear un Ferry
                                                                  2- mostrar mi flota de Ferrys
                                                                  3- salir"""));
            if (option < 3) {
                createFerry(option, listFerrys);
            }

        }

    }

}
