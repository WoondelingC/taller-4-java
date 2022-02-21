package vehicles;

/**
* El objetivo de la clase es darle el comportamiento al metodo declarado en la
* clase abstracta para el calculo de la velocidad, usando los atributos
* heredados de la clase ya antes mencionada y anexar un nuevo atributo que
* distinque de las otras clases
*
* @version 01-01-01 2022-02-18
* 
* @author Jose Colina josecolinamartinez@gmail.com
*
* @since 01
*/
public class Card extends Vehicle {
    
    protected int numberOfDoors;
    
    /**
     * constructor de clase con los atributos heredados y el atributo que 
     * representa el numero de puertas.
     * 
     * @param numberOfDoors
     * @param NPassengers
     * @param power
     * @param numberOfSeats
     * @param numberOfWheels
     * @param name 
     */
    public Card(int numberOfDoors, int NPassengers, int power, int numberOfSeats, int numberOfWheels, String name) {
        super(NPassengers, power, numberOfSeats, numberOfWheels, name);
        this.numberOfDoors = numberOfDoors;
    }
    
    /**
    * Metodo creado con el fin de calcular la velocidad del vehiculo en este
    * caso el carro sumandole un entero a la potencia declarada por el usuario.
    *
    * @param power representa la potencia del vehiculo
    *
    * @author Jose Colina josecolinamartinez@gmail.com
    *
    * @since 01
    *
    */
    @Override
    public void speed(int power) {
        this.power = power + 40;
    }
    
}

    
