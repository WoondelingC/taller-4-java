package vector;

/**
 * Importaciones de clase Vector y File
 */
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;
import javax.swing.JOptionPane;


/**
* El objetivo principal de la clase es ejecutar el metodo creado en la misma,
* para permitir crear un archivo .txt y agregar datos desde la ejecución
* al mismo archivo .txt
*
* @version 01-01-01 2022-02-20 
* 
* @author Jose Colina josecolinamartinez@gmail.com
*
* @since 01
* 
* @deprecated La clase Vector ya se considera como obseleta y se recomienda 
* utilizar Collections.synchronizedCollection(Collection).
* se puede consultar información con respecto a este tema en el siguiente link:
* http://docs.oracle.com/javase/7/docs/api/java/util/Collections.html
**/
public class VectorNumbers {
    
    /**
    * Metodo creado con el fin de obtener el archivo .txt y abrirlo 
    * automaticamente justo antes de finalizar la ejecución del programa.
    *
    * @param archivo referencia del archivo creado
    *
    * @author Jose Colina josecolinamartinez@gmail.com
    *
    * @since 01
    *
    */
    public static void openFile(File archivo) {
        try {
            System.out.println("Termino el Proceso, numero similar detectado");
            Desktop.getDesktop().open(archivo);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) throws IOException {
        
        /**
         * intancia de la clase Vector
         */
        Vector<String> numbers = new Vector();

        String num = JOptionPane.showInputDialog("Indique el numero a ingresar");
        
        /**
         * Validacion de numeros, si el numero ingresado por el usuario
         * es repetido deja de ejecutarse el while
         */
        while (!numbers.contains(num)) {
            numbers.addElement(num);
            System.out.println("numeros = " + numbers);
            num = JOptionPane.showInputDialog("Indique el numero a ingresar");

        }

        /**
         * Creación y escritura de los datos del fichero
         */
        File file = new File("fichero.txt");

        try (PrintWriter writeNumbers = new PrintWriter(file)) {
            writeNumbers.write(numbers.toString());
        } catch (IOException e) {
            System.out.println(e);
        }
        openFile(file);
    }

}
