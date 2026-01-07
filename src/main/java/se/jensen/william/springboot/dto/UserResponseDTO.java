package se.jensen.william.springboot.dto;

// Utdata
public record UserResponseDTO(Long id,
                              String email,
                              String username,
                              String role,
                              String displayName,
                              String bio,
                              String profileImagePath) {
}
