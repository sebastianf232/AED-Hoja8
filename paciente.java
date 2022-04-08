
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

    public void setName(String s){ ///Set del nombre del paciente
        this.name = s;
    }
    public void setPrio(String s){ ///Set del codigo de emergencia
        this.prio = s;
    }
    public void setSintoma(String s){ ///Set de los sintomas del paciente
        this.sintoma = s;
    }
    public String getName(){///Get del nombre del paciente
        return this.name;
    }
    public String getPrio(){ ///Get del codigo de emergencia
        return this.prio;
    }
    public String getSintoma(){///Get de los sintomas del paciente
        return this.sintoma;
    }
    public String getAll(){ ///Todos los datos.
        return this.name + ", "+this.sintoma+ ", "+this.prio;
    }

    @Override
    public int compareTo(paciente other) { ///Compara las palabras. En este caso el tipo de emergencia.
        return this.prio.compareTo(other.prio);
    }
}
