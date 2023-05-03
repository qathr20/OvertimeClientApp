package id.co.mii.overtimeclientapp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeProject {
    
    private Integer employee_project_id;
    private Project project;
    private Employee employee;
}
