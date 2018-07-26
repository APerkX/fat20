/**
 * 
 */
package it.perk.fat20.spring.mvc.model.bean;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Perk
 * 
 * Enttò di test utilizzata per il lancio di un controller
 *
 */
public class TestETY {

	/**
	 * Serializable
	 */
	private static final long serialVersionUID = -7614937443631212653L;
	
	private String nome;
	
	private String cognome;
	
	private Integer eta;
	
	private Date dataNascita;
	
	public TestETY(String inNome, String inCognome, Integer inEta, Date inDataNascita) {
		super();
		nome = inNome;
		cognome = inCognome;
		eta = inEta;
		dataNascita = inDataNascita;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @return the cognome
	 */
	public String getCognome() {
		return cognome;
	}

	/**
	 * @return the eta
	 */
	public Integer getEta() {
		return eta;
	}

	/**
	 * @return the dataNascita
	 */
	public Date getDataNascita() {
		return dataNascita;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cognome == null) ? 0 : cognome.hashCode());
		result = prime * result + ((dataNascita == null) ? 0 : dataNascita.hashCode());
		result = prime * result + ((eta == null) ? 0 : eta.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestETY other = (TestETY) obj;
		if (cognome == null) {
			if (other.cognome != null)
				return false;
		} else if (!cognome.equals(other.cognome))
			return false;
		if (dataNascita == null) {
			if (other.dataNascita != null)
				return false;
		} else if (!dataNascita.equals(other.dataNascita))
			return false;
		if (eta == null) {
			if (other.eta != null)
				return false;
		} else if (!eta.equals(other.eta))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
	
}
