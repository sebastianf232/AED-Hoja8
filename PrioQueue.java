import java.util.Vector;

/**
 * Algoritmos y Estructura de Datos
 * Universidad del Valle de Guatemala
 * Hoja de Trabajo No.8
 * File: PrioQueue
 * @author Sebastián Franco - 21484
 * @author Juan Miguel Gonzalez-Campo - 21077
 * @version 1.1
 * @since 28/03/2021
 */

public interface PrioQueue<E extends Comparable<E>> { ///Interfaz Comparable
    
    /**
     * @param e
     */
    public void insert(paciente e); 

    public paciente getMin();

    public paciente extractMin();

    public int getSize();

}
