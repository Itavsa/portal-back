package org.itavsa.portal.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.itavsa.portal.converter.JSONObjectConverter;
import org.json.JSONObject;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;

    @Column(length = 255, nullable = false)
    private String title;

    @Column(nullable = false)
    private BigDecimal price;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Currency currency;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Type type;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    @Convert(converter = JSONObjectConverter.class)
    private JSONObject tailoredSpec;

    @ManyToMany
    @JoinTable(
            name = "product_picture",
            joinColumns = { @JoinColumn(name = "product_id") },
            inverseJoinColumns = { @JoinColumn(name = "picture_id") }
    )
    private Set<Picture> pictures = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "product_tag",
            joinColumns = { @JoinColumn(name = "product_id") },
            inverseJoinColumns = { @JoinColumn(name = "tag_id") }
    )
    private Set<Tag> tags = new HashSet<>();
}