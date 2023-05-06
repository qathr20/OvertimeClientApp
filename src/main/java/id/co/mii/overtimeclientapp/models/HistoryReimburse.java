package id.co.mii.overtimeclientapp.models;

import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HistoryReimburse {
    
    private Integer id;

    private LocalDateTime date_time;

    @NotBlank(message = "Invalid Status: Empty Status")
    private String status;

    @NotBlank(message = "Invalid Description: Empty Description")
    private String description;

    @NotNull(message = "Invalid Reimburse: Empty Reimburse")
    private Reimburse reimburse;
}
