package se.jensen.william.springboot.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

// Indata
public record UserRequestDTO(
        @NotBlank
        @Size(min = 12, max = 40, message = "Email must be between 12 - 40 characters.")
        @Email(message = "Must be a valid Email address.")
        String email,

        @NotBlank(message = "Username cannot be empty")
        @Size(min = 5, max = 20, message = "Must be between 5 - 20 characters.")
        @Pattern(regexp = "^[A-Za-z0-9_]+$", message = "Username can only contain letters, numbers and underscores.")
        String username,

        @NotBlank(message = "Password cannot be empty")
        @Size(min = 5, max = 64, message = "Must be between 5 - 20 characters.")
        @Pattern(regexp = "^[A-Za-z0-9_]+$", message = "Password can only contain letters, numbers and underscores.")
        String password,

        @NotBlank
        String role,

        @NotBlank
        String displayName,

        @NotBlank
        String bio,

        String profileImagePath
) {

}
