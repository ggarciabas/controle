/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.concreto;

import modelo.Pessoa;

/**
 *  Classe Responsavel Geral
 *  
 * @author Giovanna Garcia
 * @author Marcos Agnes
 */
public class ResponsavelGeral extends Pessoa {

    public ResponsavelGeral() {
    }

    @Override
    public String getDescricao() {
        return "Geral";
    }
    
}
