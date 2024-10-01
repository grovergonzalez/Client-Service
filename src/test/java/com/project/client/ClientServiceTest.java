package com.project.client;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ClientServiceTest {

    @Autowired
    private ClientService clientService;

    @Test
    public void createUser() {
        UserDto userDto = new UserDto("Juan", "Pérez", "García", "12345678");

        clientService.createUser(userDto);

        assertThat(clientService.getUsers()).hasSize(1);
        assertThat(clientService.getUsers().get(0).getFirstName()).isEqualTo("Juan");
        assertThat(clientService.getUsers().get(0).getLastName()).isEqualTo("Pérez");
        assertThat(clientService.getUsers().get(0).getMiddleName()).isEqualTo("García");
        assertThat(clientService.getUsers().get(0).getIdentityDocument()).isEqualTo("12345678");
    }

}