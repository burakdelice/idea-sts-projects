package com.burakdelice.controller;

import com.burakdelice.constant.EndPoints;
import com.burakdelice.dto.request.DoRegisterRequestDto;
import com.burakdelice.exception.AuthServiceException;
import com.burakdelice.exception.ErrorType;
import com.burakdelice.repository.entity.Auth;
import com.burakdelice.service.AuthService;
import com.burakdelice.dto.request.DoLoginRequestDto;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(EndPoints.AUTH)
public class AuthController {

    private final AuthService authService;


    //  http://localhost:9090/auth/login
    @PostMapping(EndPoints.LOGIN)
    public ResponseEntity<String> doLogin (@RequestBody @Valid DoLoginRequestDto dto) {
        return ResponseEntity.ok(authService.doLogin(dto));
    }


   //  http://localhost:9090/auth/register
    @PostMapping(EndPoints.REGISTER)
    public ResponseEntity<Auth> doRegister(@RequestBody @Valid DoRegisterRequestDto dto){
/*
        Auth auth = new Auth();
        auth.setUsername(dto.getUsername());
        auth.setEmail(dto.getEmail());
        auth.setPassword(dto.getPassword());
        authService.save(auth);
        return ResponseEntity.ok(auth);
*/

/*
        Auth auth = authService.save(
                Auth.builder()
                        .username(dto.getUsername())
                        .email(dto.getEmail())
                        .password(dto.getPassword())
                        .build()
        );
        return ResponseEntity.ok(auth);
        */

        if(!dto.getPassword().equals(dto.getRepassword()))
            throw new AuthServiceException(ErrorType.REGISTER_PASSWORD_MISMACTH);

            return ResponseEntity.ok(authService.doRegister(dto));
    }


/* // Tokensiz
    //  http://localhost:9090/auth/getall
    @GetMapping(GETALL)
    public ResponseEntity<List<Auth>> findAll () {
        return ResponseEntity.ok(authService.findAll());
    }
    */


    // Tokenli
    //  http://localhost:9090/auth/getall
    @GetMapping(EndPoints.GETALL)
    public ResponseEntity<List<Auth>> findAll (String token) {
        return ResponseEntity.ok(authService.findAll(token));
    }

    @GetMapping("/hi")
    public String info() {
        return "INFO: Auth Service";
    }

}
