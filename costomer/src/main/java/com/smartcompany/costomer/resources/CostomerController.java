package com.smartcompany.costomer.resources;

import com.smartcompany.costomer.models.Costomer;
import com.smartcompany.costomer.repositories.CostomerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Copyright (c) 2023, Iforce5, All Right Reserved.
 * https://iforce5.com
 * <p>
 * When: @created 28/mai/2023 -- 17:46
 * By :  @author Serges KAMGA on 28/05/2023
 * Project : @project costomer
 * Package : @package com.smartcompany.costomer.resources
 */
@RestController
@RequestMapping("api/costomer")
public class CostomerController {

 private final CostomerRepository costomerRepository;

    public CostomerController(CostomerRepository costomerRepository) {
        this.costomerRepository = costomerRepository;
    }

    @GetMapping("/get-all/costomers")
    public ResponseEntity<List<Costomer>> getAllCostomer(){
        return ResponseEntity.ok(costomerRepository.findAll());
    }
}
