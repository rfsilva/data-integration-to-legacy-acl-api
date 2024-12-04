package br.com.rodrigo.dataintegration.acl.service.legacysystem;

import br.com.rodrigo.dataintegration.acl.dto.*;
import br.com.rodrigo.dataintegration.acl.exception.*;
import com.fasterxml.jackson.databind.*;
import lombok.extern.log4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.reactive.function.client.*;

import java.io.*;
import java.util.*;

@Service
@Log4j2
public class HttpProvider {
	
	private final ObjectMapper objectMapper;
	
	@Autowired
	public HttpProvider(ObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
	}
    
    public <B, R> R post(String baseUrl, Map<String, String> headers, B body,
                         Class<R> type) {

        try {
	        return WebClient.create(baseUrl)
	            .post()
	            .headers(h -> h.setAll(headers))
	            .bodyValue(body)
	            .retrieve()
	            .bodyToMono(type)
	            .block();
        } catch (WebClientResponseException e) {
            log.error("Erro na requisição", e);

            try {
                return objectMapper.readValue(e.getResponseBodyAsByteArray(), type);
            } catch (IOException ex) {
                log.error("Erro ao acessar api", ex);
                throw new ApiException(e, baseUrl, ErrorDTO.builder().code("500").description(e.getMessage()).build());
            }
        }
    }
}