/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.evaluativokenethmendez;

/**
 * 
 * @author mendeken
 */

// Esta clase se encargará del registro de las solicitudes de entradas

public class Solicitud {
    
    //Declaración de variables
    int idPelicula;
    String nombreSolicitante;
    int edad;
    int precio;
    boolean pagado;
    Solicitud siguiente;
    
    //Constructor
    
    public Solicitud(int id, String nombre)
    {
        this.idPelicula = id;
        this.nombreSolicitante = nombre;
        this.edad = (int)(Math.random() * (100-12+1) + 12);
        this.precio = calcularPrecio (this.edad);
        this.pagado = false;
        this.siguiente = null;
    
    }
    
    //Método para calcular el precio según el rango de edad
    private int calcularPrecio(int edad)
    {
        if (edad <= 20) return 2000;
        if (edad <= 64) return 2500;
        return 1500;
    }
    
    
}
