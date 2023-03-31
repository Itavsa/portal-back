package org.itavsa.portal.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Entity
@Getter
@Setter
public class Picture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;

    @Column(length = 2048, nullable = false)
    private String path;

    @Column(length = 256, nullable = false)
    private String filename;
}

