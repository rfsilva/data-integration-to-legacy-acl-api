package br.com.rodrigo.dataintegration.acl.service.impl;

import br.com.rodrigo.dataintegration.acl.dto.*;
import br.com.rodrigo.dataintegration.acl.mapper.*;
import br.com.rodrigo.dataintegration.acl.model.*;
import br.com.rodrigo.dataintegration.acl.repository.*;
import br.com.rodrigo.dataintegration.acl.service.*;
import br.com.rodrigo.dataintegration.acl.service.legacysystem.*;
import lombok.extern.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Service
@Slf4j
public class ACLServiceImpl implements ACLService {

    @Autowired
    private MainObjectRepository mainObjectRepository;

    @Autowired
    private LegacyObjectClient legacyObjectClient;


    public Long insert(MainObjectDTO mainObject) {

        String legacyId = legacyObjectClient.insertLegacyObject(mainObject);
        log.info("LegacyID: {}", legacyId);
        log.info("Inserting the main object {}", mainObject.toString());
        MainObject res = mainObjectRepository.save(Mapper.toEntity(mainObject));
        return res.getSequential();
    }
}
