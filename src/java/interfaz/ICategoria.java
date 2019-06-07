/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;


import java.util.ArrayList;
import transferObject.Categoria;

/**
 *
 * @author NIL CARDENAS
 */
public interface ICategoria {
    
    public abstract  ArrayList<Categoria> listarCategorias();
    public abstract boolean insertarCategoria(Categoria cate);
    public abstract boolean actualizarCategoria(Categoria cate);
    public abstract boolean eliminarCategoria(int idCategoria);   
}
