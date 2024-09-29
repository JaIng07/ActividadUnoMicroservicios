package com.microservicios.actividaddosmicroservicios.users.src.main.java.com.usersPackage.Users.requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest {
    String userName;
    String password;
}
