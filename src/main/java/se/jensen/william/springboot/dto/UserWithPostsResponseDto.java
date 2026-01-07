package se.jensen.william.springboot.dto;

import java.util.List;

public record UserWithPostsResponseDto(UserResponseDTO user,
                                       List<PostResponseDTO> posts) {
}
