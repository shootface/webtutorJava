/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registry;

/**
 *
 * @author shootface
 */
public class UsuarioTutor extends UsuarioBasic{
    public int hours;//Horas que le dedica a la revision del estado del estudiante

    public UsuarioTutor(String name, String lastname, int id, int age, String email, String pass) {
        super(name, lastname, id, age, email, pass);
    }
    
    
}
