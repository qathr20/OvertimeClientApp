package id.co.mii.overtimeclientapp.models;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HistoryReimburse {
    
    private Integer id;
    private LocalDateTime date_time;
    private String status;
    private String description;
    private Reimburse reimburse;
}
