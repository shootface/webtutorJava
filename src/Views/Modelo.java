/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Login.Login;
import Registry.ControlUsers;
import encryptar.EncriptarBase64;
import encryptar.Password;
import java.io.IOException;
/**
 *
 * @author shootface
 */
public class Modelo {
    private VentanaLogin ventanaLogin;
    private VentanaRegistro ventanaRegistro;
    private VentanaModulos ventanaModulos;

    public Modelo() {
    }
    
    public void Iniciar(){
        getVentanaLogin().setSize(375, 135);
        getVentanaLogin().setVisible(true);
    }
    //Metodos para generar la ventanas
    
    //VENTANA LOGIN
    public VentanaLogin getVentanaLogin(){
        if(ventanaLogin == null){
            ventanaLogin = new VentanaLogin(this);
        }
        return ventanaLogin;
    }
    //VENTANA REGISTRO
    public VentanaRegistro getVentanaRegistro(){
        if(ventanaRegistro==null){
            ventanaRegistro = new VentanaRegistro(this);
        }
        return ventanaRegistro;
    }
    //VENTANA MODULOS
    public VentanaModulos getVentanaModulos(){
        if(ventanaModulos==null){
            ventanaModulos = new VentanaModulos(this);
        }
        return ventanaModulos;
    }

    public void ingresar(String email, String pass) {
        Login login = new Login(email, pass);
        System.out.println("SE CREA EL LOGIN");
        if(login.controlEstructura()){
            getVentanaModulos().setSize(500,500);
            getVentanaModulos().setVisible(true);
            getVentanaLogin().dispose();
        }
    }
    public void registrar(String name,String lasname,int id,int age,String emai,String pass) throws IOException{
        ControlUsers cu = new ControlUsers();
        Password ps = new Password(new EncriptarBase64());
        ps.setDatos(pass);
        String pa = ps.encriptar();
        cu.createuser(0, name, lasname, id, age, emai, pa);
    }

    public void iniciarRegistro() {
        getVentanaRegistro().setSize(400, 307);
        getVentanaRegistro().setVisible(true);
        getVentanaLogin().dispose();
    }
    
}
