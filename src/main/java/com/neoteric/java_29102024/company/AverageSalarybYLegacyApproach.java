package com.neoteric.java_29102024.company;

import java.util.*;

public class AverageSalarybYLegacyApproach {
    public static void main(String[] args) {
        List<Employee> itEmpList = new ArrayList<>();

        Employee first = new Employee();
        first.setEmployeeId(1);
        first.setSalary(1000);
        first.setDepartment("IT");

        Employee second = new Employee();
        second.setEmployeeId(2);
        second.setSalary(2000);
        second.setDepartment("IT");

        Employee third = new Employee();
        third.setEmployeeId(3);
        third.setSalary(2000);
        third.setDepartment("IT");

        itEmpList.add(first);
        itEmpList.add(second);
        itEmpList.add(third);

        Employee cscfirst = new Employee();
        cscfirst.setEmployeeId(4);
        cscfirst.setSalary(5000);
        cscfirst.setDepartment("CSE");

        Employee cscsecond = new Employee();
        cscsecond.setEmployeeId(5);
        cscsecond.setSalary(1000);
        cscsecond.setDepartment("CSE");

        Employee cscthird = new Employee();
        cscthird.setEmployeeId(6);
        cscthird.setSalary(1000);
        cscthird.setDepartment("CSE");

        itEmpList.add(cscfirst);
        itEmpList.add(cscsecond);
        itEmpList.add(cscthird);


        Map<String,Double> deptAvgSalaryMap = new HashMap<>();
        Map<String,Integer> deptEmpCountMap = new HashMap<>();
        Map<String,Double> deptMaxSalary = new HashMap<>();
        Map<String,Double>  deptMinSalary = new HashMap<>();

        Double companyMaxSalary = itEmpList.get(0).getSalary();
        Double comapnyMinSalary = itEmpList.get(0).getSalary();

        Iterator<Employee> employeeIterator = itEmpList.iterator();

        while (employeeIterator.hasNext()){
            Employee emp = employeeIterator.next();
            Double salary = emp.getSalary();
            String department = emp.getDepartment();
            if (deptAvgSalaryMap.containsKey(emp.getDepartment())){
                Double d = deptAvgSalaryMap.get(emp.getDepartment());
                Double total = d+emp.getSalary();
                deptAvgSalaryMap.put(emp.getDepartment(),total);
                int count=   deptEmpCountMap.get(emp.getDepartment());
                int totalCount = count+1;
                deptEmpCountMap.put(emp.getDepartment(),totalCount);

            }else {
                deptAvgSalaryMap.put(emp.getDepartment(),emp.getSalary());
                deptEmpCountMap.put(emp.getDepartment(),1);
                deptMaxSalary.put(department,salary);  // initiallize into deptmaxmap
                deptMinSalary.put(department,salary);// initiallize into deptminsalary
            }
           if(salary >  deptMaxSalary.get(department)){
           deptMaxSalary.put(department,salary);

          }
           if(salary < deptMinSalary.get(department) ){
           deptMinSalary.put(department,salary);
           }
            if(salary>companyMaxSalary){
                companyMaxSalary= salary;

            }
            if(salary<comapnyMinSalary){
               comapnyMinSalary= salary;
            }

        }

        System.out.println("total salary "+deptAvgSalaryMap);
        System.out.println("total count "+deptEmpCountMap);


        Iterator<String> deptIterator =  deptAvgSalaryMap.keySet().iterator();

        while(deptIterator.hasNext()){
            String dept = deptIterator.next();

            Double totalSalary =   deptAvgSalaryMap.get(dept);
            int totalCount  =    deptEmpCountMap.get(dept);

            System.out.println(" Avg salary by dept" +totalSalary/totalCount);
            System.out.println(" dept max salary " + deptMaxSalary.get(dept));
            System.out.println(" dept min salary " + deptMinSalary.get(dept));

        }

        System.out.println(" company max salary" +companyMaxSalary);
        System.out.println(" company min salary " + comapnyMinSalary);

    }
}



