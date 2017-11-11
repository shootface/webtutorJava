/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryptar;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author shootface
 */
public class Password extends datos{
    private String datos;
    public Password(Encriptar encriptador) {
        super(encriptador);
    }

    @Override
    public String encriptar() {
        return encriptarBase64(datos);
    }

    @Override
    public String desencriptar() {
        try {
            return desencriptarBase64(datos);
        } catch (Exception ex) {
            Logger.getLogger(Password.class.getName()).log(Level.SEVERE, null, ex);
            return "";
        }
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }
    
    
    
}
