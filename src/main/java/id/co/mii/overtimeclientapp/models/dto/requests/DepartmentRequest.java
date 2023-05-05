package id.co.mii.overtimeclientapp.models.dto.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentRequest {

    private String name;
    private Integer manager_id;
    private Integer hr_id;
    
}
