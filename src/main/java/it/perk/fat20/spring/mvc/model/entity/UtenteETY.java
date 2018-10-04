/**
 * 
 */
package it.perk.fat20.spring.mvc.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Perk
 *
 */
@Entity
@Table(name = "utente")
public class UtenteETY implements Serializable{

	/**
	 * Serializable
	 */
	private static final long serialVersionUID = -7614937443631212651L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IDUTENTE")
	private Long idUtente;
	
	@Column(name = "CODFIS")
	private String codiceFiscale;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "COGNOME")
	private String cognome;
	
	@Column(name = "DATAATTIVAZIONE")
	private Date dataAttivazione;
	
	@Column(name = "DATADISATTIVAZIONE")
	private Date dataDisattivazione;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "REGISTRORISERVATO")
	private Long registroRiservato;
	
	@Column(name = "USERNAME")
	private String username;
	
	
	
	public UtenteETY() {
		super();
	}
	
	

	/**
	 * @param idUtente
	 * @param codiceFiscale
	 * @param nome
	 * @param cognome
	 * @param dataAttivazione
	 * @param dataDisattivazione
	 * @param email
	 * @param registroRiservato
	 * @param username
	 */
	public UtenteETY(Long idUtente, String codiceFiscale, String nome, String cognome, Date dataAttivazione,
					 Date dataDisattivazione, String email, Long registroRiservato, String username) {
		super();
		this.idUtente = idUtente;
		this.codiceFiscale = codiceFiscale;
		this.nome = nome;
		this.cognome = cognome;
		this.dataAttivazione = dataAttivazione;
		this.dataDisattivazione = dataDisattivazione;
		this.email = email;
		this.registroRiservato = registroRiservato;
		this.username = username;
	}

	/**
	 * @return the idUtente
	 */
	public Long getIdUtente() {
		return idUtente;
	}

	/**
	 * @param idUtente the idUtente to set
	 */
	public void setIdUtente(Long idUtente) {
		this.idUtente = idUtente;
	}

	/**
	 * @return the codiceFiscale
	 */
	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	/**
	 * @param codiceFiscale the codiceFiscale to set
	 */
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the cognome
	 */
	public String getCognome() {
		return cognome;
	}

	/**
	 * @param cognome the cognome to set
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	/**
	 * @return the dataAttivazione
	 */
	public Date getDataAttivazione() {
		return dataAttivazione;
	}

	/**
	 * @param dataAttivazione the dataAttivazione to set
	 */
	public void setDataAttivazione(Date dataAttivazione) {
		this.dataAttivazione = dataAttivazione;
	}

	/**
	 * @return the dataDisattivazione
	 */
	public Date getDataDisattivazione() {
		return dataDisattivazione;
	}

	/**
	 * @param dataDisattivazione the dataDisattivazione to set
	 */
	public void setDataDisattivazione(Date dataDisattivazione) {
		this.dataDisattivazione = dataDisattivazione;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the registroRiservato
	 */
	public Long getRegistroRiservato() {
		return registroRiservato;
	}

	/**
	 * @param registroRiservato the registroRiservato to set
	 */
	public void setRegistroRiservato(Long registroRiservato) {
		this.registroRiservato = registroRiservato;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
