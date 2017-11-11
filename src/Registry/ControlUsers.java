/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registry;

import ArbolUser.Arbol;
import Login.FileLEc;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author shootface
 */
public class ControlUsers extends FileLEc{
    private Arbol arbol;
    public ControlUsers() {
        arbol = new Arbol();
    }
     
   public void createuser(int tipo,String name,String lastname,int id,int age,String email, String pass) throws IOException{
       FabUser fabuser = new FebUserTu();
       UsuarioBasic use = fabuser.createUser(tipo, name, lastname, id, age, email, pass);
       arbol.insertar(use);
       saveFile(use);
   }
   public void saveFile(UsuarioBasic u) throws IOException{
       String ruta = "/Users/juancamiloguabamontoya/NetBeansProjects/webtutor/src/Login/usuarios.txt";
       muestraContenido(ruta);
        File archivo = new File(ruta);
        BufferedWriter bw;
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(lectura);
            bw.write(u.email+"/"+u.getPass()+"/"+u.name+"/"+u.lastaname+"/"+u.id+"/"+u.age+"\n");
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("Acabo de crear el fichero de texto.");
        }
        bw.close();
   }
    public Arbol getArbol() {
        return arbol;
    }

    @Override
    public boolean controlEstructura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   
}
