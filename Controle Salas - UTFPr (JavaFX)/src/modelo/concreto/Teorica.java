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

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import modelo.Sala;

/**
 *
 * @author giovanna
 */
@Entity
public class Teorica extends Sala implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long m_id;

    public Teorica() {
        super.m_identificacao = "Teórica";
        this.m_estadoDisponivel = new Disponivel(this);
        this.m_estadoOcupado = new Ocupado(this);
    }    

    public Long getM_Id() {
        return m_id;
    }

    public void setM_Id(Long id) {
        this.m_id = id;
    }
    
}