
/**
 * Algoritmos y Estructura de Datos
 * Universidad del Valle de Guatemala
 * Hoja de Trabajo No.7
 * File: Paciente
 * @author Sebastián Franco - 21484
 * @author Juan Miguel Gonzalez-Campo - 21077
 * @version 1.1
 * @since 28/03/2021
 */

public class paciente implements Comparable<paciente>{
    
    private String prio; ///Codigo de emergencia A-E
    private String name; ///nombre del paciente
    private String sintoma; ///sintoma del paciente



    @Override
    public int compareTo(paciente other) { ///Compara las palabras.
        return this.prio.compareTo(other.prio);
    }
}
