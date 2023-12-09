/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.implemantacionpila;

import java.util.Scanner;

/**
 *
 * @author 50688
 */
public class Principal {
    
    public static void main (String[]args)
    {
        int tam, opcion;
        String dato;
        Scanner teclado = new Scanner (System.in);
        System.out.println ("Elija el tamaño de la pila:");
        tam= teclado.nextInt();
        Pila p1= new Pila (tam);
        do
        {
            System.out.println("1.Agregar comida.");
            System.out.println("2. Eliminar una comida");
            System.out.println("3. Mostrar comida");
            System.out.println("4.Buscar una comida");
            System.out.println("5.Salir");
            System.out.println("Elija una opcion: ");
            opcion = teclado.nextInt();
            switch (opcion)
            {
                case 1:
                    System.out.println("¿Cual comida quiere agregar?");
                    dato=teclado.next();
                    p1.agregarComidas(dato);
                    break;
                    
                case 2:
                    p1.eliminarComidas();
                    break;
                
                case 3:
                    p1.mostrarComidas();
                    break;
                case 4:
                    System.out.println("¿Cuál comida está buscando?");
                    dato=teclado.next();
                    if(p1.buscarComida(dato))
                    {
                        System.out.println("Comida encontrada.");
                    }
                    else
                    {
                        System.out.println("Comida no encontrada.");
                    }
                    break;
                default:
                    System.out.println("elija una opción correcta (1 al 5):");
            }
            }while(opcion!=5);  
        
        
        
    }
}
