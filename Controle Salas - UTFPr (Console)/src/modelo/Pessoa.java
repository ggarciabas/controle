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
package modelo;

import java.util.Date;

/**
 *  Classe Pessoa
 *  
 * @author Giovanna Garcia
 * @author Marcos Agnes
 */
public abstract class Pessoa {

    protected String m_nome;
    protected String m_login;
    protected String m_senha;
    protected Date m_inicio;
    
    public String getNome () {
        return this.m_nome;
    }

    public String getM_login() {
        return m_login;
    }

    public String getM_senha() {
        return m_senha;
    }

    public void setM_nome(String m_nome) {
        this.m_nome = m_nome;
    }

    public void setM_login(String m_login) {
        this.m_login = m_login;
    }

    public void setM_senha(String m_senha) {
        this.m_senha = m_senha;
    }        
    
    public abstract String getDescricao ();
}
