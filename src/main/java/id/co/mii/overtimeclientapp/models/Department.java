package id.co.mii.overtimeclientapp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    private Integer id;
    private String name;
    private Employee manager;
    private Employee hr;
    
}
