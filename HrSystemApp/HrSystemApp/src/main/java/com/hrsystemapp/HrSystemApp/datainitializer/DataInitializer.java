package com.hrsystemapp.HrSystemApp.datainitializer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hrsystemapp.HrSystemApp.employeetable.EmployeeTable;
import com.hrsystemapp.HrSystemApp.employeetable.EmployeeTableRespository;
import com.hrsystemapp.HrSystemApp.rewarddata.RewardData;
import com.hrsystemapp.HrSystemApp.rewarddata.RewardDataRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataInitializer{

    private final RewardDataRespository rewardDataRepository;
    private final EmployeeTableRespository employeeTableRespository;

    @Autowired
    public DataInitializer(RewardDataRespository rewardDataRepository, EmployeeTableRespository employeeTableRespository) {
        this.rewardDataRepository = rewardDataRepository;
        this.employeeTableRespository = employeeTableRespository;
    }
    public String generateRewardDataJson(){
        List<RewardData> rewarddata = rewardDataRepository.findAll();
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            return objectMapper.writeValueAsString(rewarddata);
        }catch (JsonProcessingException e){
            e.printStackTrace();
            return null;
        }
    }
    public String generateEmployeeTableJson(){
        List<EmployeeTable> employeeTable = employeeTableRespository.findAll();
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            return objectMapper.writeValueAsString(employeeTable);
        }catch (JsonProcessingException e){
            e.printStackTrace();
            return null;
        }
    }
    public String getRewardDataJson(){
        return generateRewardDataJson();
    }
    public String getEmployeeTableJson(){
        return generateEmployeeTableJson();
    }
}

