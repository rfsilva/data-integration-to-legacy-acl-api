package br.com.rodrigo.dataintegration.acl.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ErrorDTO {

    private String code;
    private String description;
}
