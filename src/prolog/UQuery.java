/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolog;

import java.util.Map;
import org.jpl7.Query;
import org.jpl7.Term;

/**
 *
 * @author Antonio
 */
public class UQuery {
    private final String cons;
    public UQuery(){
        cons = "consult('drHouse.pl')";
    }
    
    public String getQuery(String name){
        Query q1 = new Query(this.cons);
        System.out.println(q1.hasSolution() ? "Conexión correcta" : "Conexión fallida");
        Query q2 = new Query("recetar_a(X,"+name+")");
        String tmp = "";
        while(q2.hasMoreSolutions()){
            Map<String, Term> sol = q2.nextSolution();
            tmp += sol.get("X")+"\n";
        }
        return tmp;
    }
    
}
