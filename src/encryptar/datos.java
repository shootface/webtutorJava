/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryptar;

/**
 *
 * @author shootface
 */
public abstract class datos {
    private Encriptar encriptador;

    public datos(Encriptar encriptador) {
        this.encriptador = encriptador;
    }
    
    public abstract String encriptar();
    public abstract String desencriptar();
    
    public String encriptarBase64(String text){
        return encriptador.Encriptar(text);
    }
    public String desencriptarBase64(String text) throws Exception{
        return encriptador.Desencriptar(text);
    }
}
