package com.burakdelice.service;

import com.burakdelice.dto.request.PagingRequestDto;
import com.burakdelice.dto.request.UserProfileSaveRequestDto;
import com.burakdelice.mapper.IUserProfileMapper;
import com.burakdelice.repository.IUserProfileRepository;
import com.burakdelice.repository.entity.UserProfile;
import com.burakdelice.utility.ServiceManager;
import org.mapstruct.control.MappingControl;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.jaxb.SpringDataJaxb;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserProfileService extends ServiceManager<UserProfile, Long> {

    private final IUserProfileRepository iUserProfileRepository;


    public UserProfileService(IUserProfileRepository iUserProfileRepository) {
        super(iUserProfileRepository);
        this.iUserProfileRepository = iUserProfileRepository;
    }
    public void saveDto(UserProfileSaveRequestDto dto){
      //  if(!iUserProfileRepository.existsUserProfileById(dto.getId())) {
            save(IUserProfileMapper.INSTANCE.toUserProfile(dto));
        //    return true;
       // }
        //return false;
    }

    public Page<UserProfile> findAll(PagingRequestDto dto){
        Pageable pageable = null;
        Sort sort = null;
        if (dto.getSortParameter()!= null){
            String direction = dto.getDirection()=="ASC" ? "ASC" : dto.getDirection();
            sort = Sort.by(Sort.Direction.fromString(direction), String.valueOf(dto.getSortParameter()));
        }
        Integer pageSize = dto.getPageSize() == null ? 10 : dto.getPageSize() < 1 ? 10: dto.getPageSize();

        if(sort != null && dto.getCurrentPage() != null){
            pageable = PageRequest.of(dto.getCurrentPage(),pageSize, sort);
        }else if(sort != null && dto.getCurrentPage() != null) {
            pageable = PageRequest.of(dto.getCurrentPage(), pageSize);
        }else{
            pageable = PageRequest.of(0,pageSize);
        }
        return iUserProfileRepository.findAll(pageable);

    }
    public Optional<UserProfile> findOptionalByAuthId(Long authid){
        return iUserProfileRepository.findOptionalByAuthid(authid);
    }

    public ResponseEntity<Void> deleteByAuthId(Long authid) {
        iUserProfileRepository.deleteOptionalByAuthid(authid);
        return null;
    }
}
