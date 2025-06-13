package axsos.assignment.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import axsos.assignment.models.Category;
import axsos.assignment.models.Product;


@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
	List<Product>findAll();
	 List<Product> findByCategoriesNotContains(Category category);

}