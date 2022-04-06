import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

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

        
    }
}
