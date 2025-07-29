/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.evaluativokenethmendez;

/**
 *
 * @author mendeken
 */
//Esta clase recorrera la lista de solicitudes y mostrará cada uno de sus elementos
//cabe recalcar que el método va utilizar punteros al siguiente elemento para su recorrido
public class ListaSolicitudes {
    //Declaración de variables
    
    private Solicitud cabeza; //variable tipo Solicitud que actua como nodo
    private int contador = 1;
    
    
    //Método para agregar una solicitud
    public void agregarSolicitud(String nombreSolicitante)
    {
        Solicitud nueva = new Solicitud(contador ++, nombreSolicitante);
        if (cabeza == null)
        {
            cabeza = nueva;
        }else
        {
            Solicitud actual = cabeza;
            while (actual.siguiente != null)
            {
                actual = actual.siguiente;
            }
            actual.siguiente = nueva;
        
        }
    
    }
    
    //Método para eliminar Solicitud popr Id
    public boolean eliminarSolicitudPorId(int id)
    {
        if (cabeza == null) return false;//Si la lista está vacía, no hay nada que eliminar
        if (cabeza.idPelicula == id)
        {
            cabeza = cabeza.siguiente;
            return true;
        }
        
        Solicitud actual = cabeza;
        while (actual.siguiente != null && actual.siguiente.idPelicula != id)
        {
            actual = actual.siguiente;
        }
        
        if  (actual.siguiente != null)
        {
            actual.siguiente = actual.siguiente.siguiente;
            return true;
        }
        return false;
    }
    
    //Método que obtiene las solicitudes como un arreglo (Jtable)
    public Solicitud[] obtenerSolicitudesComoArreglo()
    {
        int tam = contar();//Cuenta cuántas solicitudes hay
        Solicitud[] arr = new Solicitud[tam];//Crea un arreglo del tamaño contado
        Solicitud actual = cabeza;
        int i = 0;
        while (actual != null)
        {
            arr[i++] = actual;
            actual = actual.siguiente;
        
        }
        return arr;
    }
    
    //Método que cuenta la cantidad de nodos de tipo Solicitud que hay en la lista
    public int contar()
    {
        int count = 0;
        Solicitud actual = cabeza;
        while (actual != null)
        {
            count++;
            actual = actual.siguiente;
        }
        return count;
    }
    
}
