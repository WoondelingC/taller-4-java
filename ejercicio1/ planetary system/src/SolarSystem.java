
/**
* El objetivo principal de la clase es declarar los metodos y atributos 
* que seran heredados a otras clases 
*
* @version 01-01-01 2022-02-20 
* 
* @author Jose Colina josecolinamartinez@gmail.com
*
* @since 01
*/
public abstract class SolarSystem {
    /**atributos**/
    double distancePlanets;
    double distanceSun;
    double mass;
    double density;
    double diameter;
    
    /**
     * Constructor
     * @param mass masa
     * @param density densidad 
     * @param diameter diametro
     * @param distanceSun distancia con respecto al sol
     */
    public SolarSystem(double mass, double density, double diameter, 
                       double distanceSun) 
    {
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.distanceSun = distanceSun;
    }
    
    /**
    * Metodo creado con el fin de preguntar al usuario que actividad 
    * desea realizar y pasar parametros a los metodos de calculos alojados
    * en otra clase
    *
    * @param m1 masa del planeta
    *
    * @author Jose Colina josecolinamartinez@gmail.com
    * @param r distancia con respecto al Sol
    *
    * @since 01
    *
    */
    public abstract double gravitationalForce(double m1, double r);
    
}
