/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;
/**
 * @autor Rosalba Peralta
 */
import Nodos.Nodo;

public class ArbolBinario {
    Nodo root;
    
    public ArbolBinario(){
        root = null;
    }
        
    public Nodo getRoot(){
        return root;
    }
    
    public void insertar(int valor){
        Nodo nodo = new Nodo(valor);        
        if (root == null) {
            root = nodo;
            return;
        }        
        Nodo auxnodo = root;
        Nodo parent;
        while(true){
            parent = auxnodo;
            //Si el valor es menor insertar a la izquierda.
            if(valor < auxnodo.getValor()){
                auxnodo = auxnodo.getHijoIzquierdo();
                if(auxnodo == null){
                    parent.setHijoIzquierdo(nodo);
                    return;
                }                
            }
            //Si no insertar a la derecha.
            else{
                auxnodo = auxnodo.getHijoDerecho();
                if(auxnodo == null){
                    parent.setHijoDerecho(nodo);
                    return;
                } 
            }
        }
        
    }
    
    
    public Nodo buscar(int valor){
        Nodo nodo = this.root;
        System.out.println("Visitando elementos");
        if (this.root==null)         
                return null;           
        while(nodo.getValor()!=valor){
            //if (nodo!=null)
                System.out.println(nodo.getValor());            
            if (valor < nodo.getValor()) //Visitando lado izquierdo
            {
                nodo=nodo.getHijoIzquierdo();
            }else {
                nodo=nodo.getHijoDerecho();
            }
            //Si no se encuentra se devuelve el valor nulo
            if (nodo==null)            
                return null;                  
        }
        return nodo;
    }
        
    public void preorden(Nodo nodo){       
        if(nodo != null){
           System.out.print("   "+nodo.getValor());
           preorden(nodo.getHijoIzquierdo());
           preorden(nodo.getHijoDerecho());
       }
    }
    
    public void inorden(Nodo nodo){
      if(nodo != null){           
           inorden(nodo.getHijoIzquierdo());
           System.out.print(nodo.getValor()+"    ");
           inorden(nodo.getHijoDerecho());
       }  
    }
    
    
    public void postorden(Nodo nodo){
        if(nodo != null){           
           postorden(nodo.getHijoIzquierdo());           
           postorden(nodo.getHijoDerecho());
           System.out.print(nodo.getValor()+"    ");
       }
    }
}
