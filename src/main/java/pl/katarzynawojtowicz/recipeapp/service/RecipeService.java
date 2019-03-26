package pl.katarzynawojtowicz.recipeapp.service;

import java.util.List;

import pl.katarzynawojtowicz.recipeapp.to.RecipeTo;

public interface RecipeService {

	public List<RecipeTo> findAll();

	public RecipeTo findByid(int id);

	public RecipeTo create(RecipeTo recipeTo);

	public void delete(int id);

}
