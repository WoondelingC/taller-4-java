package vehicle;

/**
* El objetivo de la clase es declarar los atributos y los metodos y darles un
* comportamiento y manejo de manera que cumplan con la funcion de crear el
* vehiculo.
*
* @version 01-01-01 2022-02-14 
* 
* @author Jose Colina josecolinamartinez@gmail.com
*
* @since 01
*/
public class Vehicle {

    /**
     * atributos de la clase
     */
    public int NPassengers;
    public int power;
    public int numberOfSeats;
    private String crew;
    String name;

    /**
     * constructor de la clase
     *
     * @param NPassengers numero de pasajeros
     * @param power potencia del vehiculo
     * @param numberOfSeats numero de asientos
     * @param name nombre del vehiculo
     */
    public Vehicle(int NPassengers, int power, int numberOfSeats, String name) {
        this.NPassengers = NPassengers;
        this.power = power;
        this.numberOfSeats = numberOfSeats;
        this.name = name;
    }

    /**
     * Inicializando los parametros
     */
    public Vehicle() {
        this.NPassengers = 0;
        this.power = 0;
        this.numberOfSeats = 0;
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
    public void speed(int power) {
        this.power = power / 60;
    }
    
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
    
    /**
     * metodo creado con el fin de obtener la informacion mas clara
     * del ferry
     *
     * @author Jose Colina josecolinamartinez@gmail.com
     *
     * @since 01
     */
    @Override
    public String toString() {
        return "Ferry: " + name + " pasajeros= " + NPassengers + ", velocidad = " + power + ", numero de asientos = " + numberOfSeats + ", tripulacion = " + crew + "\n";
    }

}
