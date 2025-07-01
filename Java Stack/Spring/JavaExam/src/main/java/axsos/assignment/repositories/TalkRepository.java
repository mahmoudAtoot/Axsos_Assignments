package axsos.assignment.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import axsos.assignment.models.Talk;
import axsos.assignment.models.User;


@Repository
public interface TalkRepository extends CrudRepository<Talk, Long> {


    List<Talk> findAll();                                // All projects

}