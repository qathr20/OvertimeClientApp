package id.co.mii.overtimeclientapp.models.dto.requests;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OvertimeRequest {

    private String description;
    private LocalDateTime start_time;
    private LocalDateTime end_time;
    private String status;
    private Integer employee_project_id;
    
}
