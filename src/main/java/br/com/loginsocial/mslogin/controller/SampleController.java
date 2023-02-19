package br.com.loginsocial.mslogin.controller;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api-google")
public class SampleController {

    @GetMapping
    public Map<String , Object> currentUser(OAuth2AuthenticationToken oAuth2AuthenticationToken){
        System.out.println(oAuth2AuthenticationToken.getPrincipal().getAttributes());
        return oAuth2AuthenticationToken.getPrincipal().getAttributes();
    }
}
