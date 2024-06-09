package com.example.product.domain;

import com.example.member.domain.Member;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Table(name = "product")
@Getter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Member seller;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Integer price;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    protected Product() {

    }

    public Product(Member seller, String name, Integer price, Status status) {
        this.seller = seller;
        this.name = name;
        this.price = price;
        this.status = status;
    }
}
