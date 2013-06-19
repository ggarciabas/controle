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

/**
 *  Laboratório Química
 *  
 * @author Giovanna Garcia
 * @author Marcos Agnes
 */
public class LaboratorioQuimica extends Sala {
    private Long m_id;

    public LaboratorioQuimica() {
        super.m_identificacao = "Laboratório de Química";
        this.m_estadoDisponivel = new Disponivel(this);
        this.m_estadoOcupado = new Ocupado(this);
    }    

    public Long getM_id() {
        return m_id;
    }

    public void setM_id(Long m_id) {
        this.m_id = m_id;
    }
}
