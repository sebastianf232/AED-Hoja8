import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;


/**
 * Algoritmos y Estructura de Datos
 * Universidad del Valle de Guatemala
 * Hoja de Trabajo No.8
 * File: Main
 * @author Sebastián Franco - 21484
 * @author Juan Miguel Gonzalez-Campo - 21077
 * @version 1.1
 * @since 28/03/2021
 */


public class Main {

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
        vectorheap<paciente> v = new vectorheap<>();
        ArrayList<String> a = new ArrayList<>();
        leerArchivo(path, a);
        for (String x: a){
            String[] temp = x.split("[,]");
            paciente temp1 = new paciente();
            temp1.setName(temp[0]);
            temp1.setSintoma(temp[1]);
            temp1.setPrio(temp[2]);

            v.insert(temp1);
            
        }
        System.out.println("Orden de pacientes: \n");
        int temp2 = v.getSize();
        for (int k = 0; k <=temp2; k++){
            System.out.println(v.extractMin().getAll());
        }
        
        
        
        
    }
}
