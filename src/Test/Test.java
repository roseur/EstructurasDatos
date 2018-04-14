/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Estructuras.*;
import Nodos.*;
import java.util.*;

/**
 *
 * @author Rosalba Peralta
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       TestArbolesBinarios();
    }

    static void TestListaSimple() {
        ListaSimple ls = new ListaSimple();
        NodoSimple nuevo = new NodoSimple(1, "UNO");
        ls.insertar(nuevo);
        nuevo = new NodoSimple(2, "DOS");
        ls.insertar(nuevo);
        nuevo = new NodoSimple(3, "TRES");
        ls.insertar(nuevo);
        ls.imprimir();

//        NodoSimple nodo = ls.buscar(2);
//        System.out.println("NodoSimple = "+ nodo.getDesc());
//        boolean borrado = ls.borrar(3);
//        System.out.println("Nodo "+ (borrado ? "borrado":"no borrado"));
//        ls.imprimir();
        boolean borrado = ls.eliminar(3);
        System.out.println("Nodo " + (borrado ? "borrado" : "no borrado"));
        ls.imprimir();

//        nuevo = new NodoSimple(5, "Cinco");
//        ls.insertar(nuevo);
//        nuevo = new NodoSimple(4, "Cuatro");
//        ls.insertarEntre(3, nuevo);
//        ls.imprimir();
    }

    static void EjercicioNumerosRandom() {
        Random r;
        int d;
        ListaSimple lista;
        int k = 20; // número de nodos
        r = new Random();
        lista = new ListaSimple(); // crea lista vacía        
        // se insertan elementos en la lista        
        for (; k > 0; k--) {
            d = r.nextInt() % 99;
            NodoSimple nuevo = new NodoSimple(d, String.valueOf(d));
            lista.insertar(nuevo);
        }
        // recorre la lista para escribir sus elementos      
        lista.MostrarPares();
    }

    static void TestListaDoble() {
        ListaDoble ld = new ListaDoble();
        NodoDoble nuevo = new NodoDoble(1, "UNO");
        ld.insertar(nuevo);
        nuevo = new NodoDoble(2, "DOS");
        ld.insertar(nuevo);
        nuevo = new NodoDoble(3, "TRES");
        ld.insertar(nuevo);
        ld.imprimir();

//        boolean borrado = ld.borrar(3);
//        System.out.println("Nodo "+ (borrado ? "borrado":"no borrado"));
//        boolean borrado = ld.eliminar(3);
//        System.out.println("Nodo "+ (borrado ? "borrado":"no borrado"));
        ld.update(1, "uno");
        ld.imprimir();
    }

    static void TestPila() {
        Pila p = new Pila();
        NodoSimple nuevo = new NodoSimple(1, "UNO");
        p.push(nuevo);
        nuevo = new NodoSimple(2, "DOS");
        p.push(nuevo);
        nuevo = new NodoSimple(3, "TRES");
        p.push(nuevo);
        p.imprimir();

        p.peek();
//        while(p.pop() != null){
//            p.imprimir();
//        }
    }

    static void TestCola() {
        Cola c = new Cola();
        NodoSimple nuevo = new NodoSimple(1, "UNO");
        c.enqueue(nuevo);
        nuevo = new NodoSimple(2, "DOS");
        c.enqueue(nuevo);
        nuevo = new NodoSimple(3, "TRES");
        c.enqueue(nuevo);
        c.imprimir();

        while (c.dequeue() != null) {
            c.imprimir();
        }
    }

    static void Palindromo() {
        Pila p = new Pila();
        NodoSimple nuevo;
        String palabra = "alila";
        String palindromo = "";
        for (int i = 0; i < palabra.length(); i++) {
            nuevo = new NodoSimple(i, String.valueOf(palabra.charAt(i)));
            p.push(nuevo);
        }
        while (!p.vacia()) {

            palindromo = palindromo + p.pop().getDesc();
        }
        if (palabra.equals(palindromo)) {
            System.out.println("Es un palindromo");
        } else {
            System.out.println("NO es un palindromo");
        }
    }
    
    static void TestArbolesBinarios(){
        ArbolBinario arbol = new ArbolBinario();
        arbol.insertar(13);
        arbol.insertar(5);
        arbol.insertar(4);
        arbol.insertar(18);
        arbol.insertar(19);
        arbol.insertar(17);
        Nodo raiz = arbol.getRoot();
        arbol.preorden(raiz);
        System.out.println("");
        arbol.inorden(raiz);
        System.out.println("");
        arbol.postorden(raiz);
        System.out.println("");
    }

}
