/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transferObject;

import java.util.List;

/**
 *
 * @author NIL CARDENAS
 */
public class Venta {
    
    private double total;
    private String date;
    private int idventa;
    private List <DetalleVenta> listaDetalle;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public List <DetalleVenta> getListaDetalle() {
        return listaDetalle;
    }

    public void setListaDetalle(List <DetalleVenta> listaDetalle) {
        this.listaDetalle = listaDetalle;
    }
    
    
    
}
