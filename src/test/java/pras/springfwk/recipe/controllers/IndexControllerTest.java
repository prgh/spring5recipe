package pras.springfwk.recipe.controllers;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.mockito.ArgumentMatchers.anySet;
import static org.mockito.ArgumentMatchers.eq;


import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;

import pras.springfwk.recipe.services.RecipeServiceImpl;

public class IndexControllerTest {

	IndexController indexController;
	
	@Mock
	RecipeServiceImpl recipeServiceImpl;
	
	@Mock
	Model model;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		indexController = new IndexController(recipeServiceImpl);
		
	}
	
	@Test
	public void testMockMvc() throws Exception {
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(indexController).build();
		mockMvc.perform(get("/")).andExpect(status().isOk()).andExpect(view().name("index"));
	}

	@Test
	public void testGetIndexPage() {
		
		//when(indexController.getIndexPage(model)).thenReturn("index");
		
		String indexpage = indexController.getIndexPage(model);
		
		assertEquals("index", indexpage);
		
		//verify(recipeServiceImpl,times(1)).getClass();
		//verify(model,times(1)).addAttribute(eq("recipes"), anySet());
		
	}

}
