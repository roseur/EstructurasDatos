/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Nodos.NodoDoble;

/**
 *
 * @author Rosalba Peralta
 */
public class ListaDoble {

    NodoDoble primero;

    public ListaDoble() {
        this.primero = null;
    }

    public void insertar(NodoDoble nuevo) {        
        if (vacia()) {
            primero = nuevo;
        } else {
            NodoDoble aux = primero;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            nuevo.setAnterior(aux);
        }
    }

    public NodoDoble buscar(int num) {
        if (vacia()) {
            return null;
        }
        NodoDoble aux = primero;
        while (aux != null) {
            if (aux.getNum() == num) {
                return aux;
            }
            aux = aux.getSiguiente();
        }
        return null;
    }
    
    public boolean update(int num, String desc){
        NodoDoble aux = buscar(num);
        if(aux == null){
            return false;
        }
        aux.setDesc(desc);
        return true;
    }
    
    public boolean borrar(int num) {
        if (vacia()) {
            return false;
        }
        if (primero.getNum() == num) {
            primero = primero.getSiguiente();
            return true;
        }
        NodoDoble anterior = primero;
        NodoDoble aux = primero.getSiguiente();
        while (aux != null) {
            if (aux.getNum() == num) {
                anterior.setSiguiente(aux.getSiguiente());
                if(aux.getSiguiente() != null) aux.getSiguiente().setAnterior(anterior);                
                return true;
            }
            anterior = aux;
            aux = aux.getSiguiente();
        }        
        return false;
    }

    public boolean eliminar(Integer valor) {
        boolean encontrado = false;
        if (primero != null) {
            NodoDoble aux = primero;
            NodoDoble anterior = null;
            while (aux != null) {
                if (aux.getNum() == valor) {
                    if (anterior == null) {
                        primero = primero.getSiguiente();
                        aux.setSiguiente(null);
                        aux = primero;                        
                    } else {
                        anterior.setSiguiente(aux.getSiguiente());
                        aux.setSiguiente(null);
                        aux = anterior.getSiguiente();
                    }
                    encontrado = true;
                } else {
                    anterior = aux;
                    aux = aux.getSiguiente();
                }
            }
        }
        return encontrado;
    }

    public void imprimir() {
        if (vacia()) {
            System.out.println("Lista Vacia");
            return;
        }
        NodoDoble aux = primero;
        System.out.println("Nodo: " + aux.getNum() + " Anterior: null");
        aux = aux.getSiguiente();
        while (aux != null) {
            System.out.println("Nodo: " + aux.getNum() + " Anterior: " + aux.getAnterior().getNum());
            aux = aux.getSiguiente();
        }
    }

    public boolean vacia() {
        return primero == null;
    }

}
