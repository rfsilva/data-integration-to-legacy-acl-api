package br.com.rodrigo.dataintegration.acl.model;

import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.*;

import java.time.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collection = "MainObject")
public class MainObject {

    @Id
    private String uuid;
    private Long id;
    private String description;
    private String correlationId;
    private String mainData;
    private String option;
    private String conversionStatus;
    private String channel;
    private String stepCode;
    private String networkIpAddress;
    private LocalDate date;
    private Long sequential;

}
