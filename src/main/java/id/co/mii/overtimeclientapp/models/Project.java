package id.co.mii.overtimeclientapp.models;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    
    private Integer id;

    @NotBlank(message = "Invalid Name: Empty Name")
    private String name;

    @NotBlank(message = "Invalid Description: Empty Description")
    private String description;

    private LocalDate start_date;
    private LocalDate end_date;

    @NotBlank(message = "Invalid Budget: Empty Budget")
    private int budget;
    
    private Boolean status = false;
    private List<EmployeeProject> employeeProject;
}
