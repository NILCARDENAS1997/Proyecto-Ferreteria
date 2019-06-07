
import dao.CategoriaDao;
import java.util.ArrayList;
import transferObject.Categoria;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NIL CARDENAS
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CategoriaDao catedao = new CategoriaDao ();
        ArrayList<Categoria> lista = new ArrayList<>();
        // crear y agregar valores a la categoria
//        Categoria cate = new Categoria();
//        cate.setIdcategoria(2);
//        cate.setDescripcion("Rap");
//        cate.setEstado('S');
//        
//        catedao.insertarCategoria(cate);
        
        lista=catedao.listarCategorias();
        for (int i = 0; i <lista.size(); i++) {
            System.out.println("dato:"+lista.get(i).getDescripcion());
           
            
        }
         catedao.eliminarCategoria(1);

    }
    
}
