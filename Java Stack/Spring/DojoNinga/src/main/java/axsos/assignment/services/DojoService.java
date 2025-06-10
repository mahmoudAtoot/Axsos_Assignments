package axsos.assignment.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import axsos.assignment.models.Dojo;
import axsos.assignment.repositories.DojoRepository;

@Service
public class DojoService {
	    @Autowired
	    private DojoRepository dojoRepo;

	    public Dojo createDojo(Dojo dojd) {
	        return dojoRepo.save(dojd);
	    }
	    

	    public Dojo findDojo(Long id) {
	        return dojoRepo.findById(id).orElse(null);
	    }
	    public List<Dojo> findAllDojos() {
	        return dojoRepo.findAll();
	    }
	}