package id.co.mii.overtimeclientapp.models;

import java.util.List;

import javax.validation.constraints.NotBlank;

public class Type {

    private Integer id;

    @NotBlank(message = "Invalid Name: Empty Name")
    private String name;
    
    private List<Reimburse> reimburse;
    
}
