/*
El método de clase indexOf(Object o)se usa para descubrir el índice de un elemento particular en una lista.
 */
package ec.edu.ister.modelo;

import java.util.ArrayList;

/**
 *
 * @author JHON SUNTAXI
 */
public class IndexOf {

    public static void buscar() {

        // Creamos una lista de matriz vacía con una capacidad inicial
        ArrayList<String> arrlist = new ArrayList<String>(5);

        // Useamos el método add () para agregar valores en la lista
        arrlist.add("GABRIEL GONZALEZ");
        arrlist.add("ELENA MORA");
        arrlist.add("FABRICIO LOPEZ");
        arrlist.add("MIRIAM CASA");

        System.out.println("Tamaño de la lista: " + arrlist.size());

        // Imprimimos todos los valores disponibles en la lista
        for (String value : arrlist) {
            System.out.println("Alumno : " + value);
        }

        // Recuperamos el índice del elemento "FABRICIO LOPEZ"
        int recval = arrlist.indexOf("FABRICIO LOPEZ");
        System.out.println("El alumno Fabricio Lopez, esta en la posicion " + recval);
    }
}
