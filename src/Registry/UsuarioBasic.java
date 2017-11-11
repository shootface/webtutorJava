package Registry;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shootface
 */
public abstract class UsuarioBasic {
    public String name;
    public String lastaname;
    public int id;
    public int age;
    public String email;
    private final String pass;


    public UsuarioBasic(String name,String lastname,int id,int age,String email, String pass) {
        this.name = name;
        this.lastaname = lastname;
        this.email = email;
        this.pass = pass;
        this.id=id;
        this.age=age;
    }

    public String getPass() {
        return pass;
    }
    
    
    
    
}
