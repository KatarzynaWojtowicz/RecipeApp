package pl.katarzynawojtowicz.recipeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.katarzynawojtowicz.recipeapp.entity.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> {

}
