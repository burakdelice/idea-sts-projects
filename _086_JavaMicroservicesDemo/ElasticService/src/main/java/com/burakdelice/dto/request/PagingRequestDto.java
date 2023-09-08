package com.burakdelice.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PagingRequestDto {

    private Integer pageSize;
    private Integer currentPage;
    private String sortParameter;
    private String direction;


}
