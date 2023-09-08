package com.burakdelice.controller;

import com.burakdelice.dto.request.PagingRequestDto;
import com.burakdelice.dto.request.UserProfileSaveRequestDto;
import com.burakdelice.repository.entity.UserProfile;
import com.burakdelice.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.jaxb.SpringDataJaxb;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.burakdelice.constant.EndPoints.*;


//http://localhost:9100/elastic/user
@RequiredArgsConstructor
@RestController
@RequestMapping(ELASTIC+USER)
public class UserProfileController {

    private final UserProfileService userProfileService;

    // https://localhost:9100/elastic/user/save
    @PostMapping(SAVE)
    public ResponseEntity<Boolean> save(@RequestBody UserProfileSaveRequestDto dto){
        userProfileService.saveDto(dto);
        return ResponseEntity.ok().build();
    }

    @GetMapping(GETALL)
    public ResponseEntity<Iterable<UserProfile>> getAll(){
        return ResponseEntity.ok(userProfileService.findAll());
    }

    // http://localhost:9100/elastic/user/getall
    @PostMapping(GETALLPAGE)
    public ResponseEntity<Page<UserProfile>> getAll(@RequestBody PagingRequestDto dto){
        return ResponseEntity.ok(userProfileService.findAll(dto));
    }

    // http://localhost:9100/elastic/user/hi
    @GetMapping("/hi")
    public String info() {
        return "HI: Elastic Service";
    }

    // http://localhost:9100/elastic/user/getallvip
    @GetMapping(GETALLVIP)
    @PreAuthorize("hasAuthority('VIP')")
    public ResponseEntity<Iterable<UserProfile>> getAllVip(){
        return ResponseEntity.ok(userProfileService.findAll());
    }

    // http://localhost:9100/elastic/user/getallmanager
    @GetMapping(GETALLMANAGER)
    @PreAuthorize("hasAuthority('MANAGER')")
    public ResponseEntity<Iterable<UserProfile>> getAllManager(){
        return ResponseEntity.ok(userProfileService.findAll());
    }
    // http://localhost:9100/elastic/user/delete
    @GetMapping(DELETE)
    public ResponseEntity<Void>  deleteUser(@RequestBody Long authid){
        return userProfileService.deleteByAuthId(authid);
    }
}
