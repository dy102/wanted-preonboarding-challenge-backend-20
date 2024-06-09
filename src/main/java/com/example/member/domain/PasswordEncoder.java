package com.example.member.domain;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Component;

@Component
public class PasswordEncoder {
    public String encode(final String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

}
