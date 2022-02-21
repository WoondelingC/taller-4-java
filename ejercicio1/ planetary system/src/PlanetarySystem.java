import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
* El objetivo principal de la clase es llamar los metodos de las otras clases,
* permitir crear instancias de las clases y ejecutar el programa para comprobar
* su funcionalida, ademas craer una lista con la informacion de los plantetas
* para pasarla como parametro a otros metodos y crear el menu de preguntas.
*
* @version 01-01-01 2022-02-20 
* 
* @author Jose Colina josecolinamartinez@gmail.com
*
* @since 01
*/

public class PlanetarySystem {
    
    /**
    * Metodo creado con el fin de preguntar al usuario que actividad 
    * desea realizar y pasar parametros a los metodos de calculos alojados
    * en otra clase
    *
    * @param systemPlanets contiene la informacion de los planetas
    *
    * @author Jose Colina josecolinamartinez@gmail.com
    *
    * @since 01
    *
    */
    public static void menu( List systemPlanets) {
        try {
        int option = 0;
        int select = 0;
        
        while (option < 2 || select == 9) {
            option = Integer.parseInt(JOptionPane.showInputDialog("""
            1- Calcular la Fuerza gravitacional
            2- salir"""));
           
            select = 0;

            if (option == 1) {
                select = Integer.parseInt(JOptionPane.showInputDialog("""
                1- Tierra con respecto al Sol
                2- Marte con respecto al Sol
                3- Mercurio con respecto al Sol 
                4- Jupiter con respecto al Sol
                5- Saturno con respecto al Sol
                6- Venus con respecto al Sol     
                7- Urano con respecto al Sol  
                8- Neptuno con respecto al Sol                                                                                                                                                                                           
                9- volver al menu principal"""));
            }

            if (option < 2) {
                Planets.calculations(select, systemPlanets);
            }
          }
         } catch (HeadlessException | NumberFormatException e) {
             System.out.println("Debe ingresar en numero la opcion a elegir "+e);
        }
    }

    

    public static void main(String[] args) {

        /** instancias de la clase Plantest y arreglo que contendra 
         * la informacion de los planetas
        **/
        List<Planets> systemPlanets = new ArrayList();

        Planets planetEarth = new Planets(6E24, 5.5, 12756, 146600000);

        Planets planetMars = new Planets(6E23, 3.9, 6794, 227940000);

        Planets planetMercury = new Planets(3E23, 5.4, 4880, 57910000);

        Planets planetJupiter = new Planets(2E27, 1.3, 142984, 778330000);

        Planets planetSaturn = new Planets(6E26, 0.7, 108728, 1429400000);

        Planets venusPlanet = new Planets(5E24, 5.2, 12104, 108200000);

        Planets uranusPlanet = new Planets(9E25, 1.3, 51118, 3E9);

        Planets planetNeptune = new Planets(1E26, 1.6, 49532, 4E9);

        systemPlanets.add(planetEarth);
        systemPlanets.add(planetMars);
        systemPlanets.add(planetMercury);
        systemPlanets.add(planetJupiter);
        systemPlanets.add(planetSaturn);
        systemPlanets.add(venusPlanet);
        systemPlanets.add(uranusPlanet);
        systemPlanets.add(planetNeptune);
        
        menu(systemPlanets);
        
        
    }

}
