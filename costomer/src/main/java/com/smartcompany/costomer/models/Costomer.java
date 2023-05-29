package com.smartcompany.costomer.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

/**
 * Copyright (c) 2023, Iforce5, All Right Reserved.
 * https://iforce5.com
 * <p>
 * When: @created 28/mai/2023 -- 14:39
 * By :  @author Serges KAMGA on 28/05/2023
 * Project : @project costomer
 * Package : @package com.smartcompany.costomer.models
 */
@Table(name = "client")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Costomer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private String prenom;
    private String email;
    private String telephone;
}
