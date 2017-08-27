package pras.springfwk.recipe.repositories;

import org.springframework.data.repository.CrudRepository;

import pras.springfwk.recipe.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe,Long>{
}
