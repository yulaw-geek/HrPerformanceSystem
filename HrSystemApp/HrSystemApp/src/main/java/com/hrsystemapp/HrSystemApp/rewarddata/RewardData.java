package com.hrsystemapp.HrSystemApp.rewarddata;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class RewardData {


    @Id
    private String department;

    private Integer total_reward;
    private Double ratio;
    private Integer tech_reward;

    public RewardData(Integer total_reward, Double ratio, Integer tech_reward) {
        this.total_reward = total_reward;
        this.ratio = ratio;
        this.tech_reward = tech_reward;
    }

    public RewardData() {
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getTotal_reward() {
        return total_reward;
    }

    public void setTotal_reward(Integer total_reward) {
        this.total_reward = total_reward;
    }

    public Double getRatio() {
        return ratio;
    }

    public void setRatio(Double ratio) {
        this.ratio = ratio;
    }

    public Integer getTech_reward() {
        return tech_reward;
    }

    public void setTech_reward(Integer tech_reward) {
        this.tech_reward = tech_reward;
    }

    @Override
    public String toString() {
        return "RewardData [department=" + department + ", total_reward=" + total_reward + ", ratio=" + ratio + ", tech_reward=" + tech_reward +"]";
    }

}
