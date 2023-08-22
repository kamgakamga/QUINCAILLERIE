package com.smartcompany.billingservice.models;

import java.util.Collection;
import java.util.Date;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date billingDate;
    @Transient
    private Costomer costomer;
    @OneToMany(mappedBy = "bill")
    private Collection<ProduitItem> produitItems;
    private Long costomerID;

}
