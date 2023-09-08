package com.burakdelice.manager;

import com.burakdelice.repository.entity.UserProfile;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import static com.burakdelice.constant.EndPoints.SAVE;

@FeignClient(name = "elastic-service-manager", url = "http://localhost:9101/elastic/user",decode404 = true)
public interface IElasticServiceManager {

    @PostMapping(SAVE)
    ResponseEntity<Boolean> addUser(@RequestBody UserProfile dto);
}
