/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolUser;

import Registry.UsuarioBasic;

public class Arbol {

 
    public nodoArbol raiz;
 
    public void abb(){
        nodoArbol raiz = new nodoArbol();
    }
 
    public boolean esVacio(){
        return (raiz == null);
    }
 
    public void insertar(UsuarioBasic a){
        if (esVacio()) {
            nodoArbol nuevo = new nodoArbol();
            nuevo.setDato(a);
            nuevo.setHd(new Arbol());
            nuevo.setHi(new Arbol());
            raiz = nuevo;
        }
        else {
            if (a.id > raiz.getDato().id) {
                (raiz.getHd()).insertar(a);
            }
            if (a.id < raiz.getDato().id){
                (raiz.getHi()).insertar(a);
            }
        }
    }
 
    public void inOrder(){
        if (!esVacio()) {
            raiz.getHi().inOrder();
            System.out.print( raiz.getDato().name + ", "  );
            raiz.getHd().inOrder();
        }
    }
 
    public Arbol buscar(UsuarioBasic a){
        Arbol arbolito = null;
        if (!esVacio()) {
            if (a == raiz.getDato()) {
            return this;
            }
            else {
                if (a.id < raiz.getDato().id) {
                    arbolito = raiz.getHi().buscar(a);
                }
                else {
                    arbolito = raiz.getHd().buscar(a);
                }
            }
        }
        return arbolito;
    }
 
    public boolean existe(UsuarioBasic a){
    if (!esVacio()) {
            if (a == raiz.getDato()) {
            return true;
            }
            else {
                if (a.id < raiz.getDato().id) {
                    raiz.getHi().existe(a);
                }
                else {
                    raiz.getHd().existe(a);
                }
            }
        }
        return false;
    }
 
    public int cantidad(){
        if (esVacio()) {
            return 0;
        }
        else {
            return (1 + raiz.getHd().cantidad() + raiz.getHi().cantidad());
        }
    }
 
}