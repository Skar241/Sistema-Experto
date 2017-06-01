/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolog;
import org.jpl7.Query;
import org.jpl7.Term;

/**
 *
 * @author Zafiro
 */
public class Prolog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            String conexion= "consult('bd.pl')";
            Query con= new Query(conexion);
            System.out.println(conexion + " " + (con.hasMoreSolutions()? "Aceptado": "False"));
        }catch(Exception e){
            System.out.println("Error de conexion");
        }
        
        
        testTipoCuerpo test = new testTipoCuerpo();
        test.setVisible(true);
    }
    
}
