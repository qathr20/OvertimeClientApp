package id.co.mii.overtimeclientapp.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private Integer id;
    private String name;
    private String phone;
    private String email;
    private Boolean status;
    private int payroll;
    private Department department;
    private List<Employee> manager;
    private List<Employee> hr;
    private User user;
    private List<Project> project;
    
}
