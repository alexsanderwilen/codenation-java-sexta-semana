package com.challenge.endpoints;

import com.challenge.entity.Company;
import com.challenge.service.impl.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("company")
public class CompanyResource {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/{id}")
    public Optional<Company> findById(@PathVariable Long id) {
        return companyService.findById(id);
    }

    @GetMapping(params = {"accelerationId"})
    public List<Company> findByAccelerationId(@RequestParam("accelerationId") Long accelerationId) {
        return companyService.findByAccelerationId(accelerationId);
    }

    @GetMapping(params = {"userId"})
    public List<Company> findByUserId(@RequestParam("userId") Long userId) {
        return companyService.findByUserId(userId);
    }
}