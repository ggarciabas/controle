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
import java.util.Scanner;
import modelo.Pessoa;
import modelo.Sala;
import modelo.concreto.Professor;
import modelo.concreto.Reserva;
import modelo.concreto.ResponsavelGeral;
import modelo.concreto.ResponsavelSetor;
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
    public Pessoa criarPessoa(TipoPessoa tp) {
        System.out.println("---> Geral Pessoa - criarPessoa(): este usuário pode criar uma pessoa.");
        Pessoa p = null;
        switch (tp) {
            case RESPONSAVEL_GERAL: {
                p = new ResponsavelGeral();
            }
                break;
            case RESPONSAVEL_SETOR: {
                p = new ResponsavelSetor();
            }
                break;
            case PROFESSOR: {
                p = new Professor();
            }
                break;
        }
        // Leitura dos dados      
        Scanner s = new Scanner(System.in);
        System.out.println("-------->(in): Informe o nome da pessoa: ");
        p.setM_nome(s.nextLine());
        System.out.println("-------->(in): Informe o login da pessoa: ");
        p.setM_login(s.nextLine());
        System.out.println("-------->(in): Informe o senha da pessoa: ");
        p.setM_senha(s.nextLine());
        // Impressao dos dados
        System.out.println("-------->(out): Nome \t"+p.getNome());
        System.out.println("-------->(out): Login \t"+p.getM_login());
        System.out.println("-------->(out): Senha \t"+p.getM_senha());
        System.out.println("-------->(out): Descricao \t"+p.getDescricao());
        
        return p;
    }

    @Override
    public void deletarPessoa(Pessoa p) {
        System.out.println("---> Geral Pessoa - deletarPessoa(): este usuário pode deletar uma pessoa.");
    }

    @Override
    public void alterarPessoa(Pessoa p) {
        System.out.println("---> Geral Pessoa - alterarPessoa(): este usuário pode alterar uma pessoa.");
    }

    @Override
    public Reserva criarReserva(Pessoa p) {
        System.out.println("---> Geral Pessoa - criarReserva(): esta pessoa pode criar uma reserva.");
        Reserva r = null;
        // Validar a sala que o usuario quer reservar
        
        return r;
    }

    @Override
    public void liberarReserva() {
        System.out.println("---> Geral Pessoa - liberarReserva(): esta pessoa pode liberar uma reserva.");
    }

    @Override
    public Sala criarSala() {
        System.out.println("---> Geral Pessoa - criarSala(): esta pessoa pode criar uma sala.");
        Sala s = null;
        // Criar a sala e solicitar os dados da mesma
        
        return s;
    }

    @Override
    public void deletarSala(Sala s) {
        System.out.println("---> Geral Pessoa - deletarSala(): esta pessoa pode deletar uma sala.");
    }

    @Override
    public void alterarSala(Sala s) {
        System.out.println("---> Geral Pessoa - alterarSala(): esta pessoa pode alterar uma sala.");
    }
    
}
