/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Nodos.NodoSimple;

/**
 *
 * @author 30141209
 */
public class Cola {

    NodoSimple primero;
    NodoSimple ultimo;

    public Cola() {
        this.primero = this.ultimo = null;
    }

    public void enqueue(NodoSimple nuevo) {
        if (vacia()) {
            primero = nuevo;            
        } else {
            ultimo.setSiguiente(nuevo);
        }
        ultimo = nuevo;        
    }

    public NodoSimple dequeue() {
        NodoSimple aux;
        if (vacia()) {
            return null;
        }        
        aux = primero;
        primero = primero.getSiguiente();        
        System.out.println("Sacando: "+aux.getNum());
        aux.setSiguiente(null);
        return aux;
    }
    
    public void peek(){
        if (vacia()) {
            return;
        }
        System.out.println("Peek: "+primero.getDesc());
    }

    public void imprimir() {
        if (vacia()) {
            System.out.println("Lista Vacia");
            return;
        }
        NodoSimple aux = primero;
        while (aux != null) {
            System.out.println(aux.getNum());
            aux = aux.getSiguiente();
        }
    }

    public boolean vacia() {
        return primero == null;
    }

}
