import java.util.PriorityQueue;
import java.util.Vector;
/**
 * Algoritmos y Estructura de Datos
 * Universidad del Valle de Guatemala
 * Hoja de Trabajo No.8
 * File: Heaps
 * @author Sebastián Franco - 21484
 * @author Juan Miguel Gonzalez-Campo - 21077
 * @version 1.1
 * @since 28/03/2021
 */

public class vectorheap<E extends Comparable<E>> implements PrioQueue<E> {

    private Vector<paciente> v = new Vector<paciente>();
    private int size = -1;
    
    // Function to return the index of the
    // parent node of a given node
    public int parent(int i)
    {
        return (i - 1) / 2;
    }
    
    // Function to return the index of the
    // left child of the given node
    public int leftChild(int i)
    {
        return ((2 * i) + 1);
    }
    
    // Function to return the index of the
    // right child of the given node
    public int rightChild(int i)
    {
        return ((2 * i) + 2);
    }
    
    // Function to shift up the
    // node in order to maintain
    // the heap property
    public void shiftUp(int i)
    {
        while (i > 0 && (v.get(parent(i)).compareTo(v.get(i)) > 0)) 
        {
           
            // Swap parent and current node
            
            swap(parent(i), i);
            
        
            // Update i to parent of i
            i = parent(i);
            
            
            
        }
    }
    
    // Function to shift down the node in
    // order to maintain the heap property
    public void shiftDown(int i)
    {
        int maxIndex = i;
        
        // Left Child
        int l = leftChild(i);
        
        if (l <= size && v.get(l).compareTo(v.get(maxIndex)) < 0) 
        {
            
            maxIndex = l;
        }
        
        // Right Child
        int r = rightChild(i);
        
        if (r <= size && v.get(r).compareTo(v.get(maxIndex)) < 0)
        {
            
            maxIndex = r;
        }
        
        // If i not same as maxIndex
        if (i != maxIndex)
        {
            
            swap(i, maxIndex);
            shiftDown(maxIndex);
        }
    }
        
        // Function to insert a
        // new element in
        // the Binary Heap
    
    public void insert(paciente p)
    {
        size = size + 1;
        v.insertElementAt(p, size);
        
        // Shift Up to maintain
        // heap property
        shiftUp(size);
    }
    
    // Function to extract
    // the element with
    // maximum priority
    public paciente extractMin()
    {
        paciente result = v.get(0);
        
        // Replace the value
        // at the root with
        // the last leaf
        v.set(0, v.get(size));
        
        size = size - 1;
        
        // Shift down the replaced
        // element to maintain the
        // heap property
        shiftDown(0);
        return result;
    }
    
    // Function to change the priority
    // of an element
    public void changePriority(int i, paciente p)
    {
        paciente oldp = v.get(i);
        v.removeElementAt(i);
        v.insertElementAt(p, i);
        
        if (p.compareTo(oldp) < 0)
        {
            shiftUp(i);
        }
        else
        {
            shiftDown(i);
        }
    }
    
    // Function to get value of
    // the current maximum element
    
    public paciente getMin()
    {
        return v.get(0);
    }
    
    // Function to remove the element
    // located at given index
    public void remove(int i)
    {   
        v.removeElementAt(i);
        v.insertElementAt(getMin(), i);
        
        // Shift the node to the root
        // of the heap
        shiftUp(i);
        
        // Extract the node
        extractMin();
    }
    
    public void swap(int i, int j)
    {
        paciente temp = v.get(i);
        v.set(i, v.get(j));
        v.set(j, temp);

        
        
        
        
        
    }

    public paciente getElement(int i){
        return v.get(i);
    }
    public int getSize(){
        return size;
    }
}
