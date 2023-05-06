package id.co.mii.overtimeclientapp.models;

import java.util.List;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {

    private Integer id;

    @NotBlank(message = "Invalid Employee: Empty Employee")
    private String name;
    
    private List<User> user;
    private List<Privilege> privilege;
    
}
