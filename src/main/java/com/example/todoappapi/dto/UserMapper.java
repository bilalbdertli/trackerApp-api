package com.example.todoappapi.dto;

import com.example.todoappapi.Model.User;

import java.util.Objects;

public class UserMapper {
    public static UserDto mapToDto(User user) {
        UserDto userDto = new UserDto();
        if(Objects.isNull(user)) {return userDto;}
        userDto.setUsername(user.getUsername());
        userDto.setPassword(user.getPassword());

        return userDto;
    }
}
