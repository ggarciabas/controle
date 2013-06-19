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
package modelo.concreto;

import modelo.Sala;
import padroes.Decorator;

/**
 *  Classe Carteira
 *          Especifica um determinado objeto dentro da sala.
 *  
 * @author Giovanna Garcia
 * @author Marcos Agnes
 */
public class Carteira extends Decorator {

    private Long m_id;
    private Sala m_sala;

    public Carteira() {
    }

    public Carteira(Sala m_sala) {
        this.m_sala = m_sala;
    }

    public Long getM_id() {
        return m_id;
    }

    public void setM_id(Long m_id) {
        this.m_id = m_id;
    }

    @Override
    public String getIdentificacao() {
        return this.m_sala.getIdentificacao();
    }
}
