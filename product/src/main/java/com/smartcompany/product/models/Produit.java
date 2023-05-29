package com.smartcompany.product.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Copyright (c) 2023, Iforce5, All Right Reserved.
 * https://iforce5.com
 * <p>
 * When: @created 28/mai/2023 -- 14:49
 * By :  @author Serges KAMGA on 28/05/2023
 * Project : @project product
 * Package : @package com.smartcompany.product.models
 */
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String name;
    private String marque;
    private double prix;
    private int quantite;

}
