package id.co.mii.overtimeclientapp.models;

import java.util.List;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Privilege {
    
    private Integer id;

    @NotBlank(message = "Invalid Name: Empty Name")
    private String name;
    
    private List<Role> roles;
}
