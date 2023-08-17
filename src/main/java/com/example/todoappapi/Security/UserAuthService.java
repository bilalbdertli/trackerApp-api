package com.example.todoappapi.Security;

import com.example.todoappapi.Model.User;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserAuthService implements UserDetailsService {
    private final UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("the name taken from the request: " + username);
        Optional<User> user = userService.findByUserName(username);
        if (user.isPresent()) {
            return new UserAuthDetails(user.get());
        } else {
            throw new EntityNotFoundException();
        }

    }
}
