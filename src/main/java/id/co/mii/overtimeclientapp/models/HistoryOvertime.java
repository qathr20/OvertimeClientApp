package id.co.mii.overtimeclientapp.models;

import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class HistoryOvertime {
    
    private Integer id;

    private LocalDateTime date_time;

    @NotBlank(message = "Invalid Status: Empty Status")
    private String status;

    @NotBlank(message = "Invalid Description: Empty Description")
    private String description;

    @NotNull(message = "Invalid Overtime: Empty Overtime")
    private Overtime overtime;
}
