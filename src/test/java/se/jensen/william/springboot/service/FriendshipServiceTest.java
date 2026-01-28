package se.jensen.william.springboot.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.crypto.password.PasswordEncoder;
import se.jensen.william.springboot.entities.User;
import se.jensen.william.springboot.mapper.FriendshipMapper;
import se.jensen.william.springboot.mapper.UserMapper;
import se.jensen.william.springboot.repository.FriendshipRepository;
import se.jensen.william.springboot.repository.UserRepository;

@ExtendWith(MockitoExtension.class)
public class FriendshipServiceTest {
    @InjectMocks
    private FriendshipService friendshipService;
    @Mock
    private UserRepository userRepository;
    @Mock
    private FriendshipRepository friendshipRepository;
    @Mock
    private UserMapper userMapper;
    @Mock
    private FriendshipMapper friendshipMapper;
    @Mock
    private PasswordEncoder passwordEncoder;

    @Test
    public void becomeFriends() {
        // Arrange
        User friendlyUser = new User();
        friendlyUser.setId(1L);
        friendlyUser.setUsername("NallePuh");

        User friendlyUser2 = new User();
        friendlyUser2.setId(2L);
        friendlyUser2.setUsername("Nasse");

        User requester = friendshipRepository.findById();
        User receiver = friendshipRepository.findById()

        // Act

        // Assert
    }
}
