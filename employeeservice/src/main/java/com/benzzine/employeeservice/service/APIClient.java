package com.benzzine.employeeservice.service;


import com.benzzine.employeeservice.dto.DepartmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "department-service")
public interface APIClient {
    @GetMapping("/api/departments/department/{departmentCode}")
    DepartmentDto getDepartment(@PathVariable String departmentCode);
}
