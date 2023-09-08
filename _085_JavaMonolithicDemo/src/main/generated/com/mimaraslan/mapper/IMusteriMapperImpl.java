package com.mimaraslan.mapper;

import com.mimaraslan.dto.request.MusteriSaveRequestDto;
import com.mimaraslan.dto.response.MusteriFindAllResponseDto;
import com.mimaraslan.repository.entity.Musteri;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-17T14:05:12+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8 (Amazon.com Inc.)"
)
@Component
public class IMusteriMapperImpl implements IMusteriMapper {

    @Override
    public MusteriFindAllResponseDto fromMusteri(Musteri musteri) {
        if ( musteri == null ) {
            return null;
        }

        MusteriFindAllResponseDto.MusteriFindAllResponseDtoBuilder musteriFindAllResponseDto = MusteriFindAllResponseDto.builder();

        musteriFindAllResponseDto.username( musteri.getUsername() );
        musteriFindAllResponseDto.ad( musteri.getAd() );
        musteriFindAllResponseDto.img( musteri.getImg() );

        return musteriFindAllResponseDto.build();
    }

    @Override
    public Musteri fromSaveRequestDto(MusteriSaveRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        Musteri.MusteriBuilder musteri = Musteri.builder();

        musteri.ad( dto.getAd() );
        musteri.adres( dto.getAdres() );
        musteri.tel( dto.getTel() );

        return musteri.build();
    }
}
