package com.point.app.springsecurity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


public class PasswordConfig {

    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(10);
    }
}
