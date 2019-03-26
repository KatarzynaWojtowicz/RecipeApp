package pl.katarzynawojtowicz.recipeapp.to;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import pl.katarzynawojtowicz.recipeapp.entity.Role;
import pl.katarzynawojtowicz.recipeapp.entity.User;

public class RecipeTo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;

	@NotNull
	@Size(max = 255)
	private String name;

	@NotNull
	private User idUser;

	@NotNull
	private Role idRole;

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

	public User getIdUser() {
		return idUser;
	}

	public void setIdUser(User idUser) {
		this.idUser = idUser;
	}

	public Role getIdRole() {
		return idRole;
	}

	public void setIdRole(Role idRole) {
		this.idRole = idRole;
	}

	public RecipeTo() {
		super();
		// TODO Auto-generated constructor stub
	}

}
