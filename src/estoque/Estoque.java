/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque;

import com.estoque.banco.ConexaoBD;

/**
 *
 * @author mathe
 */
public class Estoque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ConexaoBD conex = new ConexaoBD();
        
        conex.getConectar();

    }
    
}