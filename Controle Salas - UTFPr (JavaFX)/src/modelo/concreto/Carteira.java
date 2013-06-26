/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.concreto;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import modelo.Sala;
import padroes.Decorator;

/**
 *  Classe Carteira
 *          Especifica um determinado objeto dentro da sala.
 *  
 * @author Giovanna Garcia
 * @author Marcos Agnes
 */
@Entity
public class Carteira extends Decorator implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long m_id;
    @OneToMany
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
