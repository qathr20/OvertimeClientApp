package id.co.mii.overtimeclientapp.models.dto.requests;

import lombok.Data;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest {

    @NotBlank(message = "Invalid Username: Empty Username")
    private String username;

    @NotBlank(message = "Invalid Password: Empty Password")
    private String password;
}
