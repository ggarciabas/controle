/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padroes.interfaces;

import modelo.Sala;

/**
 *  Classe Gerenciar Sala
 *  
 * @author Giovanna Garcia
 * @author Marcos Agnes
 */
public interface GerenciarSala {
    public Sala criarSala ();
    public void deletarSala ();
    public void alterarSala ();
}
