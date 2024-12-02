package br.com.rodrigo.dataintegration.acl.mapper;

import br.com.rodrigo.dataintegration.acl.dto.*;
import br.com.rodrigo.dataintegration.acl.model.*;

import java.time.*;
import java.util.*;

public final class Mapper {

    private Mapper() {}

    public static MainObject toEntity(MainObjectDTO obj) {
        return MainObject.builder()
                .uuid(UUID.randomUUID().toString())
                .channel(obj.getChannel())
                .correlationId(obj.getCorrelationId())
                .conversionStatus(obj.getConversionStatus())
                .mainData(obj.getMainData())
                .option(obj.getOption())
                .networkIpAddress(obj.getNetworkIpAddress())
                .date(LocalDate.now())
                .description(obj.getDescription())
                .stepCode(obj.getStepCode())
                .sequential(new Random().nextLong(100))
                .build();
    }
}
