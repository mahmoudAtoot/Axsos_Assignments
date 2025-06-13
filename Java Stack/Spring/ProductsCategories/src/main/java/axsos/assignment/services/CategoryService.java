package axsos.assignment.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import axsos.assignment.models.Category;
import axsos.assignment.models.Product;
import axsos.assignment.repositories.CategoryRepository;


@Service
public class CategoryService {
@Autowired
private CategoryRepository categoryRepo;

public Category createCategory(Category category) {
    return categoryRepo.save(category);
}

public List<Category> allCategory() {
    return categoryRepo.findAll();
}
public Category findCategoryById(Long id) {
	return categoryRepo.findById(id).orElse(null);
}
public void addProduct(Category category,Product product) {
	  category.getProducts().add(product);
	  categoryRepo.save(category);
  }

public List<Category> getCategoriesByNotContain(Product product){
	  return categoryRepo.findByProductsNotContains(product);
}
}