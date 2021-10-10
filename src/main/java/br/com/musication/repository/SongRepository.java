package br.com.musication.repository;

import br.com.musication.domain.Song;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author macrusal on 10/10/21
 * @project musication
 */
@Repository
public interface SongRepository extends MongoRepository< Song, ObjectId > {

    Song findSongById(ObjectId id);

    List< Song > findAll();
}
