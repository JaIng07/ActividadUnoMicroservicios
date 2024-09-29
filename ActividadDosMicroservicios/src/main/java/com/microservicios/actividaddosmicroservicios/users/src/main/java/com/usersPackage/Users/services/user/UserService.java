package com.microservicios.actividaddosmicroservicios.users.src.main.java.com.usersPackage.Users.services.user;

import com.microservicios.actividaddosmicroservicios.users.src.main.java.com.usersPackage.Users.dto.UserDto;
import com.microservicios.actividaddosmicroservicios.users.src.main.java.com.usersPackage.Users.dto.UserToSaveDto;
import com.microservicios.actividaddosmicroservicios.users.src.main.java.com.usersPackage.Users.entity.Role;
import com.microservicios.actividaddosmicroservicios.users.src.main.java.com.usersPackage.Users.exceptions.UserNotFoundException;

public interface UserService {
    UserDto saveUsuario(UserToSaveDto userToSaveDto);
    UserDto updateUsuario(Long id, UserToSaveDto usuario) throws UserNotFoundException;
    UserDto findById(Long id) throws UserNotFoundException;
    void deleteUserById(Long id) throws UserNotFoundException;
    UserDto findByUsernameAndRol(String username, Role role) throws UserNotFoundException;
    UserDto findByusernameAndrole(String username, Role role) throws UserNotFoundException;
}
