package br.com.musication.domain.mapper;

import br.com.musication.domain.Song;
import br.com.musication.domain.response.SongResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author macrusal on 10/10/21
 * @project musication
 */
@Component
public class SongMapper {

    public static SongResponse toResponse( Song song ) {
        return SongResponse.builder()
                .musicArtist( song.getMusicArtist() )
                .musicName( song.getMusicName() )
                .urlTrack( song.getUrlTrack() )
                .build();
    }

    public static List<SongResponse> toListResponse( List<Song> songs ) {

        return songs.stream()
                .map( song -> SongResponse.builder()
                        .musicArtist( song.getMusicArtist() )
                        .musicName( song.getMusicName() )
                        .urlTrack( song.getUrlTrack() )
                        .build() )
                .collect( Collectors.toList() );
    }
}
