
import java.util.List;

/**
* El objetivo principal de la clase es llamar los metodos de la clase abstracta
* definirles un comportamiento y darle funcionalidad con el uso de los atributos
* heredados, permite realizar el calculo solicitado por el usuario
*
* @version 01-01-01 2022-02-20 
* 
* @author Jose Colina josecolinamartinez@gmail.com
*
* @since 01
*/
public class Planets extends SolarSystem {
    /**
     * constantes usadas para los calculos
     */
    public static double massSun = 2E30;
    private final double G = 6E-11; 

    public Planets(double mass, double density, double diameter, double distanceSun) {
        super(mass, density, diameter, distanceSun);
    }

    /**
    * Metodo creado con el fin de preguntar al usuario que actividad 
    * desea realizar y pasar parametros a los metodos de calculos alojados
    * en otra clase
    *
    * @return El resultado del calculo de la fuerza gravitacional
    *
    * @author Jose Colina josecolinamartinez@gmail.com 
    *
    * @since 01
    *
    */
    @Override
    public double gravitationalForce(double m1, double r) {
        double F = G * (m1 * massSun)/ r;
        return F;
    }

    /**
    * Metodo creado con de realizar el calculo de la Fuerza gravitacional 
    * dependiendo de la opcion ingresada por el usuario recibe la informacion,
    * la opcion elegida y realiza el calculo correspondiente
    *
    * @param select opcion tomada por el usuario
    * @param systemPlanets informacion de los planetas 
    * 
    * @author Jose Colina josecolinamartinez@gmail.com 
    *
    * @since 01
    *
    */
    public static void calculations(int select, List<Planets> systemPlanets){
    switch(select){
            case 1 ->{
                double gravedad = systemPlanets.get(0).gravitationalForce
                (systemPlanets.get(0).mass, systemPlanets.get(0).distanceSun);
                
                System.out.println(gravedad + " Newton");
                
                break;
            }
            case 2 ->{
                double gravedad = systemPlanets.get(1).gravitationalForce
                (systemPlanets.get(1).mass, systemPlanets.get(1).distanceSun);
                
                System.out.println(gravedad + " Newton");
                
                break;
            }
            case 3 ->{
                double gravedad = systemPlanets.get(3).gravitationalForce
                (systemPlanets.get(3).mass, systemPlanets.get(3).distanceSun);
                
                System.out.println(gravedad + " Newton");
                
                break;
            }
            case 4 ->{
                double gravedad = systemPlanets.get(3).gravitationalForce
                (systemPlanets.get(3).mass,systemPlanets.get(3).distanceSun);
                
                System.out.println(gravedad + " Newton");
                
                break;
            }
            case 5 ->{
                double gravedad = systemPlanets.get(4).gravitationalForce
                (systemPlanets.get(4).mass, systemPlanets.get(4).distanceSun);
                
                System.out.println(gravedad + " Newton");
                
                break;
            }
            case 6 ->{
                double gravedad = systemPlanets.get(5).gravitationalForce
                (systemPlanets.get(5).mass, systemPlanets.get(5).distanceSun);
                
                System.out.println(gravedad + " Newton");
                
                break;
            }
            case 7 ->{
                double gravedad = systemPlanets.get(6).gravitationalForce
                (systemPlanets.get(6).mass, systemPlanets.get(6).distanceSun);
                
                System.out.println(gravedad + " Newton");
                
                break;
            }
            case 8 ->{
                double gravedad = systemPlanets.get(7).gravitationalForce
                (systemPlanets.get(7).mass, systemPlanets.get(7).distanceSun);
                
                System.out.println(gravedad + " Newton");
                
                break;
            }
            default ->
                System.out.println("FINALIZO");
        }
    }
    
}
