package br.com.loginsocial.mslogin.controller;

import br.com.loginsocial.mslogin.dtos.AuthenticationResponse;
import br.com.loginsocial.mslogin.dtos.RegisterRequest;
import br.com.loginsocial.mslogin.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/demo-controller")
public class DemoController {

    @Autowired
    private AuthenticationService authenticationService;

    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello from secured endpoint");
    }

    @PostMapping("/create")
    public ResponseEntity<AuthenticationResponse> addAccount(@RequestBody RegisterRequest registerRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(authenticationService.register(registerRequest));
    }
}
