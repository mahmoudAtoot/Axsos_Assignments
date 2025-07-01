package axsos.assignment.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import axsos.assignment.models.Talk;
import axsos.assignment.repositories.TalkRepository;

@Service
public class TalkService {
    @Autowired
    private TalkRepository talkRepo;

    public Talk createTalk(Talk talk) {
        return talkRepo.save(talk);
    }

    public Talk findTalk(Long id) {
        return talkRepo.findById(id).orElse(null);
    }

    public List<Talk> findAllTalks() {
        return talkRepo.findAll();
    }

    public Talk updateTalk(Talk talk) {
        return talkRepo.save(talk); // same as create, but more semantic
    }

    public void deleteTalk(Long id) {
        talkRepo.deleteById(id);
    }
}