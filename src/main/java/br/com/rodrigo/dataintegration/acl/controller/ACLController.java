package br.com.rodrigo.dataintegration.acl.controller;

import br.com.rodrigo.dataintegration.acl.dto.*;
import br.com.rodrigo.dataintegration.acl.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.net.*;

@RestController
@RequestMapping("/api")
public class ACLController {

    @Autowired
    private ACLService aclService;

    @PostMapping
    public ResponseEntity<Long> insert(@RequestBody MainObjectDTO mainObject) {
        Long mainObjectId = aclService.insert(mainObject);
        String s = "/" + mainObjectId;
        return ResponseEntity.created(URI.create(s)).body(mainObjectId);
    }
}
