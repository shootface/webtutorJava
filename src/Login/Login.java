/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.io.IOException;
import encryptar.*;

/**
 *
 * @author shootface
 */
public class Login extends FileLEc{
    private final String email;
    private final String pass;
    
    public Login(String email, String pass) {
        this.email = email;
        this.pass = pass;
        try {
            muestraContenido("/Users/juancamiloguabamontoya/NetBeansProjects/webtutor/src/Login/usuarios.txt");
        } catch (IOException ex) {
            System.out.println("ERROR");
        }
    }

    @Override
    public boolean controlEstructura() {
        for(int i=0;i<datos.size();i++){
             String[] part = datos.get(i).split("/");
             System.out.println("EMAIL :"+part[0]+" "+"PASS :"+part[1]);
            if(part[0].equals(email) && part[1].equals(pass)){
                System.out.println("INGRESA");
                return true;
            }
        }
        return false;
    }
    
    
}
