package me.dio.service.impi;

import org.springframework.stereotype.Service;

import me.dio.domain.model.User;
import me.dio.domain.repository.UserRepository;
import me.dio.service.UserService;
import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException :: new);
    }

    @Override
    public User create(User userToCreate) {

        if (userRepository.existsByAccountUsername(userToCreate.getAccount().getAccountUsername())){
            throw new IllegalArgumentException("This Account username already exists!");
        }
        return userRepository.save(userToCreate);
    }
    
}
