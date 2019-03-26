package pl.katarzynawojtowicz.recipeapp.to;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserTo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;

	@NotNull
	@Size(max = 255)
	private String name;

	@NotNull
	@Size(max = 255)
	private String lastName;

	@NotNull
	@Size(max = 255)
	private String login;

	@NotNull
	@Size(max = 255)
	private String emali;

	@NotNull
	@Size(max = 255)
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmali() {
		return emali;
	}

	public void setEmali(String emali) {
		this.emali = emali;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
