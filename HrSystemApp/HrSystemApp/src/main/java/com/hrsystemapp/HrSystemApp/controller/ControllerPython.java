package com.hrsystemapp.HrSystemApp.controller;

import com.hrsystemapp.HrSystemApp.datainitializer.DataInitializer;
import com.hrsystemapp.HrSystemApp.employeetable.EmployeeTableRespository;
import com.hrsystemapp.HrSystemApp.result.PerformanceData;
import com.hrsystemapp.HrSystemApp.result.PerformanceDataRespository;
import com.hrsystemapp.HrSystemApp.rewarddata.RewardData;
import com.hrsystemapp.HrSystemApp.rewarddata.RewardDataRespository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class ControllerPython {

    List<PerformanceData> result;

    final PerformanceDataRespository performanceDataRespository;
    final DataInitializer dataInitializer;

    public ControllerPython(DataInitializer dataInitializer, PerformanceDataRespository performanceDataRespository){
        this.dataInitializer = dataInitializer;
        this.performanceDataRespository = performanceDataRespository;
    }

    @GetMapping("/rewarddata")
    public String  getRewardData(){
        String rewarddata = dataInitializer.getRewardDataJson();
        return rewarddata;
    }

    @GetMapping("/employeetable")
    public String getEmployTable(){
        String employeedata = dataInitializer.generateEmployeeTableJson();
        return employeedata;
    }

    @PostMapping("/performance")
    public void getPerformanceData(@RequestBody List<String> performancedata){
        PerformanceData performanceData = new PerformanceData();
        result = performanceData.setData(performancedata);
        performanceDataRespository.saveAll(result);
    }
}
