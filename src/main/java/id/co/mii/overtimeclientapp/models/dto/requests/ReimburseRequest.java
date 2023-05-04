package id.co.mii.overtimeclientapp.models.dto.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReimburseRequest {

    private Integer nominal;
    private String description;
    private String file;
    private String status;
    private Integer employee_id;
    private Integer type_id;

}
