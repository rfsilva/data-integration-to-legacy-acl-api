package br.com.rodrigo.dataintegration.acl.repository;

import br.com.rodrigo.dataintegration.acl.model.*;
import org.springframework.data.mongodb.repository.*;

import java.util.*;

public interface MainObjectRepository extends MongoRepository<MainObject, String> {
    @Query("{ 'id': ?0 }")
    Optional<MainObject> findByMainObjectId(Long mainObjectId);
}
