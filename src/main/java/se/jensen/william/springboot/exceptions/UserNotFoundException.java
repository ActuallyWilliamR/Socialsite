package se.jensen.william.springboot.exceptions;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id) {
        super("No user with id: " + id + " in the database");
    }

    public UserNotFoundException(String username) {
        super("No user with username: " + username + " in the database");
    }
}
