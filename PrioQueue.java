import java.util.Vector;



public interface PrioQueue<E> extends Comparable<E> {
    
    public boolean add(E e);

    public void clear(E e);

    public boolean contains(Object o);

    public boolean offer(E e);

    public E peek();

    public E poll();

    public boolean remove(Object o);

    public int size();

}
