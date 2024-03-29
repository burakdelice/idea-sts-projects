package com.burakdelice.config;

import com.burakdelice.exception.ElasticServiceException;
import com.burakdelice.exception.ErrorType;
import com.burakdelice.utility.JwtTokenManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

public class JwtTokenFilter extends OncePerRequestFilter {

    @Autowired
    JwtTokenManager jwtTokenManager;
    @Autowired
    JwtUserDetails jwtUserDetails;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        System.out.println("Eklediğimiz filter");

        if ("/elastic/user/save".equals(request.getRequestURI())) {
            filterChain.doFilter(request, response);
            return;
        }

        String bearerToken = request.getHeader("Authorization");
        //System.out.println("Bearer Token : "+bearerToken);

        if (SecurityContextHolder.getContext().getAuthentication() == null) {
            System.out.println("Authentication nesnesi boş");
            System.out.println("Talep edilen url: " + request.getRequestURI());

            if (bearerToken == null || !bearerToken.startsWith("Bearer ")) {
                throw new ElasticServiceException(ErrorType.INVALID_TOKEN);
            }
            String token = bearerToken.substring(7);
            System.out.println(token);
            Optional<Long> authid = jwtTokenManager.getIdFromToken(token);

            if (authid.isEmpty()) {
                System.out.println("Authid boş");
                throw new ElasticServiceException(ErrorType.INVALID_TOKEN);
            }

            System.out.println("Gelen AuthId: " + authid.get());

            UserDetails userDetails = jwtUserDetails.loadOptionalByAuthId(authid.get());
            UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken
                    (userDetails, null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authenticationToken);
        }

        System.out.println("Authentication nesnesi dolu token tekrar göndermedi");
        filterChain.doFilter(request, response);
    }
}

