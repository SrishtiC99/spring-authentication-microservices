package com.srishti.authservice.config;

import com.srishti.authservice.model.UserCredential;
import com.srishti.authservice.repository.UserCredentialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserCredentialRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserCredential> credential =  repository.findByName(username);
        return credential.map(CustomUserDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException("Username not found"));
    }
}