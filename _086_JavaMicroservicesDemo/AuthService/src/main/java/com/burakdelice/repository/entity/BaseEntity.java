package com.burakdelice.repository.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.MappedSuperclass;

//@Builder // bir sınıftan nesne türetmeyi sağlar.
@SuperBuilder
@MappedSuperclass
@Data //get set metodlarını otomatik tanımlar.
@NoArgsConstructor //boş constructor oluşturur.
@AllArgsConstructor //dolu constructor oluşturur.
public class BaseEntity {

    private  Long createAt;
    private boolean state;
}
