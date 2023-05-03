package id.co.mii.overtimeclientapp.models;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Overtime {

    private Integer id;
    private String description;
    private LocalDateTime start_time;
    private LocalDateTime end_time;
    private String status;
    private EmployeeProject employeeProject;
    
}
