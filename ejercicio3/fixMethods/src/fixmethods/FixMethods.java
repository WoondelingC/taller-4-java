package fixmethods;
 
import javax.swing.JOptionPane;

/**
* El objetivo principal de la clase es llamar los metodos de las otras clases,
* permitir crear instancias de las clases y ejecutar el programa para comprobar
* su funcionalida
*
* @version 01-01-01 2022-02-12 
* 
* @author Jose Colina josecolinamartinez@gmail.com
*
* @since 01
*/
public class FixMethods {
    public static void main(String[] args) {
        
        int numbers[] = new int[10];
        
        /**
         * ejecutando ciclo para generar los 10 numeros de manera aleatoria con
         * el metodo Math.random
         */
        for (int i = 0; i < 10; i++) {
            numbers[i] = (int)(Math.random()*10+1);
            System.out.println("numeros = " + i + "-->" + numbers[i]);
        }
        
        NumberRandom o = new NumberRandom();
        
        /**
         * preguntando al usuario el metodo de su preferencia para organizar
         * el arreglo de numeros.
         */
        int option;
        option = Integer.parseInt
        (JOptionPane.showInputDialog
        ("""
         Ingese la opcion del metodo a usar para organizar el arreglo:
         1- metodo de Burbuja
         2- metodo de quick Sort"""));
                
        
        switch(option){
            case 1 -> {
                o.bubbleMethod(numbers);
            }
                    
            case 2 -> {
                o.quickSort(numbers, 0, numbers.length-1); 
            }
            default -> {
                System.out.println("ingrese una opcion entre 1 y 2");
            }
                    
        }
          
    }    
}
