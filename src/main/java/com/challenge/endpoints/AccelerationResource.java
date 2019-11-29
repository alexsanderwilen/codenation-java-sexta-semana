package com.challenge.endpoints;

import com.challenge.entity.Acceleration;
import com.challenge.service.impl.AccelerationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("acceleration")
public class AccelerationResource {

    @Autowired
    private AccelerationService accelerationService;

    @GetMapping("/{id}")
    public Optional<Acceleration> findById(@PathVariable Long id) {
        return accelerationService.findById(id);
    }

    @GetMapping(params = {"companyId"})
    public List<Acceleration> findByCompanyId(@RequestParam("companyId") Long companyId) {
        return accelerationService.findByCompanyId(companyId);
    }
}