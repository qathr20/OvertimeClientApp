package id.co.mii.overtimeclientapp.models;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    
    private Integer id;
    private String name;
    private String description;
    private LocalDateTime start_date;
    private LocalDateTime end_date;
    private int budget;
    private Boolean status;
    private List<Employee> employee;
}
