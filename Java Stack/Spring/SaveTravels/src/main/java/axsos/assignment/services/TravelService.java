package axsos.assignment.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import axsos.assignment.models.Travels;
import axsos.assignment.repositories.TravelRepository;


@Service
public class TravelService {

	@Autowired
	TravelRepository travelRepository;
	
	public List<Travels> allTravels() {
        return travelRepository.findAll();
    }
	public Travels createTravels(Travels b) {
        return travelRepository.save(b);
    }
	
	public Travels findTravels(Long id) {
        return travelRepository.findById(id).orElse(null);
    }
	
	public Travels updateTravels(Travels b) {
        return travelRepository.save(b);
    }
	
	public void deleteTravel(Long id) {
		travelRepository.deleteById(id);
		
	}
}