package com.microservicios.actividaddosmicroservicios.users.src.main.java.com.usersPackage.Users.dto;

public record UserToSaveDto(
        Long id,
        String username,
        String password,
        String email,
        String firstName,
        String lastName
) {
}
