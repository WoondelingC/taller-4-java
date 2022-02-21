package vehicles;

/**
* El objetivo principal de la clase es declarar los atributos y metodos que
* posteriormente seran heredados a las clases que extienda de esta.
*
* @version 01-01-01 2022-02-18 
* 
* @author Jose Colina josecolinamartinez@gmail.com
*
* @since 01
*/
public abstract class Vehicle {
   
     /**
     * atributos de la clase
     */
    public int NPassengers;
    public int power;
    public int numberOfSeats;
    public String crew;
    public int numberOfWheels;
    String name;

    /**
     * constructor de la clase
     *
     * @param NPassengers numero de pasajeros
     * @param power potencia del vehiculo
     * @param numberOfSeats numero de asientos
     * @param numberOfWheels numero de ruedas
     * @param name nombre del vehiculo
     */
    public Vehicle(int NPassengers, int power, int numberOfSeats, int numberOfWheels, String name) {
        this.NPassengers = NPassengers;
        this.power = power;
        this.numberOfSeats = numberOfSeats;
        this.numberOfWheels = numberOfWheels;
        this.name = name;
    }

    /**
     * Inicializando los parametros
     */
    public Vehicle() {
        this.NPassengers = 0;
        this.power = 0;
        this.numberOfSeats = 0;
        this.numberOfWheels = 0;
        this.name = "";

    }

    /**
     * metodo creado con el fin de obtener el numero de pasajeros
     *
     * @return regresa el numero de pasajeros
     * @author Jose Colina josecolinamartinez@gmail.com
     *
     * @since 01
     */
    public int getNPassengers() {
        return NPassengers;
    }

    /**
     * metodo creado con el fin de modificar el numero de pasajeros
     *
     * @param NPassengers numero de pasajeros
     * @author Jose Colina josecolinamartinez@gmail.com
     * 
     * @since 01
     */
    public void setNPassengers(int NPassengers) {
        this.NPassengers = NPassengers;
    }

    /**
     * metodo creado con el fin de obtener el numero de asientos
     *
     * @return regresa el numero de asientos
     * @author Jose Colina josecolinamartinez@gmail.com
     * 
     * @since 01
     */
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    
    /**
     * metodo creado con el fin de modificar el numero de asientos
     *
     * @param numberOfSeats numero de asientos
     * @author Jose Colina josecolinamartinez@gmail.com
     *
     * @since 01
     */
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
    
    /**
     * metodo creado con el fin de obtener el nombre del ferry
     *
     * @return 
     * @author Jose Colina josecolinamartinez@gmail.com
     * 
     * @since 01
     */
    public String getName() {
        return name;
    }

    /**
     * metodo creado con el fin de modificar el nombre del ferry
     *
     * @param name
     * @author Jose Colina josecolinamartinez@gmail.com
     *
     * @since 01
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * metodo creado con el fin de obtener el la velocidad de viaje del ferry
     *
     * @param power potencia del ferry
     * @author Jose Colina josecolinamartinez@gmail.com
     *
     * @since 01
     */
    public abstract void speed(int power);
    
    /**
     * metodo creado con el fin de saber si el ferry se encuentra
     * con tripulacion, dependiendo si el numero de pasajeros es mayor a 0
     *
     * @param Npassengers numero de pasajeros ingresados
     * @author Jose Colina josecolinamartinez@gmail.com
     * 
     * @since 01
     */
    public void isCrew(int Npassengers) {
        if (Npassengers > 0) {
            crew = "tripulado";
        } else {
            crew = "no tripulado";
        }
    }
}
