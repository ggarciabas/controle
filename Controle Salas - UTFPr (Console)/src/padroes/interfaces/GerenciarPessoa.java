/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padroes.interfaces;

import modelo.Pessoa;

/**
 *  Classe Gerenciar Pessoa
 *  
 * @author Giovanna Garcia
 * @author Marcos Agnes
 */
public interface GerenciarPessoa {
    public Pessoa criarPessoa ();
    
    public void deletarPessoa ();
    
    public void alterarPessoa ();
}
