package vehicles;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
* El objetivo principal de la clase es llamar los metodos de las otras clases,
* permitir crear instancias de las clases y ejecutar el programa para comprobar
* su funcionalida
*
* @version 01-01-01 2022-02-18 
* 
* @author Jose Colina josecolinamartinez@gmail.com
*
* @since 01
*/
public class NewVehicles {

    /**
    * Metodo que recibe la opcion ingresada por el usuario y la lista de 
    * vehiculos, dependiendo de la opcion indicada se crea un nuevo vehiculo
    * de la clase seleccionada
    *
    * @param option contiene la opcion del usuario
    * @param vehicleList contiene la informacion del ArrayList de vehiculos
    *
    * @author Jose Colina josecolinamartinez@gmail.com
    *
    * @since 01
    *
    */
    public static void createdVehicle(int option, List vehicleList) {
        switch (option) {

            case 1 -> {

                String name = JOptionPane.showInputDialog("ingrese la marca del auto");
                
                int numberOfDoors = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de puertas"));
                
                int wheels = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de puertas"));

                int powerCard = Integer.parseInt(JOptionPane.showInputDialog("ingrese la potencia del automovil"));

                int numberSeats = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de asientos del auto"));

                int numberPassengers = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de pasajeros"));

                Vehicle card1 = new Card(numberOfDoors, numberPassengers, powerCard, numberSeats, wheels, name);
                
                card1.isCrew(numberPassengers);

                vehicleList.add(card1);
                break;

            }

            case 2 -> {
                String name = JOptionPane.showInputDialog("ingrese la marca del auto");
                
                int wheels = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de puertas"));

                int powerCard = Integer.parseInt(JOptionPane.showInputDialog("ingrese la potencia del automovil"));

                int numberSeats = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de asientos del auto"));

                int numberPassengers = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de pasajeros"));

                Vehicle truck1 = new Truck(numberPassengers, powerCard, numberSeats, wheels, name);
                
                truck1.isCrew(numberPassengers);

                vehicleList.add(truck1);
                break;
            }
            
            case 3 ->{
                String name = JOptionPane.showInputDialog("ingrese la marca del auto");
                
                int wheels = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de puertas"));

                int powerCard = Integer.parseInt(JOptionPane.showInputDialog("ingrese la potencia del automovil"));

                int numberSeats = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de asientos del auto"));

                int numberPassengers = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de pasajeros"));

                Vehicle motorcycle1 = new Motorcycle(numberPassengers, powerCard, numberSeats, wheels, name);

                motorcycle1.isCrew(numberPassengers);

                vehicleList.add(motorcycle1);
                break;
            }
            
            case 4 -> {
            
                String name = JOptionPane.showInputDialog("ingrese la marca del auto");
                
                int wheels = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de puertas"));

                int powerCard = Integer.parseInt(JOptionPane.showInputDialog("ingrese la potencia del automovil"));

                int numberSeats = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de asientos del auto"));

                int numberPassengers = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de pasajeros"));

                Vehicle bike1 = new Bike(numberPassengers, powerCard, numberSeats, wheels, name, 26);

                bike1.isCrew(numberPassengers);

                vehicleList.add(bike1);
                break;
            }
            
            case 5-> {
                System.out.println("vehicleList = " + vehicleList.toString());
                break;
            }
            default -> {
                System.out.println("termino");
            }

        }
    }

    public static void main(String[] args) {
        
        /**
         * se crea un ArrayList que almacenara la informacion de los vehiculos
         * otergada por el usuario.
         */
        List vehicleList = new ArrayList();
        int option = 0;
        
        /**
         * menu de preguntas al usuario para conocer el tipo de vehiculo a crear
         */
        while (option < 6) {
            option = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                  Que tipo de vehiculo quiere crear: 
                                                                  1- Crear un carro
                                                                  2- crear un camion
                                                                  3- crear una moto
                                                                  4- crear una bicicleta
                                                                  5- mostrar mis autos
                                                                  6- salir"""));
            if (option < 6) {
                createdVehicle(option, vehicleList);
            }

        }
    }

}
