package axsos.assignment.repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import axsos.assignment.models.Travels;


@Repository
public interface TravelRepository extends CrudRepository<Travels, Long>{
    List<Travels> findAll();

}