package se.jensen.william.springboot.dto;

import se.jensen.william.springboot.model.User;

import java.time.LocalDateTime;

// Utdata
public record PostResponseDTO(Long id, String text, LocalDateTime createdAt) {
}
