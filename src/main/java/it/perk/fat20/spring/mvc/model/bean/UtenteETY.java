/**
 * 
 */
package it.perk.fat20.spring.mvc.model.bean;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * @author Perk
 *
 */
@Entity()
public class UtenteETY implements Serializable{

	/**
	 * Serializable
	 */
	private static final long serialVersionUID = -7614937443631212651L;
	
	private String name;
	
	private String surname;
	
	private String descRole;
	
	public UtenteETY() {
		super();
	}
	
	public UtenteETY(String inName, String inSurname, String inDescRole) {
		super();
		name = inName;
		surname = inSurname;
		descRole = inDescRole;
		
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return the descRole
	 */
	public String getDescRole() {
		return descRole;
	}

	/**
	 * @param descRole the descRole to set
	 */
	public void setDescRole(String descRole) {
		this.descRole = descRole;
	}
	
	
}
