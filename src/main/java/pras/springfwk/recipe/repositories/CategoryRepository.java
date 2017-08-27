package pras.springfwk.recipe.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import pras.springfwk.recipe.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long>{
	
	Optional<Category> findByDescription(String description);

}
