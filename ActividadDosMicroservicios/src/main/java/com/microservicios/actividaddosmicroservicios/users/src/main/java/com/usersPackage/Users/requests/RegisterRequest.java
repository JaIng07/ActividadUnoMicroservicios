package com.microservicios.actividaddosmicroservicios.users.src.main.java.com.usersPackage.Users.requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
    String userName;
    String password;
    String firstName;
    String lastName;
}
