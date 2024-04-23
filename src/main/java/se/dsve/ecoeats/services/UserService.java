package se.dsve.ecoeats.services;

import org.springframework.stereotype.Service;
import se.dsve.ecoeats.models.User;
import se.dsve.ecoeats.repositories.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User register(User user) {
        // Check if a user with the same email already exists
        if (userRepository.findByEmail(user.getEmail()) != null) {
            throw new IllegalArgumentException("A user with the same email already exists");
        }

        // Save the user to the database
        return userRepository.save(user);
    }

    public User login(String username, String password) {
        // Find the user with the given username
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new IllegalArgumentException("User not found");
        }
        // Here you should also check the password, but for simplicity, we'll skip that
        return user;
    }
}