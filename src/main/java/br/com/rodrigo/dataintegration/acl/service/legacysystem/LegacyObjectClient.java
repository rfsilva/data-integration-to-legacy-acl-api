package br.com.rodrigo.dataintegration.acl.service.legacysystem;

import br.com.rodrigo.dataintegration.acl.config.*;
import br.com.rodrigo.dataintegration.acl.dto.*;
import br.com.rodrigo.legacysystem.model.gen.Object;
import br.com.rodrigo.legacysystem.model.gen.*;
import jakarta.annotation.*;
import lombok.extern.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.oxm.jaxb.*;
import org.springframework.stereotype.*;
import org.springframework.ws.client.core.support.*;
import org.springframework.ws.soap.client.core.*;

@Slf4j
@Service
public class LegacyObjectClient extends WebServiceGatewaySupport {

    @Autowired
    private TokenGenerator tokenGenerator;

    @Autowired
    private SSOConfig ssoConfig;

    public LegacyObjectClient() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("br.com.rodrigo.legacysystem.model.gen");
        setDefaultUri("http://localhost:8084/ws");
        setMarshaller(marshaller);
        setUnmarshaller(marshaller);
    }

    @PostConstruct
    public void postConstruct() {
        getWebServiceTemplate().setMessageSender(new WebServiceMessageSenderWithAuth(ssoConfig, tokenGenerator));
    }

    public String insertLegacyObject(MainObjectDTO mainObject) {

        Object legacyObject = new Object();
        legacyObject.setChannel(mainObject.getChannel());
        legacyObject.setDescription(mainObject.getDescription());
        legacyObject.setConversionStatus(mainObject.getConversionStatus());
        legacyObject.setCorrelationId(mainObject.getCorrelationId());
        legacyObject.setOption(mainObject.getOption());
        legacyObject.setMainData(mainObject.getMainData());
        legacyObject.setStepCode(mainObject.getStepCode());
        legacyObject.setNetworkIpAddress(mainObject.getNetworkIpAddress());

        InsertObject request = new InsertObject();
        request.setObject(legacyObject);

        log.info("Requesting the insertion of the following object: " + legacyObject);

        try {
            InsertObjectResponse response = (InsertObjectResponse) getWebServiceTemplate()
                  .marshalSendAndReceive("http://localhost:8084/ws/legacyObjectInsertion", request,
                          new SoapActionCallback(
                                  "http://www.rodrigo.com.br/dataintegration/model/gen/InsertObject"));

            return response.getLegacyId();
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return null;
    }
}