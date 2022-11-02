package com.hms.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getAllDepartment() {
        List<Department> department = new ArrayList<>();
        departmentRepository.findAll().forEach(department::add);
        return department;
    }

    public Optional<Department> getDepartment(int id){
        Optional<Department> byId = departmentRepository.findById(id);
        return byId;
    }

    public void addDepartment(Department department) {
        departmentRepository.save(department);
    }

    public void updateDepartment(int id, Department department) {
        departmentRepository.save(department);
    }

    public void deleteDepartment(int id) {
        departmentRepository.deleteById(id);
    }

}
