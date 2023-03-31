package org.itavsa.portal.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Currency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 20, nullable = false)
    private String name;

    @Column(length = 3, nullable = false)
    private String code;

    @Column(length = 5, nullable = false)
    private String symbol;
}
