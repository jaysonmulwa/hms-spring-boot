package com.hms.staff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StaffService {

    @Autowired
    private StaffRepository staffRepository;

    public List<Staff> getAllStaff() {
        List<Staff> staff = new ArrayList<>();
        staffRepository.findAll().forEach(staff::add);
        return staff;
    }

    public Optional<Staff> getStaff(int id){
        Optional<Staff> byId = staffRepository.findById(id);
        return byId;
    }

    public void addStaff(Staff staff) {
        staffRepository.save(staff);
    }

    public void updateStaff(int id, Staff staff) {
        staffRepository.save(staff);
    }

    public void deleteStaff(int id) {
        staffRepository.deleteById(id);
    }

}
