package com.neoteric.java_29102024.company;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
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


//       List<Integer> employeeId  = itEmpList.stream().map(employee -> employee.getEmployeeId()).collect(Collectors.toList());
//       System.out.println( " employee Id's " + employeeId);

        List<Integer> employeeId1  = itEmpList.stream().map(Employee::getEmployeeId).collect(Collectors.toList());
        System.out.println( " employee Id's  "+ employeeId1);

     Map<String,Double>  departmentAverageSalaryMap1 =  itEmpList.stream().collect(Collectors.groupingBy
                (Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(" Department Average Salary " + departmentAverageSalaryMap1);


      Map<String , Optional<Employee>>   deptMaxSalary  = itEmpList.stream()
              .collect(Collectors.groupingBy(Employee::getDepartment,
                      Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
        System.out.println(" dept Max Salary " + deptMaxSalary);

         Map<String,Optional<Employee>> deptMinSalary = itEmpList.stream()
                 .collect(Collectors.groupingBy(Employee::getDepartment,
                         Collectors.minBy(Comparator.comparingDouble(Employee::getSalary))));

        System.out.println(" Dept Min Salary " + deptMinSalary);


    Optional companyMaxSalary =  itEmpList.stream().max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println(" Company Max Salary" + companyMaxSalary);

 Optional companyMinSalary = itEmpList.stream().min(Comparator.comparingDouble(Employee::getSalary));
        System.out.println("  Company Min Salary " + companyMinSalary);

    }


}
