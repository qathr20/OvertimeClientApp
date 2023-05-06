package id.co.mii.overtimeclientapp.models.dto.requests;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

    @NotBlank(message = "Invalid Name: Empty Name")
    private String name;

    @NotBlank(message = "Invalid Phone: Empty Phone")
    private String phone;

    @NotBlank(message = "Invalid Email: Empty Email")
    private String email;

    @NotBlank(message = "Invalid Username: Empty Username")
    private String username;

    @NotBlank(message = "Invalid Password: Empty Password")
    private String password;
    
}
