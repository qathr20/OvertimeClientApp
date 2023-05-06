package id.co.mii.overtimeclientapp.models;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private Integer id;

    @NotBlank(message = "Invalid Name: Empty Name")
    private String name;

    @NotBlank(message = "Invalid Phone: Empty Phone")
    private String phone;

    @NotBlank(message = "Invalid Email: Empty Email")
    private String email;

    private Boolean status = true;

    private int payroll;

    @NotNull(message = "Invalid Department: Empty Department")
    private Department department;

    private List<Employee> manager;

    private List<Employee> hr;

    @NotNull(message = "Invalid User: Empty User")
    private User user;
    
    private List<EmployeeProject> employeeProject;
    
}
