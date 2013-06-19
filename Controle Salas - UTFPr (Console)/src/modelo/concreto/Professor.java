/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.concreto;

import modelo.Pessoa;

/**
 *  Classe Professor
 *  
 * @author Giovanna Garcia
 * @author Marcos Agnes
 */
public class Professor extends Pessoa {

    public Professor() {
    }    
    
    @Override
    public String getDescricao() {
        return "Pessoa";
    }
    
}
