
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author KORTIZ
 */
public class ReadFile {

    public String lecturaArchivo(String ruta) {
        StringBuilder informacion = new StringBuilder();
        FileReader fr = null;

        try {
            File archivo = new File("C:\\Users\\KORTIZ\\Documents\\Archivo.txt");
            fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                informacion.append(linea + " ");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(informacion);
        return informacion.toString();
    }
}
