package com.hrsystemapp.HrSystemApp.controller;


import com.hrsystemapp.HrSystemApp.employee.Employee;
import com.hrsystemapp.HrSystemApp.employee.EmployeeRespository;
import com.hrsystemapp.HrSystemApp.employeetable.EmployeeTable;
import com.hrsystemapp.HrSystemApp.employeetable.EmployeeTableRespository;
import com.hrsystemapp.HrSystemApp.exception.EmployeeNotFoundException;
import com.hrsystemapp.HrSystemApp.result.PerformanceData;
import com.hrsystemapp.HrSystemApp.result.PerformanceDataRespository;
import com.hrsystemapp.HrSystemApp.rewarddata.RewardData;
import com.hrsystemapp.HrSystemApp.rewarddata.RewardDataRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@CrossOrigin
public class ControllerReact {

    @Autowired
    EmployeeRespository employeeRespository;
    @Autowired
    RewardDataRespository rewardDataRespository;
    @Autowired
    EmployeeTableRespository employeeTableRespository;
    @Autowired
    PerformanceDataRespository performanceDataRespository;


    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return employeeRespository.findAll();
    }
    @GetMapping("/employee/{id}")
    Employee getEmployeeById(@PathVariable Integer id){
        return employeeRespository.findById(id).orElseThrow(()-> new EmployeeNotFoundException(id));
    }

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeRespository.save(employee);
    }
    @PutMapping("/employee/{id}")
    Employee updateEmployee(@RequestBody Employee newemployee, @PathVariable Integer id){
        return employeeRespository.findById(id)
                .map(employee -> {
                    employee.setName(newemployee.getName());
                    employee.setAge(newemployee.getAge());
                    employee.setGender(newemployee.getGender());
                    employee.setDepartment(newemployee.getDepartment());
                    employee.setGrade(newemployee.getGrade());
                    employee.setState(newemployee.getState());
                    return employeeRespository.save(employee);
                }).orElseThrow(()-> new EmployeeNotFoundException(id));
    }

    @DeleteMapping("/employee/{id}")
    String deleteEmployee(@PathVariable Integer id){
        if (!employeeRespository.existsById(id)){
            throw new EmployeeNotFoundException(id);
        }
         employeeRespository.deleteById(id);
        return "Employee with id "+ id +" has been deleted";
    }

    @GetMapping("/rewardreact")
    public List<RewardData> getReward(){
        return rewardDataRespository.findAll();
    }

    @GetMapping("/employeetablereact")
    public List<EmployeeTable> getEmployeeTable(){
        return employeeTableRespository.findAll();
    }

    @GetMapping("/performance")
    public List<PerformanceData> getPerformance(){
        return performanceDataRespository.findAll();
    }
}





















