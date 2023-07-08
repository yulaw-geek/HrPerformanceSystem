package com.hrsystemapp.HrSystemApp.result;


import com.fasterxml.jackson.databind.util.JSONPObject;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

@Entity
public class PerformanceData {

    @Id
    private String name;
    private Integer performancereward;

    public PerformanceData(String name, Integer performancereward) {
        this.name = name;
        this.performancereward = performancereward;
    }

    public PerformanceData(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPerformancereward() {
        return performancereward;
    }

    public void setPerformancereward(Integer performancereward) {
        this.performancereward = performancereward;
    }

    public List<PerformanceData> setData(List<String> dataList){
        List<PerformanceData> performanceDataList = new ArrayList<>();

        for (String data:dataList){
            JSONObject jsonObject = new JSONObject(data);
            String name = jsonObject.getString("name");
            int performancereward = jsonObject.optInt("performancereward");


            PerformanceData performanceData = new PerformanceData();
            performanceData.name = name;
            performanceData.performancereward = performancereward;

            performanceDataList.add(performanceData);
        }
        return performanceDataList;
    }
}
