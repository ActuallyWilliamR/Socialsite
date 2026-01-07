package se.jensen.william.springboot.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

// Indata
public record PostRequestDTO(
        @NotBlank(message = "Post cannot be left empty.")
        @Size(min = 10, max = 250, message = "Post must be between 10 - 250 characters.")
        String text) {
}
