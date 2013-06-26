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

import modelo.concreto.Disponivel;

/**
 *  Classe Sala
 *      Esta classe representa as salas que existem na UTFPr e estão disponíveis 
 *  para o uso.
 * 
 * @author Giovanna Garcia
 * @author Marcos Agnes
 */
public abstract class Sala {
    protected String m_identificacao = "Sala sem identificação";
    // Estado da sala
    protected Estado m_estadoOcupado;
    protected Estado m_estadoDisponivel;
    protected Estado m_estado = new Disponivel(this);

    // Gets
    public Estado getEstadoOcupado () {
        return this.m_estadoOcupado;
    }
    
    public Estado getEstadoDisponivel () {
        return this.m_estadoDisponivel;
    }        
    
    public String getIdentificacao () {
        return m_identificacao;
    }

    // Sets
    public void setEstado (Estado estado) {
        this.m_estado = estado;
    }
    
    /*
     *  Reservar Sala
     *      Método para reserva de sala.
     *  
     *  @public
     *  @return void
     */
    public void reservarSala () {
       this.m_estado.reservarSala();
    }
    
    /*
     *  Reservar Sala
     *      Método para liberação de sala.
     *  
     *  @public
     *  @return void
     */
    public void liberarSala() {
        this.m_estado.liberarSala();
    }
    
}
