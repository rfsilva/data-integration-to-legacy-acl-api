package br.com.rodrigo.dataintegration.acl.config;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Configuration
public class SSOConfig {

    @Value("${service.token-path}")
    private String tokenPath;

    @Value("${service.legacy-system.host}")
    private String host;

    @Value("${service.legacy-system.client-id}")
    private String clientId;

    @Value("${service.legacy-system.client-secret}")
    private String clientSecret;
}
