package br.com.musication.service;

import br.com.musication.domain.Location;
import br.com.musication.domain.Song;
import br.com.musication.repository.LocationRepository;
import br.com.musication.repository.SongRepository;
import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

/**
 * @author macrusal on 10/10/21
 * @project musication
 */
@Service
@AllArgsConstructor
public class DBService {

    private final LocationRepository locationRepository;

    private final SongRepository songRepository;

    public void instantiateTestDataBase() throws ParseException {

        Location location = Location.builder()
                .latitude( Double.valueOf( "-23.5874162" ) )
                .longitude( Double.valueOf( "-46.6598223" ) )
                .build();

        Song song1 = Song.builder()
                .id( new ObjectId() )
                .musicArtist( "Lambertos" )
                .musicName( "Sereníssima Acústico" )
                .urlTrack( "https://65381g.ha.azioncdn.net/d/7/4/e/lambertos-serenissima-acustico-a477a043.mp3" )
                .build();
        Song song2 = Song.builder()
                .id( new ObjectId() )
                .musicArtist( "Lambertos" )
                .musicName( "Que País É Esse Acústico" )
                .urlTrack( "https://65381g.ha.azioncdn.net/1/d/c/7/lambertos-que-pais-e-esse-acustico-39a410c8.mp3" )
                .build();
        Song song3 = Song.builder()
                .id( new ObjectId() )
                .musicArtist( "Lambertos" )
                .musicName( "Tempo Perdido Acústico" )
                .urlTrack( "https://65381g.ha.azioncdn.net/0/1/6/3/lambertos-tempo-perdido-acustico-64960fa8.mp3" )
                .build();
        Song song4 = Song.builder()
                .id( new ObjectId() )
                .musicArtist( "Lambertos" )
                .musicName( "Vento No Litoral Acústico" )
                .urlTrack( "https://65381g.ha.azioncdn.net/2/f/5/3/lambertos-vento-no-litoral-acustico-8ea98049.mp3" )
                .build();
        Song song5 = Song.builder()
                .id( new ObjectId() )
                .musicArtist( "Lambertos" )
                .musicName( "Que País É Esse Acústico" )
                .urlTrack( "https://65381g.ha.azioncdn.net/1/d/c/7/lambertos-que-pais-e-esse-acustico-39a410c8.mp3" )
                .build();
    }

    public Location getLocation() {
        return Location.builder()
                .latitude( Double.valueOf( "-23.5874162" ) )
                .longitude( Double.valueOf( "-46.6598223" ) )
                .build();
    }

    public List<Song> findAll() {

        Song song1 = Song.builder()
                .id( new ObjectId() )
                .musicArtist( "Lambertos" )
                .musicName( "Sereníssima Acústico" )
                .urlTrack( "https://65381g.ha.azioncdn.net/d/7/4/e/lambertos-serenissima-acustico-a477a043.mp3" )
                .build();
        Song song2 = Song.builder()
                .id( new ObjectId() )
                .musicArtist( "Lambertos" )
                .musicName( "Que País É Esse Acústico" )
                .urlTrack( "https://65381g.ha.azioncdn.net/1/d/c/7/lambertos-que-pais-e-esse-acustico-39a410c8.mp3" )
                .build();
        Song song3 = Song.builder()
                .id( new ObjectId() )
                .musicArtist( "Lambertos" )
                .musicName( "Tempo Perdido Acústico" )
                .urlTrack( "https://65381g.ha.azioncdn.net/0/1/6/3/lambertos-tempo-perdido-acustico-64960fa8.mp3" )
                .build();
        Song song4 = Song.builder()
                .id( new ObjectId() )
                .musicArtist( "Lambertos" )
                .musicName( "Vento No Litoral Acústico" )
                .urlTrack( "https://65381g.ha.azioncdn.net/2/f/5/3/lambertos-vento-no-litoral-acustico-8ea98049.mp3" )
                .build();
        Song song5 = Song.builder()
                .id( new ObjectId() )
                .musicArtist( "Lambertos" )
                .musicName( "Que País É Esse Acústico" )
                .urlTrack( "https://65381g.ha.azioncdn.net/1/d/c/7/lambertos-que-pais-e-esse-acustico-39a410c8.mp3" )
                .build();

        return Arrays.asList( song1, song2, song3,
                song4, song5);
    }

    public Song getSong() {
        return  Song.builder()
                .id( new ObjectId() )
                .musicArtist( "Lambertos" )
                .musicName( "Sereníssima Acústico" )
                .urlTrack( "https://65381g.ha.azioncdn.net/d/7/4/e/lambertos-serenissima-acustico-a477a043.mp3" )
                .build();
    }
}
