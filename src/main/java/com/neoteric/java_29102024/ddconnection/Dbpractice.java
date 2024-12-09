package com.neoteric.java_29102024.ddconnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dbpractice {
    public  static List<Project> getAllocationEmployee(){

        String url = "jdbc:mysql://localhost:3307/sonar";
        String user = "root";
        String password = "sonar";

        List<Project> projects = new ArrayList<>();
        Map<String,Project> projectMap = new HashMap<>();


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database!");

            String query = "select* from sonar.project p Inner  join sonar.Employee e where p.id = e.pid";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                System.out.println("Project Name : " + resultSet.getString(2)+
                        "  Employee Name:  " + resultSet.getString("name") +
                        "     Dept Name: " + resultSet.getString("dept") +
                        "    Salary: " + resultSet.getString("salary"));


                if (projectMap.containsKey(resultSet.getString(2))) {
                    Project project = projectMap.get(resultSet.getString(2));
                    Employee employee = new Employee();
                    employee.setName(resultSet.getString("name"));
                    project.getEmployeeList().add(employee);
                } else {
                   Project project = new Project();
                   project.setId(resultSet.getInt(1));
                   List<Employee> employees = new ArrayList<>();
                  project.setEmployeeList(employees);
                  project.setPname(resultSet.getString(2));

                  Employee employee = new Employee();
                  employee.setName(resultSet.getString("name"));
                  employees.add(employee);
                   projectMap.put(resultSet.getString(2),project);

                }
            }
        } catch (Exception e) {

            e.printStackTrace();
        }
        return projects;
    }
}




