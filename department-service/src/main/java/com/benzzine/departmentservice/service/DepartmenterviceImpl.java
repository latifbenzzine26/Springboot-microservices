package com.benzzine.departmentservice.service;

import com.benzzine.departmentservice.dto.DepartmentDto;
import com.benzzine.departmentservice.entity.Department;
import com.benzzine.departmentservice.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmenterviceImpl implements DepartmentService{

    private DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
        //convert department dto to department Entity
        Department department = new Department(
                departmentDto.getId(),
                departmentDto.getDepartmentName(),
                departmentDto.getDepartmentDescription(),
                departmentDto.getDepartmentCode()
        );

       Department saveDepartment = departmentRepository.save(department);

        return new DepartmentDto(saveDepartment.getId(),
                saveDepartment.getDepartmentName(),
                saveDepartment.getDepartmentDescription(),
                saveDepartment.getDepartmentCode());
    }

    @Override
    public DepartmentDto getDepartmentByCode(String departmentCode) {
       Department department = departmentRepository.findByDepartmentCode(departmentCode);
        return new DepartmentDto(department.getId(),
                department.getDepartmentName(),
                department.getDepartmentDescription(),
                department.getDepartmentCode());
    }
}
