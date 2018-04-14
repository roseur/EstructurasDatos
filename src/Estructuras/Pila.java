/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Nodos.NodoSimple;

/**
 *
 * @author Rosalba Peralta
 */
public class Pila {

    NodoSimple primero;
    int size;

    public Pila() {
        this.primero = null;
        this.size = 0;
    }

    public void push(NodoSimple nuevo) {
        if (vacia()) {
            primero = nuevo;
            size++;
        } else {
            nuevo.setSiguiente(primero);
            primero = nuevo;
            size++;
        }
    }

    public NodoSimple pop() {
        NodoSimple aux;
        if (vacia()) {
            return null;
        }        
        aux = primero;
        primero = primero.getSiguiente();
        size--;
        System.out.println("Sacando: "+aux.getDesc());
        aux.setSiguiente(null);
        return aux;
    }
    
    public void peek(){
        if (vacia()) {
            return;
        }
        System.out.println("Peek: "+primero.getDesc());
    }
    
    public int getSize(){
        return size;
    }

    public void imprimir() {
        if (vacia()) {
            System.out.println("Pila Vacia");
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
