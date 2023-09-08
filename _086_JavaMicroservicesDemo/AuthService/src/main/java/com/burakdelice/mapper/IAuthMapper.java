package com.burakdelice.mapper;

import com.burakdelice.dto.request.DoRegisterRequestDto;
import com.burakdelice.dto.request.UserProfileSaveRequestDto;
import com.burakdelice.repository.entity.Auth;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IAuthMapper {

    IAuthMapper INSTANCE= Mappers.getMapper(IAuthMapper.class);

    Auth toAuth(final DoRegisterRequestDto dto);

    @Mapping(target = "authid",source = "id")
    UserProfileSaveRequestDto fromAuth (final Auth auth);

}
