package br.com.musication.service;

import br.com.musication.domain.Location;
import br.com.musication.domain.mapper.LocationMapper;
import br.com.musication.domain.mapper.SongMapper;
import br.com.musication.domain.response.LocationResponse;
import br.com.musication.domain.response.SongResponse;
import br.com.musication.repository.SongRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author macrusal on 09/10/21
 * @project musication
 */
@Service
@AllArgsConstructor
public class MusicationService {

    private final SongRepository songRepository;
    private final DBService dbService;

    public ResponseEntity< LocationResponse > insert( Location location ) {
        return ResponseEntity.ok( LocationMapper.toResponse(dbService.getLocation()) );
    }

    public ResponseEntity< SongResponse > find( String id ) {
//        var song = Optional.of( songRepository.findSongById( new ObjectId(id) ))
//                .orElseThrow( SoundNotFoundException ::new );


//        return ResponseEntity.ok( SongMapper.toResponse(song) );
        return ResponseEntity.ok( SongMapper.toResponse(dbService.getSong()) );
    }

    public ResponseEntity< List< SongResponse >> findAll() {
//        var songs = Optional.of( songRepository.findAll( ))
//                .orElseThrow( SoundNotFoundException ::new );

//        return ResponseEntity.ok( SongMapper.toListResponse(songs) );

        return ResponseEntity.ok( SongMapper.toListResponse(dbService.findAll()) );
    }
}
