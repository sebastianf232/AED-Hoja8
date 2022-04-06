

public class paciente implements Comparable<paciente>{
    
    private String prio;
    private String name;
    private String sintoma;



    @Override
    public int compareTo(paciente other) { ///Compara las palabras.
        return this.prio.compareTo(other.prio);
    }
}
