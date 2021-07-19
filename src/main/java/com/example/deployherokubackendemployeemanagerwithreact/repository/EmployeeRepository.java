package com.example.deployherokubackendemployeemanagerwithreact.repository;

import com.example.deployherokubackendemployeemanagerwithreact.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee,Long> {
}
