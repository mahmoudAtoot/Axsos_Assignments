package axsos.assignment.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import axsos.assignment.models.Burger;
import axsos.assignment.repositories.BurgerRepository;


@Service
public class BurgerService {
	@Autowired
	BurgerRepository burgerRepository;

	
	public List<Burger> allBurgers() {
        return burgerRepository.findAll();
    }
	public Burger createBurger(Burger b) {
        return burgerRepository.save(b);
    }
	
	public Burger findBurger(Long id) {
        return burgerRepository.findById(id).orElse(null);
    }
	
	public Burger updateBurger(Burger b) {
        return burgerRepository.save(b);
    }
}