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
public abstract class Encriptar {
    public final String secretKey = "webtutorisinmyheart"; //llave para encriptar datos
    public abstract String Encriptar(String texto);
    public abstract String Desencriptar(String texto)throws Exception;
}
