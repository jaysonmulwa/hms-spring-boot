package com.hms.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/department")
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @RequestMapping("/department/{id}")
    public Optional<Department> getDepartment(@PathVariable int id) {
        return departmentService.getDepartment(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/department")
    public void addDepartment(@RequestBody Department department) {
        departmentService.addDepartment(department);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/department/{id}")
    public void updateDepartment(@PathVariable int id, @RequestBody Department department) {
        departmentService.updateDepartment(id, department);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/department/{id}")
    public void deleteDepartment(@PathVariable int id) {
        departmentService.deleteDepartment(id);
    }
}
