package com.hrsystemapp.HrSystemApp.employeetable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EmployeeTable {

    @Id
    private Integer id;

    private String name;
    private String department;
    private Integer overtimepay1;
    private Integer overtimepay2;
    private Integer overtimepay3;
    private String degree;
    private Double degree_coefficient;

    public EmployeeTable(Integer id, String name, String department, Integer overtimepay1, Integer overtimepay2, Integer overtimepay3, Double degree_coefficient) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.overtimepay1 = overtimepay1;
        this.overtimepay2 = overtimepay2;
        this.overtimepay3 = overtimepay3;
        this.degree_coefficient = degree_coefficient;
    }

    public EmployeeTable() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getOvertimepay1() {
        return overtimepay1;
    }

    public void setOvertimepay1(Integer overtimepay1) {
        this.overtimepay1 = overtimepay1;
    }

    public Integer getOvertimepay2() {
        return overtimepay2;
    }

    public void setOvertimepay2(Integer overtimepay2) {
        this.overtimepay2 = overtimepay2;
    }

    public Integer getOvertimepay3() {
        return overtimepay3;
    }

    public void setOvertimepay3(Integer overtimepay3) {
        this.overtimepay3 = overtimepay3;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Double getDegree_coefficient() {
        return degree_coefficient;
    }

    public void setDegree_coefficient(Double degree_coefficient) {
        this.degree_coefficient = degree_coefficient;
    }
    @Override
    public String toString() {
        return "EmployeeTable [id=" + id + ", name=" + name + ", department=" + department + ", overtimepay1=" + overtimepay1 + ", overtimepay2=" + overtimepay2 + ", overtimepay3=" + overtimepay3 + ", degree=" + degree + ", degree_coefficient=" + degree_coefficient + "]";
    }

}
