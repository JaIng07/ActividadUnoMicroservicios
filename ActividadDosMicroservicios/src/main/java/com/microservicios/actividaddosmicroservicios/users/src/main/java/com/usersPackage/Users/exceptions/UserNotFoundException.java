package com.microservicios.actividaddosmicroservicios.users.src.main.java.com.usersPackage.Users.exceptions;

public class UserNotFoundException extends Exception{

    public UserNotFoundException(){
        super();
    }

    public UserNotFoundException(String message) {
        super(message);
    }
}
