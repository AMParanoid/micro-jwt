package com.microjwt.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microjwt.security.AuthenticationService;
//import com.microjwt.security.UserAuthenticated;

@RestController
public class AuthenticationController {
  @Autowired
  private AuthenticationService authenticationService;

  @PostMapping("authenticate")
  public String authenticate(
      Authentication authentication) {
        
        String authenticationName = SecurityContextHolder.getContext().getAuthentication().getName();
        String authenticationString = authenticationService.authenticate(authentication);
        
    return authenticationName +", here is your key: \n" + authenticationString + "\nCheck /private";
  }
}
