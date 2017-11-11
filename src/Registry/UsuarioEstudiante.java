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
public class UsuarioEstudiante extends UsuarioBasic{
    public int totalScore;
    private UsuarioBasic tutor;

    public UsuarioEstudiante(String name, String lastname, int id, int age, String email, String pass) {
        super(name, lastname, id, age, email, pass);
    }
    
    public UsuarioBasic getTutor() {
        return tutor;
    }

    public void setTutor(UsuarioBasic tutor) {
        this.tutor = tutor;
    }
    
    
}
