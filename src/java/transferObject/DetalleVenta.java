/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transferObject;

/**
 *
 * @author NIL CARDENAS
 */
public class DetalleVenta {
    
    private int idDetalleVenta;
    private int dantidad;
    private double subtotal;

    public int getDantidad() {
        return dantidad;
    }

    public void setDantidad(int dantidad) {
        this.dantidad = dantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }
    
    
    
}
