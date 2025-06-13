package axsos.assignment.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import axsos.assignment.models.Category;
import axsos.assignment.models.Product;
import axsos.assignment.repositories.ProductRepository;



@Service

public class ProductService {
@Autowired 
private ProductRepository productRepo;

public Product createProduct(Product product) {
    return productRepo.save(product);
}
public List<Product> allProduct() {
    return productRepo.findAll();
}

public Product findProductById(Long id) {
	return productRepo.findById(id).orElse(null);
}
//public Product save(Product product) {
//    return productRepo.save(product);
//    }
public void addCategory(Category category,Product product) {
	  product.getCategories().add(category);
	  productRepo.save(product);
}

public List<Product> getProductsByNotContain(Category category){
	  return productRepo.findByCategoriesNotContains(category);
}





}