/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.evaluativokenethmendez;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author mendeken
 */
public class SolicitudTableModel extends AbstractTableModel {
    
    private String[] columnas = {"ID", "Nombre", "Edad", "Precio", "Pagado"};
    private Solicitud[] datos;
    
    
    public SolicitudTableModel(Solicitud[] datos)
    {
        this.datos = datos;
    }
    
    @Override
    public int getRowCount()
    {
        return datos.length;
    }
    
    @Override
    public int getColumnCount()
    {
        return columnas.length;
    }
    
    @Override
    public Object getValueAt(int fila, int columna)
    {
        Solicitud s = datos[fila];
        switch (columna)
            {
                case 0: return s.idPelicula;
                case 1: return s.nombreSolicitante;
                case 2: return s.edad;
                case 3: return s.precio;
                case 4: return s.pagado ? "Sí" : "No";
                default: return null;

            }
    
    }
    @Override
    public String getColumnName(int columna)
    {
        return columnas[columna];
    }
    public Solicitud getSolicitudEnFila(int fila)
    {
        return datos[fila];
    }

}
