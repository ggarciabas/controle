/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.concreto;

import modelo.Pessoa;

/**
 *  Classe Responsavel Setor
 *  
 * @author Giovanna Garcia
 * @author Marcos Agnes
 */
public class ResponsavelSetor extends Pessoa {

    public ResponsavelSetor() {
    }   
    
    @Override
    public String getDescricao() {
        return "Setor";
    }
    
}
