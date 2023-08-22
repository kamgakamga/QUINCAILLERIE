package com.smartcompany.billingservice.models;

import lombok.Data;

/**
 * Copyright (c) 2023, Iforce5, All Right Reserved.
 * https://iforce5.com
 * <p>
 * When: @created 28/mai/2023 -- 18:10
 * By :  @author Serges KAMGA on 28/05/2023
 * Project : @project billing-service
 * Package : @package com.smartcompany.billingservice.models
 */
@Data
public class Costomer {
	private Long id;
	private String nom;
	private String prenom;
	private String telephone;
	private String email;
}
