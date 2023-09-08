package com.burakdelice.service;


import com.burakdelice.dto.request.UserProfileSaveRequestDto;
import com.burakdelice.manager.IElasticServiceManager;
import com.burakdelice.mapper.IUserProfileMapper;
import com.burakdelice.rabbitmq.model.SaveAuthModel;
import com.burakdelice.repository.IUserProfileRepository;
import com.burakdelice.repository.entity.UserProfile;
import com.burakdelice.utility.ServiceManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService extends ServiceManager<UserProfile, Long> {

    private final IUserProfileRepository repository;
    private final IElasticServiceManager elasticServiceManager;


    public UserProfileService(IUserProfileRepository repository, IElasticServiceManager elasticServiceManager) {
        super(repository);
        this.repository = repository;
        this.elasticServiceManager = elasticServiceManager;
    }


    public Boolean saveDto(UserProfileSaveRequestDto dto) {
        /*
        UserProfile userProfile = new UserProfile();
        userProfile.setAuthId(dto.getAuthid());
        userProfile.setUsername(dto.getUsername());
        userProfile.setEmail(dto.getEmail());
        save(userProfile);
        */
        /*
        UserProfile userProfile = UserProfile.builder()
                .authid(dto.getAuthid())
                .username(dto.getUsername())
                .email(dto.getEmail())
                .build();
        save(userProfile);
        */
        /*
        save(UserProfile.builder()
                .authid(dto.getAuthid())
                .username(dto.getUsername())
                .email(dto.getEmail())
                .build());
        */
        save(IUserProfileMapper.INSTANCE.toUserProfile(dto));
        return true;
    }

    public void saveRabbit(SaveAuthModel model) {
        UserProfile userProfile = IUserProfileMapper.INSTANCE.toUserProfile(model);
        save(userProfile);
        elasticServiceManager.addUser(userProfile);
    }

    @Cacheable(value = "getUpperCase")
    public String getUpperCase(String firstName){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return firstName.toUpperCase();
    }
    @CacheEvict(value = "getUpperCase", allEntries = true)
    public void clearCache(){
        System.out.println("getUpperCase için oluşturulan Cache değerleri temizlendi.");
    }
}
