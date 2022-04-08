import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * Algoritmos y Estructura de Datos
 * Universidad del Valle de Guatemala
 * Hoja de Trabajo No.8
 * File: Main Collections
 * @author Sebastián Franco - 21484
 * @author Juan Miguel Gonzalez-Campo - 21077
 * @version 1.1
 * @since 28/03/2021
 */

public class MainCollections {


    static String path = "pacientes.txt";
    
    static String line = null;


    public static void leerArchivo(String path, ArrayList<String> p){
        try {
            /**
             * Mientras haya un archivo, se lee.
             */
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while((line = reader.readLine()) != null){
                p.add(line);
            }
        } catch(Exception e){ ///Por si no hay Archivo
            System.out.println("Error al leer archivo");
        }
    }

    public static void main(String[] args){
        ArrayList<String> a = new ArrayList<>();
        PriorityQueue<paciente> pq = new PriorityQueue<>();
        leerArchivo(path, a);
        for (String x: a){ ///Se separan los nombres, y se aniade el tipo de caso. 
            String[] temp = x.split("[,]");
            paciente temp1 = new paciente();
            temp1.setName(temp[0]);
            temp1.setSintoma(temp[1]);
            temp1.setPrio(temp[2]);

            pq.add(temp1);
            
        }

        System.out.println("Orden de pacientes: \n");
        int j = pq.size();
        for (int k = 0; k < j; k++){ ///Se imprimen los pacientes

            System.out.println(pq.remove().getAll());
        }

    }
}
