package pl.katarzynawojtowicz.recipeapp.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.katarzynawojtowicz.recipeapp.entity.Recipe;
import pl.katarzynawojtowicz.recipeapp.repository.RecipeRepository;
import pl.katarzynawojtowicz.recipeapp.service.RecipeService;
import pl.katarzynawojtowicz.recipeapp.to.RecipeTo;

@Transactional
@Service
public class RecipeServiceImpl implements RecipeService {

	@Autowired
	private RecipeRepository recipeRepository;

	private ModelMapper modelMapper = new ModelMapper();

	@Override
	public List<RecipeTo> findAll() {
		List<Recipe> recipeEnities = recipeRepository.findAll();
		List<RecipeTo> results = new ArrayList<>();

		for (Recipe recipe : recipeEnities) {
			results.add(modelMapper.map(recipe, RecipeTo.class));
		}
		return results;
	}

	@Override
	public RecipeTo create(RecipeTo recipeTo) {
		recipeRepository.save(modelMapper.map(recipeTo, Recipe.class));
		return null;
	}

	@Override
	public void delete(int id) {
		recipeRepository.deleteById(id);
	}

	@Override
	public RecipeTo findByid(int id) {
		Optional<Recipe> recipeEntities = recipeRepository.findById(id);
		RecipeTo result = modelMapper.map(recipeEntities, RecipeTo.class);
		return result;
	}

}
