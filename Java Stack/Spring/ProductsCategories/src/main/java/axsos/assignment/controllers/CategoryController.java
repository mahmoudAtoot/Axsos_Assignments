package axsos.assignment.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import axsos.assignment.models.Category;
import axsos.assignment.models.Product;
import axsos.assignment.models.User;
import axsos.assignment.services.CategoryService;
import axsos.assignment.services.ProductService;
import axsos.assignment.services.UserService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class CategoryController {
	@Autowired 
	private CategoryService categoryServic;
	@Autowired 
	private ProductService productServic;
	@Autowired 
	private UserService userService;

	
	@GetMapping("/newCategory")
	public String newCategory(Model model,HttpSession session) {
		if (session.getAttribute("userId")==null) {
	        return "redirect:/loginPage";
		}
		Long userId = (long)session.getAttribute("userId");
		User user = userService.findUserById(userId);
		
		model.addAttribute("user",user);
		model.addAttribute("Category",new Category());
		return "newCategory";
	}
	
	@PostMapping("/category/form")
	public String createCategory(@Valid @ModelAttribute ("Category") Category Category,BindingResult result,Model model,HttpSession session) {
		if (session.getAttribute("userId")==null) {
	        return "redirect:/loginPage";
		}
		Long userId = (long)session.getAttribute("userId");
		User user = userService.findUserById(userId);
		
		model.addAttribute("user",user);
		if(result.hasErrors()) {
			model.addAttribute("category" ,Category);
			return "newCategory";
		}
		categoryServic.createCategory(Category);
		return "redirect:/home";
		}
	
	@GetMapping("/categories/{id}")
    public String categoriesshow(@PathVariable Long id,Model model,HttpSession session) {
		if (session.getAttribute("userId")==null) {
	        return "redirect:/loginPage";
		}
		Long userId = (long)session.getAttribute("userId");
		User user = userService.findUserById(userId);
		
		model.addAttribute("user",user);
		Category category = categoryServic.findCategoryById(id);
		model.addAttribute("category"  , category);
		model.addAttribute("unassigned", productServic.getProductsByNotContain(category));
		return "categoryDetails";
		
	}
	@PostMapping("/categories/{id}/addProduct")
	public String addProduct(@RequestParam Long productId,@PathVariable("id") Long categoryId,HttpSession session,Model model) {
		if (session.getAttribute("userId")==null) {
	        return "redirect:/loginPage";
		}
		Long userId = (long)session.getAttribute("userId");
		User user = userService.findUserById(userId);
		
		model.addAttribute("user",user);
		Category category = categoryServic.findCategoryById(categoryId);
		Product product = productServic.findProductById(productId);
		
		categoryServic.addProduct(category, product);
		
		return "redirect:/categories/" + categoryId;
	}
	
	
	
}