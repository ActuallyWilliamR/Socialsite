package se.jensen.william.springboot.exceptions;

public class PostNotFoundException extends RuntimeException {
    public PostNotFoundException(Long id) {
        super("No post with id: " + id + " was found in database.");
    }
}
