package com.wedding.snap.Service;

import com.wedding.snap.DAO.User;
import com.wedding.snap.Repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User createUser(User newUser){
        return userRepository.save(newUser);
    }
}
