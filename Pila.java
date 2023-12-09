/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.implemantacionpila;

/**
 *
 * @author 50688
 */
public class Pila {
    private int tope=0,maximo;
    private String pilaComidas[];
    
    public Pila(int max){
        maximo=max;
        pilaComidas=new String[maximo];
    }
    public void agregarComidas(String comida){
        
    if(tope<maximo){
        pilaComidas[tope]=comida;
        tope++;
        System.out.println("El dato ha sido agregado!"); 
        
    }
    
    else{
            System.out.println("La pila está llena");
    }
    
    }
    public void eliminarComidas(){
        
        if(tope>0){
            System.out.println("El dato ha sido elimnado.");
            tope--;
        }
        else{
            System.out.println("No hay datos para eliminar.");
            
        }
    }
    public boolean estaVacia(){
        
        if(tope<=0){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean buscarComida(String dato){
        boolean encontrado=false;
        if(!estaVacia())
        {
            for(int i=(tope-1);i>=0;i--){
                if(pilaComidas[i].equals(dato))
                {
                    encontrado=true;
                }
            }
        }    
                else{
                System.out.println("No existe datos para buscar. ");
                
                }
            
                return encontrado;
            }
    public void mostrarComidas(){
    
         if(!estaVacia())
         {
             for(int i=(tope-1);i>=0;i--)
             {
                 System.out.println(pilaComidas[i]);
             }
         }
         else
         {
             System.out.println("La pila esta vacía!");
         }
    }
    
}
