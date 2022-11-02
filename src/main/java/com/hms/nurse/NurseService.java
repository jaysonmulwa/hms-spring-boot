package com.hms.nurse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class NurseService {

    @Autowired
    private NurseRepository nurseRepository;

    public List<Nurse> getAllNurses() {
        List<Nurse> nurse = new ArrayList<>();
        nurseRepository.findAll().forEach(nurse::add);
        return nurse;
    }

    public Optional<Nurse> getNurse(int id){
        Optional<Nurse> byId = nurseRepository.findById(id);
        return byId;
    }

    public void addNurse(Nurse nurse) {
        nurseRepository.save(nurse);
    }

    public void updateNurse(int id, Nurse nurse) {
        nurseRepository.save(nurse);
    }

    public void deleteNurse(int id) {
        nurseRepository.deleteById(id);
    }

}
