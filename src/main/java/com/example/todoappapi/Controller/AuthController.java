package com.example.todoappapi.Controller;

import com.example.todoappapi.Model.AuthenticationRequest;
import com.example.todoappapi.Model.AuthenticationResponse;
import com.example.todoappapi.Model.User;
import com.example.todoappapi.Repo.ToDoRepo;
import com.example.todoappapi.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todoapp")
public class AuthController {

    @Autowired
    UserRepo userRepo;
    @PostMapping("/signup")
    public ResponseEntity<?> userLogin(@RequestBody AuthenticationRequest authenticationRequest){
        String username = authenticationRequest.getUsername();
        String password = authenticationRequest.getPassword();
        try{
            userRepo.save( new User(username, password, "user")); //TODO: change role to user

        }
        catch(Exception e){
            return ResponseEntity.ok(new AuthenticationResponse("Error for subscription of client " + username));

        }
        return ResponseEntity.ok(new AuthenticationResponse("User signed in successfully" + username));



    }


    @PostMapping("/auth")
    public  ResponseEntity<?> auth(@RequestBody AuthenticationRequest authenticationRequest){
        String username = authenticationRequest.getUsername();
        String password = authenticationRequest.getPassword();
        User user = userRepo.findByUsername(username);
        if(user != null && user.getPassword().equals(password)){
            return ResponseEntity.ok(new AuthenticationResponse());
        }
        return ResponseEntity.badRequest().body("Invalid username or password");
    }
}
