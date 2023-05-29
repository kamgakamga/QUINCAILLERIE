package com.smartcompany.billingservice.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Copyright (c) 2023, Iforce5, All Right Reserved.
 * https://iforce5.com
 * <p>
 * When: @created 28/mai/2023 -- 18:06
 * By :  @author Serges KAMGA on 28/05/2023
 * Project : @project billing-service
 * Package : @package com.smartcompany.billingservice.models
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Transient
    private Costomer costomer;


}
