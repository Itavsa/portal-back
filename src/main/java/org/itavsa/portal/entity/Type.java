package org.itavsa.portal.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;

    @Column(length = 64, nullable = false)
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "type")
    private Set<Product> products = new HashSet<>();
}
