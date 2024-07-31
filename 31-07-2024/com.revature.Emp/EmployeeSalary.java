package com.reavture;

public class EmployeeSalary {
    public static void main(String[] args) {
      // Employee employee=new Employee(101,"Jasdhir",10,200);
    SalariedEmployee se=new SalariedEmployee(101,"Salaried Employee",21,1200);
    int salaryForSalaried=se.calculateSalary(se.getDaysPresent(),se.getBasicSalary());
        System.out.println("Salary of Salaried Emp :: "+salaryForSalaried);
    ContractualEmployee ce=new ContractualEmployee(201,"Contractual Employee",80,150);
        System.out.println("Salary for Contractual :::: "+ce.calculateSalary(ce.getBasicSalary(),ce.getDaysPresent()));

        System.out.println(se);
        System.out.println(ce);

    }
}