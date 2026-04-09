package com.benzzine.employeeservice.service;

import com.benzzine.employeeservice.dto.APIResponseDto;
import com.benzzine.employeeservice.dto.EmployeeDto;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);
    APIResponseDto getEmployeeById(Long id);
}
