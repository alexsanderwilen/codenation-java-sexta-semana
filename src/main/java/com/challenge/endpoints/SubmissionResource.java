package com.challenge.endpoints;

import com.challenge.entity.Submission;
import com.challenge.service.impl.SubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("submission")
public class SubmissionResource {

    @Autowired
    private SubmissionService submissionService;

    @GetMapping(params = {"challengeId", "accelerationId"})
    public List<Submission> findByChallengeIdAndAccelerationId(Long challengeId, Long accelerationId) {
        return submissionService.findByChallengeIdAndAccelerationId(challengeId, accelerationId);
    }
}
