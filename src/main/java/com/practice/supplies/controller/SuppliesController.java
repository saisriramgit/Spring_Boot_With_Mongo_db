package com.practice.supplies.controller;

import com.practice.supplies.model.Supplies;
import com.practice.supplies.repository.SuppliesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SuppliesController {

    @Autowired
    SuppliesRepository suppliesRepository;

    @GetMapping("/supplies")
    public List<Supplies> getAllSupplies() {
        return suppliesRepository.findAll();
    }

    @PostMapping("/supply")
    public Supplies addSupply(@RequestBody Supplies supply) {
        return suppliesRepository.save(supply);
    }
}
