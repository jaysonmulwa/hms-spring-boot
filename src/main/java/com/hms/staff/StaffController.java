package com.hms.staff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StaffController {

    @Autowired
    private StaffService staffService;

    @RequestMapping("/staff")
    public List<Staff> getAllStaff() {
        return staffService.getAllStaff();
    }

    @RequestMapping("/staff/{id}")
    public Optional<Staff> getStaff(@PathVariable int id) {
        return staffService.getStaff(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/staff")
    public void addStaff(@RequestBody Staff staff) {
        staffService.addStaff(staff);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/staff/{id}")
    public void updateStaff(@PathVariable int id, @RequestBody Staff staff) {
        staffService.updateStaff(id, staff);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/staff/{id}")
    public void deleteStaff(@PathVariable int id) {
        staffService.deleteStaff(id);
    }
}
