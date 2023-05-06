package id.co.mii.overtimeclientapp.models;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer id;

    @NotBlank(message = "Invalid Username: Empty Username")
    private String username;

    @NotBlank(message = "Invalid Password: Empty Password")
    private String password;

    private Boolean isEnabled = true;
    private Boolean isAccountNonLocked = true;

    @NotNull(message = "Invalid Employee: Empty Employee")
    private Employee employee;

    @NotNull(message = "Invalid Role: Empty Role")
    private Role role;

}
