package axsos.assignment.services;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import axsos.assignment.models.Ninja;
import axsos.assignment.repositories.NinjaRepository;

@Service
public class NinjaService {


    @Autowired
    private NinjaRepository  ninjaRepo;

    public List<Ninja> findAllNinjas() {
        return ninjaRepo.findAll();
    }

    public Ninja createNinja(Ninja ninja) {
        return ninjaRepo.save(ninja);
    }

    public Ninja findNinja(Long id) {
        return ninjaRepo.findById(id).orElse(null);
    }

	
//		public Person findById(Long id) {
//	        Optional<Person> optionalPerson = personRepository.findById(id);
//	        if(optionalPerson.isPresent()) {
//	            return optionalPerson.get();
//	        } else {
//	            return null;
//	        }
//	    }
	}