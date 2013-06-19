/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padroes.interfaces.concreto;

import modelo.Pessoa;
import modelo.Sala;
import modelo.concreto.Reserva;
import padroes.interfaces.GerenciarPessoa;
import padroes.interfaces.GerenciarReservas;
import padroes.interfaces.GerenciarSala;

/**
 *  Classe Geral Proxy
 *  
 * @author Giovanna Garcia
 * @author Marcos Agnes
 */
public class GeralProxy implements GerenciarPessoa, GerenciarReservas, GerenciarSala {

    @Override
    public Pessoa criarPessoa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletarPessoa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterarPessoa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Reserva criarReserva() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void liberarReserva() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sala criarSala() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletarSala() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterarSala() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
