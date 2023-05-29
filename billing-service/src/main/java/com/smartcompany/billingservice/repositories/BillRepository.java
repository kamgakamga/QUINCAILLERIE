package com.smartcompany.billingservice.repositories;

import com.smartcompany.billingservice.models.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Copyright (c) 2023, Iforce5, All Right Reserved.
 * https://iforce5.com
 * <p>
 * When: @created 28/mai/2023 -- 18:11
 * By :  @author Serges KAMGA on 28/05/2023
 * Project : @project billing-service
 * Package : @package com.smartcompany.billingservice.repositories
 */
public interface BillRepository extends JpaRepository<Bill,Long> {
}
