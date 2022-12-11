package com.hms.nurse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class NurseController {

    @Autowired
    private NurseService nurseService;

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping("/nurse")
    public List<Nurse> getAllNurses() {
        return nurseService.getAllNurses();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping("/nurse/{id}")
    public Optional<Nurse> getNurse(@PathVariable int id) {
        return nurseService.getNurse(id);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(method = RequestMethod.POST, value="/nurse")
    public void addNurse(@RequestBody Nurse nurse) {
        nurseService.addNurse(nurse);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(method = RequestMethod.PUT, value="/nurse/{id}")
    public void updateNurse(@PathVariable int id, @RequestBody Nurse nurse) {
        nurseService.updateNurse(id, nurse);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(method = RequestMethod.DELETE, value="/nurse/{id}")
    public void deleteNurse(@PathVariable int id) {
        nurseService.deleteNurse(id);
    }
}
