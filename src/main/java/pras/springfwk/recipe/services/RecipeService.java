package pras.springfwk.recipe.services;

import java.util.Set;

import pras.springfwk.recipe.domain.Recipe;

public interface RecipeService {
	
	Set<Recipe> getRecipes();

}
