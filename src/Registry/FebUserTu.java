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
public class FebUserTu implements FabUser{

    @Override
    public UsuarioBasic createUser(int tipo,String name,String lastname,int id,int age,String email, String pass) {
        if(tipo==0){
            return new UsuarioEstudiante(name, lastname, id, age, email, pass);
        }else{
            return new UsuarioTutor(name, lastname, id, age, email, pass);
        }
    }


    
}
