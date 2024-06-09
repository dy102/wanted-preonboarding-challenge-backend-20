package com.example.member.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Table(name = "member")
@Getter
public class Member {
    @Id
    private String email;
    @Column(nullable = false)
    private String password;

    protected Member() {

    }

    public Member(final String email,
                  final String password,
                  final PasswordEncoder passwordEncoder) {
        this.email = email;
        this.password = passwordEncoder.encode(password);
    }
}
