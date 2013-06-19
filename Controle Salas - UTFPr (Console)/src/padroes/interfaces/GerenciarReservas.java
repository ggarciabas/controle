/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padroes.interfaces;

import modelo.concreto.Reserva;

/**
 *  Classe Gerenciar Reservas
 *  
 * @author Giovanna Garcia
 * @author Marcos Agnes
 */
public interface GerenciarReservas {
    public Reserva criarReserva ();
    public void liberarReserva ();
}
