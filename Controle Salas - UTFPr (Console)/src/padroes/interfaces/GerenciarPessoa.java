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
package padroes.interfaces;

import enumeracoes.TipoPessoa;
import excecoes.PessoaException;
import java.io.IOException;
import modelo.Pessoa;

/**
 *  Classe Gerenciar Pessoa
 *  
 * @author Giovanna Garcia
 * @author Marcos Agnes
 */
public interface GerenciarPessoa {
    public Pessoa criarPessoa (TipoPessoa tp) throws PessoaException, IOException;
    
    public void deletarPessoa (Pessoa p) throws PessoaException, IOException;
    
    public void alterarPessoa (Pessoa p) throws PessoaException, IOException;
}
