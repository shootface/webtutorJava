/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Login;

/**
 *
 * @author shootface
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public abstract class FileLEc {
    public ArrayList<String> datos = new ArrayList<>();
    public String lectura="";
    
     public void muestraContenido(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            lectura = cadena + lectura + "\n";
            datos.add(cadena);
            System.out.println(cadena);
        }
        b.close();
    }
     public abstract boolean controlEstructura();

}
