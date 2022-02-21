/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicles;

/**
* El objetivo de la clase es darle el comportamiento al metodo declarado en la
* clase abstracta para el calculo de la velocidad, usando los atributos
* heredados de la clase ya antes mencionada.
*
* @version 01-01-01 2022-02-18
* 
* @author Jose Colina josecolinamartinez@gmail.com
*
* @since 01
*/
public class Motorcycle extends Vehicle {

    /**
     * constructor de clase con los atributos heredados
     * @param NPassengers
     * @param power
     * @param numberOfSeats
     * @param numberOfWheels
     * @param name 
     */
    public Motorcycle(int NPassengers, int power, int numberOfSeats, int numberOfWheels, String name) {
        super(NPassengers, power, numberOfSeats, numberOfWheels, name);
    }

    /**
    * Metodo creado con el fin de calcular la velocidad del vehiculo en este
    * caso la moto sumandole un entero a la potencia declarada por el usuario.
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
        this.power = power +20;
    }
    
}
