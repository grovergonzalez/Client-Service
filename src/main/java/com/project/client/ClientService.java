package com.project.client;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {
    private final List<UserDto> users = new ArrayList<>();

    public void createUser(UserDto userDto) {
        users.add(userDto);
    }

    public List<UserDto> getUsers() {
        return users;
    }
}
