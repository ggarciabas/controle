/*
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2 as
 * published by the Free Software Foundation;
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package padroes.interfaces.concreto;

import enumeracoes.TipoPessoa;
import excecoes.PessoaException;
import java.io.IOException;
import modelo.Pessoa;
import modelo.Sala;
import modelo.concreto.Reserva;
import padroes.interfaces.GerenciarPessoa;
import padroes.interfaces.GerenciarReservas;
import padroes.interfaces.GerenciarSala;

/**
 *  Classe Professor Proxy
 *  
 * @author Giovanna Garcia
 * @author Marcos Agnes
 */
public class ProfessorProxy implements GerenciarPessoa, GerenciarReservas, GerenciarSala {

    @Override
    public Pessoa criarPessoa(TipoPessoa tp) throws PessoaException, IOException {
        System.out.println("---> Professor Pessoa - criarPessoa(): esta pessoa não pode criar uma pessoa.");
        throw new PessoaException("O usuario não possui permissão para efetuar o cadastro de uma nova pessoa.");
    }

    @Override
    public void deletarPessoa(Pessoa p) throws PessoaException, IOException {
        System.out.println("---> Professor Pessoa - criarPessoa(): esta pessoa não pode deletar uma pessoa.");
        throw new PessoaException("O usuario não possui permissão para deletar uma pessoa.");        
    }

    @Override
    public void alterarPessoa(Pessoa p) throws PessoaException, IOException {
        System.out.println("---> Professor Pessoa - criarPessoa(): esta pessoa não pode alterar uma pessoa.");
        throw new PessoaException("O usuario não possui permissão para alterar uma pessoa.");
    }

    @Override
    public Reserva criarReserva(Pessoa p) {
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
    public void deletarSala(Sala s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterarSala(Sala s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
