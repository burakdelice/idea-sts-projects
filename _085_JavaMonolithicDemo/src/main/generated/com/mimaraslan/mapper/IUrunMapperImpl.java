package com.mimaraslan.mapper;

import com.mimaraslan.dto.request.UrunSaveRequestDto;
import com.mimaraslan.dto.response.UrunFindAllResponseDto;
import com.mimaraslan.repository.entity.Urun;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-17T14:05:12+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8 (Amazon.com Inc.)"
)
@Component
public class IUrunMapperImpl implements IUrunMapper {

    @Override
    public Urun toUrun(UrunSaveRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        Urun.UrunBuilder urun = Urun.builder();

        urun.ad( dto.getAd() );
        urun.marka( dto.getMarka() );
        urun.model( dto.getModel() );
        urun.fiyat( dto.getFiyat() );

        return urun.build();
    }

    @Override
    public UrunFindAllResponseDto fromUrun(Urun urun) {
        if ( urun == null ) {
            return null;
        }

        UrunFindAllResponseDto.UrunFindAllResponseDtoBuilder urunFindAllResponseDto = UrunFindAllResponseDto.builder();

        urunFindAllResponseDto.ad( urun.getAd() );
        urunFindAllResponseDto.marka( urun.getMarka() );
        urunFindAllResponseDto.fiyat( urun.getFiyat() );

        return urunFindAllResponseDto.build();
    }
}
