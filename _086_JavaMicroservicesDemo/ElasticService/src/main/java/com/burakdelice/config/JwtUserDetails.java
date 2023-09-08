package com.burakdelice.config;

import com.burakdelice.repository.entity.UserProfile;
import com.burakdelice.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class JwtUserDetails implements UserDetailsService {

    @Autowired
    UserProfileService userProfileService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

    public UserDetails loadOptionalByAuthId(Long authid){
        System.out.println("loadUserByAuthId: "+ authid);
        Optional<UserProfile> userProfile = userProfileService.findOptionalByAuthId(authid);
        if (userProfile.isEmpty()){
            System.out.println("userProfile boş geldi.");
            return null;
        }
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("ADMIN"));
        authorities.add(new SimpleGrantedAuthority("VIP"));
        authorities.add(new SimpleGrantedAuthority("USER"));
        return User.builder()
                .username(userProfile.get().getUsername())
                .password("")
                .accountExpired(false)
                .accountLocked(false)
                .authorities(authorities)
                .build();
    }
}
