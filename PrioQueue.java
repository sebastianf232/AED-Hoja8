import java.util.Vector;



public interface PrioQueue<E extends Comparable<E>> {
    
    public void insert(paciente e);

    public paciente getMin();

    public paciente extractMin();

    public int getSize();

}
