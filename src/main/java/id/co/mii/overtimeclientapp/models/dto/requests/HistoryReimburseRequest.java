package id.co.mii.overtimeclientapp.models.dto.requests;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HistoryReimburseRequest {

    private LocalDateTime date_time;
    private String status;
    private String description;
    private Integer reimburse_id;
    
}
