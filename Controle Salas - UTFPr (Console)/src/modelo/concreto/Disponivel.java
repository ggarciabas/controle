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

import padroes.State;
import modelo.Sala;

/**
 * Classe Disponível
 *
 * @description State de uma sala.
 * 
 * @author Giovanna Garcia
 * @author Marcos Agnes
 */
public class Disponivel implements State{

    private Sala m_sala;
    
    public Disponivel (Sala sala) {
        this.m_sala = sala;
    }
    
    @Override
    public void reservarSala() {
        // ocupar a sala
    }

    @Override
    public void liberarSala() {
        // Ja esta liberado
    }
    
}
