/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *  Classe Pessoa
 *  
 * @author Giovanna Garcia
 * @author Marcos Agnes
 */
public abstract class Pessoa {

    private String m_nome;
    
    public String getNome () {
        return this.m_nome;
    }
    
    public abstract String getDescricao ();
}
