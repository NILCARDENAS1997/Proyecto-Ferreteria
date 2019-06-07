/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.Conexion;
import interfaz.ICategoria;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import transferObject.Categoria;

/**
 *
 * @author NIL CARDENAS
 */
public class CategoriaDao implements ICategoria {

    @Override
    public ArrayList<Categoria> listarCategorias() {
        ArrayList<Categoria> listaCate = new ArrayList<>();
        Conexion db = new Conexion();
        Connection cn = db.getConnection();
        String procedimientoalmacenado = "{CALL sp_listarcategorias()}";

        //PROCESO
        if (cn != null) {
            try {
                CallableStatement cs = cn.prepareCall(procedimientoalmacenado);
                ResultSet rs = cs.executeQuery();

                while (rs.next()) {
                    Categoria cate = new Categoria();
                    cate.setIdcategoria(rs.getInt("idCategoria"));
                    cate.setDescripcion(rs.getString("descripcion"));
                    cate.setEstado(rs.getString("estado").charAt(0));
                    listaCate.add(cate);

                }

            } catch (SQLException e) {
                System.out.println("error"+e);

            } finally {
                try {
                    cn.close();
                } catch (SQLException e) {
                    System.out.println("error"+e);

                }
            }
        }
        return listaCate;
    }

    @Override
    public boolean insertarCategoria(Categoria cate) {
        boolean insert = false;
        int res;
        Conexion conn= new Conexion ();
        Connection cn = conn.getConnection();
        
        if(cn!=null){
            try {
                 CallableStatement cs =cn.prepareCall("CALL sp_insertarcategoria(?,?,?)");
                 cs.setInt(1,cate.getIdcategoria());
                 cs.setString(2, cate.getDescripcion());
                 cs.setString(3,String.valueOf(cate.getEstado()));
                  res= cs.executeUpdate();
                  if(res==1){
                      insert = true;
                  }

            } catch (SQLException ex) {
                
            }finally{
                try{
                cn.close();
                } catch (SQLException ex){
                }
            }
            
          
        }

        return insert;

    }

    @Override
    public boolean actualizarCategoria(Categoria cate) {

        boolean update = false;
        int res;
        //Nos conectamos
        Conexion conn = new Conexion();
        Connection cn = conn.getConnection();
        //proceso
        
        if(cn!=null){
            try {
                //Se ha conectado exitosamente
                CallableStatement cs = cn.prepareCall("CALL sp_actualizarcategoria(?,?)");
                cs.setString(1,cate.getDescripcion());
                cs.setString(2,String.valueOf(cate.getEstado()));
                cs.setInt(3,cate.getIdcategoria());
                res=cs.executeUpdate();
                
                if(res==1){
                    update = true;
                }
                
            } catch (SQLException ex) {
                
            }
        }
        return update;

    }

    @Override
    public boolean eliminarCategoria(int idCategoria) {
        boolean delete = false;
        int res;
         Conexion conn = new Conexion();
         Connection cn = conn.getConnection();
         
         
         
         if(cn!=null){
             try{
             CallableStatement cs = cn.prepareCall("CALL sp_eliminarcategoria(?)");
             cs.setInt(1,idCategoria);
             res=cs.executeUpdate();
             
             if(res==1){
                    delete = true;
                }
                
            } catch (SQLException ex) {
                
                System.out.println("error"+ex);

            } finally {
                try {
                    cn.close();
                } catch (SQLException e) {
                    System.out.println("error"+e);

                }
            }
        
             
         }

        return delete;

    }

}
