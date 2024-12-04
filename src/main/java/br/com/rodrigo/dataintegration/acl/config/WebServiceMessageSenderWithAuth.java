package br.com.rodrigo.dataintegration.acl.config;

import br.com.rodrigo.dataintegration.acl.service.legacysystem.*;
import org.springframework.ws.transport.http.*;

import java.io.*;
import java.net.*;

public class WebServiceMessageSenderWithAuth extends HttpUrlConnectionMessageSender {

    private final SSOConfig ssoConfig;
    private final TokenGenerator tokenGenerator;

    public WebServiceMessageSenderWithAuth(SSOConfig ssoConfig, TokenGenerator tokenGenerator) {
        this.ssoConfig = ssoConfig;
        this.tokenGenerator = tokenGenerator;
    }

    @Override
    protected void prepareConnection(HttpURLConnection connection)
            throws IOException {

        String token = tokenGenerator.getAccessToken(ssoConfig.getClientId(), ssoConfig.getClientSecret());
        connection.setRequestProperty("Authorization", token);
        super.prepareConnection(connection);
    }
}