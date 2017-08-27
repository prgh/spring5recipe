package pras.springfwk.recipe.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pras.springfwk.recipe.domain.Category;
import pras.springfwk.recipe.domain.UnitOfMeasure;
import pras.springfwk.recipe.repositories.CategoryRepository;
import pras.springfwk.recipe.repositories.UnitOfMeasureRepository;
import pras.springfwk.recipe.services.RecipeServiceImpl;

@Controller
public class IndexController {

	private final RecipeServiceImpl recipeServiceImpl;

	public IndexController(RecipeServiceImpl recipeServiceImpl) {
		super();
		this.recipeServiceImpl = recipeServiceImpl;
	}

	@RequestMapping({ "/", "", "index" })
	public String getIndexPage(Model model) {
		model.addAttribute("recipes",recipeServiceImpl.getRecipes());

		System.out.println("test");
		return "index";
	}
}
