package pras.springfwk.recipe.services;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import pras.springfwk.recipe.domain.Recipe;
import pras.springfwk.recipe.repositories.RecipeRepository;

public class RecipeServiceImplTest {
	
	RecipeService recipeService;
	
	@Mock
	RecipeRepository recipeRepository;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		
		recipeService = new RecipeServiceImpl(recipeRepository);
		
	}

	@Test
	public void testGetRecipes() {
		Recipe recipe = new Recipe();
		HashSet<Recipe> recipesdata = new HashSet<>();
		recipesdata.add(recipe);
		
		when(recipeService.getRecipes()).thenReturn(recipesdata);
		
		Set<Recipe> recipes = recipeService.getRecipes();
		
		assertEquals(recipes.size(), 1);
		
		verify(recipeRepository,times(1)).findAll();
		
	}

}
