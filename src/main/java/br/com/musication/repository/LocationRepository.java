package br.com.musication.repository;

import br.com.musication.domain.Location;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author macrusal on 10/10/21
 * @project musication
 */
@Repository
public interface LocationRepository extends MongoRepository< Location, ObjectId > {
}
