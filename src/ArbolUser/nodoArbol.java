/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolUser;

/**
 *
 * @author shootface
 */
import Registry.UsuarioBasic;
public class nodoArbol {
    private Arbol hd;
    private Arbol hi;
    private UsuarioBasic dato;

    public nodoArbol() {
        hd = null;
        hi = null;
        dato = null;
    }

    public UsuarioBasic getDato() {
        return dato;
    }

    public Arbol getHd() {
        return hd;
    }

    public Arbol getHi() {
        return hi;
    }

    public void setHd(Arbol hd) {
        this.hd = hd;
    }

    public void setHi(Arbol hi) {
        this.hi = hi;
    }

    public void setDato(UsuarioBasic dato) {
        this.dato = dato;
    }
    
        
}
