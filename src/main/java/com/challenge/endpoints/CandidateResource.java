package com.challenge.endpoints;

import com.challenge.entity.Candidate;
import com.challenge.service.impl.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("candidate")
public class CandidateResource {

    @Autowired
    private CandidateService candidateService;

    @GetMapping("/{userId}/{accelerationId}/{companyId}")
    public Optional<Candidate> findById(@PathVariable(name = "userId") Long userId, @PathVariable("companyId") Long companyId, @PathVariable(name = "accelerationId")Long accelerationId) {
        return candidateService.findById(userId, companyId, accelerationId);
    }

    @GetMapping(params = {"companyId"})
    public List<Candidate> findByCompanyId(Long companyId) {
        return candidateService.findByCompanyId(companyId);
    }

    @GetMapping(params = {"accelerationId"})
    public List<Candidate> findByAccelerationId(Long accelerationId) {
        return candidateService.findByAccelerationId(accelerationId);
    }
}
