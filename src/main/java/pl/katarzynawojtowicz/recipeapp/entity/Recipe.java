package pl.katarzynawojtowicz.recipeapp.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "recipe")
public class Recipe {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int id;

	@Column
	private String name;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_user")
	private User user;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_role")
	private User role;

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.EAGER)
	@JoinTable(name = "recipe_category_recipe", joinColumns = @JoinColumn(name = "id_recipe"), inverseJoinColumns = @JoinColumn(name = "id_category"))
	private Set<CategoryRecipe> categories;

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.EAGER)
	@JoinTable(name = "recipe_step", joinColumns = @JoinColumn(name = "id_recipe"), inverseJoinColumns = @JoinColumn(name = "id_step"))
	private Set<Step> steps;

	public Recipe() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getRole() {
		return role;
	}

	public void setRole(User role) {
		this.role = role;
	}

	public Set<CategoryRecipe> getCategories() {
		return categories;
	}

	public void setCategories(Set<CategoryRecipe> categories) {
		this.categories = categories;
	}

	public Set<Step> getSteps() {
		return steps;
	}

	public void setSteps(Set<Step> steps) {
		this.steps = steps;
	}

}
