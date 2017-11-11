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
public interface FabUser {
    public UsuarioBasic createUser(int tipo,String name,String lastname,int id,int age,String email, String pass);
}
