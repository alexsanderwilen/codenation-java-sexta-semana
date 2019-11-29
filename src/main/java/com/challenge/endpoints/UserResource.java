package com.challenge.endpoints;

import com.challenge.entity.User;
import com.challenge.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("user")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable("id") Long userId) {
        return userService.findById(userId);
    }

    @GetMapping(params = {"accelerationName"})
    public List<User> findByAccelerationName(@RequestParam("accelerationName")  String accelerationName) {
        return userService.findByAccelerationName(accelerationName);
    }

    @GetMapping(params = {"companyId"})
    public List<User> findByCompanyId(@RequestParam("companyId") Long companyId) {
        return userService.findByCompanyId(companyId);
    }
}
