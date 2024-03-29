package com.burakdelice.manager;

import com.burakdelice.dto.request.UserProfileSaveRequestDto;
import com.burakdelice.repository.entity.UserProfile;
import org.mapstruct.Mapping;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import static com.burakdelice.constant.EndPoints.SAVE;

@FeignClient(name = "user-profile-manager",url = "http://localhost:9093/user",decode404 = true)
public interface IUserProfileManager {
    @PostMapping(SAVE)
    ResponseEntity<Boolean> save(@RequestBody UserProfileSaveRequestDto dto);

//    @Mapping(source = "id",target = "userProfileId")
//    UserProfile toUserProfile(final UserProfileSaveRequestDto dto);
}
