package se.jensen.william.springboot.exceptions;

public class UserAlreadyExistException extends RuntimeException {
    public UserAlreadyExistException(String username, String email) {
        super("User with this Username: " + username + " or this Email: " + email + " already exists.");
    }
}
