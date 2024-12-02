package br.com.rodrigo.dataintegration.acl.dto;


import lombok.*;

import java.io.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class MainObjectDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private String description;
    private String correlationId;
    private String mainData;
    private String option;
    private String conversionStatus;
    private String channel;
    private String stepCode;
    private String networkIpAddress;

}
