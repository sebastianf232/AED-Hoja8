
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

    public void setName(String s){
        this.name = s;
    }
    public void setPrio(String s){
        this.prio = s;
    }
    public void setSintoma(String s){
        this.sintoma = s;
    }
    public String getName(){
        return this.name;
    }
    public String getPrio(){
        return this.prio;
    }
    public String getSintoma(){
        return this.sintoma;
    }
    public String getAll(){
        return this.name + ", "+this.sintoma+ ", "+this.prio;
    }

    @Override
    public int compareTo(paciente other) { ///Compara las palabras.
        return this.prio.compareTo(other.prio);
    }
}
