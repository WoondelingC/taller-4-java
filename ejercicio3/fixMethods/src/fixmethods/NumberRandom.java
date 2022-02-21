package fixmethods;

/**
* El objetivo principal de la clase es llamar los metodos declarados en
* la interfaz y darle y comportamiento adecuado para que cumplan su función,
* que es ordenar el arreglo creado en la clase principal
*
* @version 01-01-01 2022-02-20 
* 
* @author Jose Colina josecolinamartinez@gmail.com
*
* @since 01
* 
* @see Para consultar sobre el uso de los metodos de ordenamiento de Java, 
* visite la siguiente dirección 
* https://gl-epn-programacion-ii.blogspot.com/2010/06/metodos-de-ordenamiento.html
*/
public class NumberRandom implements Methods {
    
    /**
    * Metodo creado con el fin de recorrer el arreglo, obtener los datos 
    * del mismo y ordenarlos de forma creciente, recorre el arreglo y valida
    * constantemente si el numero seleccionado es mayor al siguiente y de esta
    * manera se ordena, esta validacion se realiza con cada numero hasta que
    *  se encuentre organizado el arreglo
    * 
    *
    * @param numbers contiene la informacion del arreglo de numeros aleatorios
    *
    * @author Jose Colina josecolinamartinez@gmail.com
    *
    * @since 01
    *
    */
    @Override
    public void bubbleMethod(int numbers[]) {
        int aux;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    aux = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = aux;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("numero ordenado por burbuja: " + numbers[i]);
        }

    }

    /**
    * Metodo creado con el fin de desestructurar el arreglo, asignando un pivote
    * por cada sub estructura derivada del arreglo y validando los datos 
    * de manera constantemente si el numero seleccionado es mayor al siguiente 
    * y de esta manera se ordena, esta validacion se realiza con cada
    * subestructura hasta que se encuentre organizado el arreglo.
    *
    * @param n contiene el arreglo de numeros
    * @param primero contiene el numero de la primera posicion
    * @param ultimo contiene el numero de la ultima posicion
    *
    * @author Jose Colina josecolinamartinez@gmail.com
    *
    * @since 01
    *
    */
    @Override
    public void quickSort(int n[], int primero, int ultimo) {

        int i = primero;
        int j = ultimo;
        System.out.println("suma" + (primero + ultimo));
        int pivote = n[(primero+ultimo)];
        System.out.println("pivote" + pivote);
        int aux;
        
        do{
            while(n[i] < pivote){
                i++;
            }
            while(n[j] > pivote){
                j--;
            }
            //aqui hacemos el intercambio
            if (i <= j) {
                aux = n[i];
                n[i] = n[j];
                n[j] = aux;
                i++;
                j--;
            }
        }
            while(i <= j);
            
            if (primero < j ) {
                quickSort(n, primero, j);
            }
            else if (i < ultimo) {
                quickSort(n, i, ultimo);
            }
            else{
               for (int k = 0; k < n.length; k++){
                   System.out.println("numero ordenado por sort: " + n[k]);
               } 
            } 
        }     
}
