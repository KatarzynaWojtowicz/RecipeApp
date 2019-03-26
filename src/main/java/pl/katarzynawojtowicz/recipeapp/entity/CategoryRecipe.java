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
import javax.persistence.Table;

@Entity
@Table(name = "category_recipe")
public class CategoryRecipe {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int id;

	@Column
	private String name;

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.EAGER)
	@JoinTable(name = "recipe_category_recipe", joinColumns = @JoinColumn(name = "id_category"), inverseJoinColumns = @JoinColumn(name = "id_recipe"))
	private Set<Recipe> recipe;

	public CategoryRecipe() {
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

	public Set<Recipe> getRecipe() {
		return recipe;
	}

	public void setRecipe(Set<Recipe> recipe) {
		this.recipe = recipe;
	}

}
