package pras.springfwk.recipe.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import pras.springfwk.recipe.domain.Recipe;
import pras.springfwk.recipe.repositories.RecipeRepository;

@Service
public class RecipeServiceImpl implements RecipeService{
 
	private final RecipeRepository recipeRepository;
	
	
	public RecipeServiceImpl(RecipeRepository recipeRepository) {
		super();
		this.recipeRepository = recipeRepository;
	}
	
	@Override
	public Set<Recipe> getRecipes() {
	
		Set<Recipe> recipes = new HashSet<>();
		recipeRepository.findAll().iterator().forEachRemaining(recipes::add);
		return recipes;
	}



	

}
