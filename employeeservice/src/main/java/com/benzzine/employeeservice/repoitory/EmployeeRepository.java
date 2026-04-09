package com.benzzine.employeeservice.repoitory;

import com.benzzine.employeeservice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
