package com.hrsystemapp.HrSystemApp.employee;

import com.hrsystemapp.HrSystemApp.employeetable.EmployeeTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRespository extends JpaRepository<Employee, Integer> {
}
