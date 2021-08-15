package com.example.departmetservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.departmetservice.entity.Department;
import com.example.departmetservice.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	
	public Department saveDepartment(Department department) {
		log.info("Inside saveDepartment method of DepartmentService");
		
		return departmentRepository.save(department);
	}


	public Department findDepartmentById(Long departmentId) {
		log.info("Inside findDepartmentById method of DepartmentService");
		
		return departmentRepository.findByDepartmentId(departmentId);
	}
	
	
	
	
	

}
